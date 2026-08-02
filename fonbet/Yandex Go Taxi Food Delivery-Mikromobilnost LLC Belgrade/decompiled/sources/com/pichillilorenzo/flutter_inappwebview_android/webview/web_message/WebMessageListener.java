package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import defpackage.b64;
import defpackage.c7x;
import defpackage.da20;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.ih41;
import defpackage.oyr;
import defpackage.qm41;
import defpackage.tt5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class WebMessageListener implements Disposable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;
    public String id;
    public String jsObjectName;
    public qm41 listener;
    public c7x replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, tt5 tt5Var, String str2, Set<String> set) {
        this.id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new ea20(tt5Var, METHOD_CHANNEL_NAME_PREFIX + this.id + "_" + this.jsObjectName));
        if (this.webView instanceof InAppWebView) {
            this.listener = new qm41() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                @Override // defpackage.qm41
                public void onPostMessage(WebView webView, ih41 ih41Var, Uri uri, boolean z, c7x c7xVar) {
                    WebMessageListener webMessageListener = WebMessageListener.this;
                    webMessageListener.replyProxy = c7xVar;
                    WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
                    if (webMessageListenerChannelDelegate != null) {
                        webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(ih41Var), uri.toString().equals("null") ? null : uri.toString(), z);
                    }
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, tt5 tt5Var, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, tt5Var, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() {
        int i = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception(oyr.j(i, "allowedOriginRules[", "] is null"));
            }
            if (str.isEmpty()) {
                throw new Exception(oyr.j(i, "allowedOriginRules[", "] is empty"));
            }
            if (!"*".equals(str)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                int port = parse.getPort();
                if (scheme == null) {
                    throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                }
                if (("http".equals(scheme) || Constants.SCHEME.equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                }
                if (!"http".equals(scheme) && !Constants.SCHEME.equals(scheme) && (host != null || port != -1)) {
                    throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                }
                if (!path.isEmpty()) {
                    throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                }
                if (host != null) {
                    int indexOf = host.indexOf("*");
                    if (indexOf != 0 || (indexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception(oyr.p("allowedOriginRules ", str, " is invalid"));
                        }
                    }
                }
                i++;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        if (this.webView != null) {
            String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str : this.allowedOriginRules) {
                if ("*".equals(str)) {
                    arrayList.add("'*'");
                } else {
                    Uri parse = Uri.parse(str);
                    String str2 = parse.getHost() != null ? "'" + Util.replaceAll(parse.getHost(), "'", "\\'") + "'" : "null";
                    StringBuilder sb = new StringBuilder("{scheme: '");
                    sb.append(parse.getScheme());
                    sb.append("', host: ");
                    sb.append(str2);
                    sb.append(", port: ");
                    sb.append(parse.getPort() != -1 ? Integer.valueOf(parse.getPort()) : "null");
                    sb.append("}");
                    arrayList.add(sb.toString());
                }
            }
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, oyr.t(b64.v("(function() {  var allowedOriginRules = [", TextUtils.join(Extension.FIX_SPACE, arrayList), "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.flutter_inappwebview._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['", replaceAll, "'] = new FlutterInAppWebViewWebMessageListener('"), replaceAll, "');  }})();"), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|(2:72|(1:74)(1:75))(1:21)|(2:69|(1:71))(1:24)|25|(8:29|30|31|32|33|(1:63)(1:48)|(1:50)|(2:56|57))|68|31|32|33|(1:35)|63|(0)|(1:62)(4:52|54|56|57)) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isOriginAllowed(String str, String str2, int i) {
        String str3;
        boolean equals;
        Iterator<String> it = this.allowedOriginRules.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            if ("*".equals(next)) {
                return true;
            }
            if (str != null && !str.isEmpty() && (!str.isEmpty() || ((str2 != null && !str2.isEmpty()) || (i != 0 && i != -1)))) {
                Uri parse = Uri.parse(next);
                int i2 = 80;
                int port = (parse.getPort() == -1 || parse.getPort() == 0) ? Constants.SCHEME.equals(parse.getScheme()) ? 443 : 80 : parse.getPort();
                if (i != 0 && i != -1) {
                    i2 = i;
                } else if (Constants.SCHEME.equals(str)) {
                    i2 = 443;
                }
                String str4 = null;
                if (parse.getHost() != null && parse.getHost().startsWith("[")) {
                    try {
                        str3 = Util.normalizeIPv6(parse.getHost().substring(1, parse.getHost().length() - 1));
                    } catch (Exception unused) {
                    }
                    str4 = Util.normalizeIPv6(str2);
                    equals = parse.getScheme().equals(str);
                    boolean z = parse.getHost() != null || parse.getHost().isEmpty() || parse.getHost().equals(str2) || (parse.getHost().startsWith("*") && str2 != null && str2.contains(parse.getHost().split("\\*")[1])) || !(str4 == null || str3 == null || !str4.equals(str3));
                    boolean z2 = port == i2;
                    if (equals && z && z2) {
                        return true;
                    }
                }
                str3 = null;
                str4 = Util.normalizeIPv6(str2);
                equals = parse.getScheme().equals(str);
                if (parse.getHost() != null) {
                }
                if (port == i2) {
                }
                if (equals) {
                    return true;
                }
                continue;
            }
        }
    }

    public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, da20 da20Var) {
        Object data;
        if (this.replyProxy != null && hm91.d("WEB_MESSAGE_LISTENER") && (data = webMessageCompatExt.getData()) != null) {
            if (hm91.d("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
                this.replyProxy.b((byte[]) data);
            } else {
                this.replyProxy.a(data.toString());
            }
        }
        da20Var.success(Boolean.TRUE);
    }
}
