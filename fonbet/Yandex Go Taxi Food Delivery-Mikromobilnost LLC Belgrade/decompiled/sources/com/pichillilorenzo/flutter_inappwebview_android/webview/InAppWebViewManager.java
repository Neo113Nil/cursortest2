package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import defpackage.da20;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.im91;
import defpackage.nq41;
import defpackage.qp41;
import defpackage.rm41;
import defpackage.x920;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z) {
        WebView webView = new WebView(context);
        webView.clearCache(z);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
        while (it.hasNext()) {
            String str = it.next().keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, final da20 da20Var) {
        Context context;
        String str = x920Var.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1496477679:
                if (str.equals("disableWebView")) {
                    c = 0;
                    break;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -633518365:
                if (str.equals("getVariationsHeader")) {
                    c = 2;
                    break;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c = 3;
                    break;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c = 4;
                    break;
                }
                break;
            case 426229521:
                if (str.equals("setSafeBrowsingAllowlist")) {
                    c = 5;
                    break;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c = 6;
                    break;
                }
                break;
            case 1033609166:
                if (str.equals("clearAllCache")) {
                    c = 7;
                    break;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c = '\b';
                    break;
                }
                break;
            case 1667434977:
                if (str.equals("isMultiProcessEnabled")) {
                    c = '\t';
                    break;
                }
                break;
            case 1867011305:
                if (str.equals("disposeKeepAlive")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                WebView.disableWebView();
                da20Var.success(Boolean.TRUE);
                return;
            case 1:
                WebView.setWebContentsDebuggingEnabled(((Boolean) x920Var.a("debuggingEnabled")).booleanValue());
                da20Var.success(Boolean.TRUE);
                return;
            case 2:
                if (!hm91.d("GET_VARIATIONS_HEADER")) {
                    da20Var.success(null);
                    return;
                }
                Uri uri = rm41.a;
                if (!qp41.L.a()) {
                    throw qp41.a();
                }
                da20Var.success(nq41.a.getStatics().getVariationsHeader());
                return;
            case 3:
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        da20Var.success(Boolean.TRUE);
                    }
                });
                return;
            case 4:
                if (!hm91.d("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    da20Var.success(null);
                    return;
                }
                Uri uri2 = rm41.a;
                qp41.g.getClass();
                da20Var.success(WebView.getSafeBrowsingPrivacyPolicyUrl().toString());
                return;
            case 5:
                if (hm91.d("SAFE_BROWSING_ALLOWLIST")) {
                    rm41.e(new HashSet((List) x920Var.a("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            da20Var.success(bool);
                        }
                    });
                    return;
                }
                if (!hm91.d("SAFE_BROWSING_WHITELIST")) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                List list = (List) x920Var.a("hosts");
                ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Boolean bool) {
                        da20Var.success(bool);
                    }
                };
                Uri uri3 = rm41.a;
                rm41.e(new HashSet(list), valueCallback);
                return;
            case 6:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    da20Var.success(WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext));
                    return;
                } else {
                    da20Var.success(null);
                    return;
                }
            case 7:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) x920Var.a("includeDiskFiles")).booleanValue());
                    }
                }
                da20Var.success(Boolean.TRUE);
                return;
            case '\b':
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo b = context != null ? rm41.b(context) : null;
                da20Var.success(b != null ? convertWebViewPackageToMap(b) : null);
                return;
            case '\t':
                if (!hm91.d("MULTI_PROCESS")) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                Uri uri4 = rm41.a;
                if (!qp41.F.a()) {
                    throw qp41.a();
                }
                da20Var.success(Boolean.valueOf(im91.g().getStatics().isMultiProcessEnabled()));
                return;
            case '\n':
                String str2 = (String) x920Var.a("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                da20Var.success(Boolean.TRUE);
                return;
            default:
                da20Var.notImplemented();
                return;
        }
    }
}
