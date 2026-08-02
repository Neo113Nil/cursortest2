package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.a;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import defpackage.hm91;
import defpackage.xs41;
import defpackage.ys41;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class InAppWebViewRenderProcessClient extends ys41 {
    protected static final String LOG_TAG = "IAWRenderProcessClient";

    public void dispose() {
    }

    @Override // defpackage.ys41
    public void onRenderProcessResponsive(WebView webView, final xs41 xs41Var) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewChannelDelegate.RenderProcessResponsiveCallback renderProcessResponsiveCallback = new WebViewChannelDelegate.RenderProcessResponsiveCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.2
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str, String str2, Object obj) {
                StringBuilder a = a.a(str, Extension.FIX_SPACE);
                if (str2 == null) {
                    str2 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str2, InAppWebViewRenderProcessClient.LOG_TAG);
                defaultBehaviour((Integer) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Integer num) {
                if (xs41Var == null) {
                    return true;
                }
                if (num.intValue() != 0 || !hm91.d("WEB_VIEW_RENDERER_TERMINATE")) {
                    return false;
                }
                xs41Var.a();
                return false;
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Integer num) {
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onRenderProcessResponsive(inAppWebView.getUrl(), renderProcessResponsiveCallback);
        } else {
            renderProcessResponsiveCallback.defaultBehaviour(null);
        }
    }

    @Override // defpackage.ys41
    public void onRenderProcessUnresponsive(WebView webView, final xs41 xs41Var) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewChannelDelegate.RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str, String str2, Object obj) {
                StringBuilder a = a.a(str, Extension.FIX_SPACE);
                if (str2 == null) {
                    str2 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str2, InAppWebViewRenderProcessClient.LOG_TAG);
                defaultBehaviour((Integer) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Integer num) {
                if (xs41Var == null) {
                    return true;
                }
                if (num.intValue() != 0 || !hm91.d("WEB_VIEW_RENDERER_TERMINATE")) {
                    return false;
                }
                xs41Var.a();
                return false;
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Integer num) {
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onRenderProcessUnresponsive(inAppWebView.getUrl(), renderProcessUnresponsiveCallback);
        } else {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
        }
    }
}
