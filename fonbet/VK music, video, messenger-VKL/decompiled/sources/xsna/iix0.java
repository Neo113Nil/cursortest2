package xsna;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vk.dto.common.id.UserId;
import xsna.y390;

/* compiled from: WebViewBottomSheet.kt */
/* loaded from: classes2.dex */
public final class iix0 extends ay90 {
    public final /* synthetic */ hix0 g;
    public final /* synthetic */ f98 h;

    /* compiled from: WebViewBottomSheet.kt */
    public static final class a extends WebViewClient {
        public final /* synthetic */ f98 a;

        public a(f98 f98Var) {
            this.a = f98Var;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            String str = null;
            if (sslError != null && (url = sslError.getUrl()) != null && !drm0.N(url)) {
                str = url;
            }
            if (str != null) {
                dsw<UserId, v390> dswVar = y390.a;
                if (y390.a.a().d(str)) {
                    String concat = "WebViewBottomSheet: skip SSL for ".concat(str);
                    if (qex0.c) {
                        xgx0.a.getClass();
                        xgx0.a(concat);
                    }
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            f98 f98Var = this.a;
            if (f98Var != null) {
                f98Var.e(str);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iix0(v6j v6jVar, hix0 hix0Var, f98 f98Var) {
        super(v6jVar);
        this.g = hix0Var;
        this.h = f98Var;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.g.hide();
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Object obj = message.obj;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new a(this.h));
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
