/**
* Copyright (C) 2008 Happy Fish / YuQing
*
* FastDFS Java Client may be copied only under the terms of the GNU Lesser
* General Public License (LGPL).
* Please visit the FastDFS Home Page http://www.csource.org/ for more detail.
**/

package org.csource_.fastdfs;

import java.net.*;
import java.io.*;

/**
* Global variables
* @author Happy Fish / YuQing
* @version Version 1.11
*/
public class ClientGlobal
{
	public static int g_connect_timeout; //millisecond
	public static int g_network_timeout; //millisecond
	public static String g_charset;
	public static int g_tracker_http_port;
	public static boolean g_anti_steal_token;  //if anti-steal token
	public static String g_secret_key;   //generage token secret key
	public static TrackerGroup g_tracker_group;
	
	public static final int DEFAULT_CONNECT_TIMEOUT = 5;  //second
	public static final int DEFAULT_NETWORK_TIMEOUT = 30; //second
	
	//guanleiming add
	public static String groupName="group1";	//默认的组
	public static Boolean debug=false;	//是否开启调试，在控制台打印相关运行日志
	public static String defaultSuffix=null;	//如果上传时没有找到文件的后缀，则以此为后缀进行上传
	
	private ClientGlobal()
	{
	}
	
/**
* construct Socket object
* @param ip_addr ip address or hostname
* @param port port number
* @return connected Socket object
*/
	public static Socket getSocket(String ip_addr, int port) throws IOException
	{
		Socket sock = new Socket();
		sock.setSoTimeout(ClientGlobal.g_network_timeout);
		sock.connect(new InetSocketAddress(ip_addr, port), ClientGlobal.g_connect_timeout);
		return sock;
	}
	
/**
* construct Socket object
* @param addr InetSocketAddress object, including ip address and port
* @return connected Socket object
*/
	public static Socket getSocket(InetSocketAddress addr) throws IOException
	{
		Socket sock = new Socket();
		sock.setSoTimeout(ClientGlobal.g_network_timeout);
		sock.connect(addr, ClientGlobal.g_connect_timeout);
		return sock;
	}
	
	public static int getG_connect_timeout()
	{
		return g_connect_timeout;
	}
	
	public static void setG_connect_timeout(int connect_timeout)
	{
		ClientGlobal.g_connect_timeout = connect_timeout;
	}
	
	public static int getG_network_timeout()
	{
		return g_network_timeout;
	}
	
	public static void setG_network_timeout(int network_timeout)
	{
		ClientGlobal.g_network_timeout = network_timeout;
	}
	
	public static String getG_charset()
	{
		return g_charset;
	}
	
	public static void setG_charset(String charset)
	{
		ClientGlobal.g_charset = charset;
	}
	
	public static int getG_tracker_http_port()
	{
		return g_tracker_http_port;
	}
	
	public static void setG_tracker_http_port(int tracker_http_port)
	{
		ClientGlobal.g_tracker_http_port = tracker_http_port;
	}
	
	public static boolean getG_anti_steal_token()
	{
		return g_anti_steal_token;
	}
	
	public static boolean isG_anti_steal_token()
	{
		return g_anti_steal_token;
	}
	
	public static void setG_anti_steal_token(boolean anti_steal_token)
	{
		ClientGlobal.g_anti_steal_token = anti_steal_token;
	}
	
	public static String getG_secret_key()
	{
		return g_secret_key;
	}
	
	public static void setG_secret_key(String secret_key)
	{
		ClientGlobal.g_secret_key = secret_key;
	}
	
	public static TrackerGroup getG_tracker_group()
	{
		return g_tracker_group;
	}
	
	public static void setG_tracker_group(TrackerGroup tracker_group)
	{
		ClientGlobal.g_tracker_group = tracker_group;
	}
}
