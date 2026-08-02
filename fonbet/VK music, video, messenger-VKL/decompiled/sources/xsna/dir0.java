package xsna;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import xsna.mgn0;

/* compiled from: VKWebViewClient.kt */
/* loaded from: classes6.dex */
public class dir0 extends cir0 implements ggx0 {
    public final egx0 c = new egx0();

    public int a() {
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        return dhr0.M() ? 2 : 0;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        String str2 = "doUpdateVisitedHistory: url=" + str + " isReload=" + z;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str2);
        }
        this.c.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        String str = "onFormResubmission: dontResend=" + message + ", resend=" + message2;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        this.c.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String b = go9.b("onLoadResource: url=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(b);
        }
        this.c.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        String b = go9.b("onPageCommitVisible: url=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.f(b);
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String b = go9.b("onPageFinished: url=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.f(b);
        }
        this.c.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2 = "onPageStarted: url=" + str + ", favicon=" + bitmap;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.f(str2);
        }
        if (webView != null) {
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            dhr0.a.getClass();
            dhr0.D().getClass();
            com.vk.core.ui.themes.a.f(webView);
        }
        this.c.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        String str = "onReceivedClientCertRequest: request=" + clientCertRequest;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        this.c.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder a = kh10.a(i, "onReceivedError: errorCode=", ", description=", str, ", failingUrl=");
        a.append(str2);
        String sb = a.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.b(sb);
        }
        this.c.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        String str3 = "onReceivedHttpAuthRequest: handler=" + httpAuthHandler + ", host=" + str + ", realm=" + str2;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str3);
        }
        this.c.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str = "onReceivedHttpError: request=" + webResourceRequest + ", error=" + webResourceResponse;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.g(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        StringBuilder a = xe9.a("onReceivedLoginRequest: realm=", str, ", account=", str2, ", args=");
        a.append(str3);
        String sb = a.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(sb);
        }
        this.c.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // xsna.cir0, android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str = "onReceivedSslError: handler=" + sslErrorHandler + ", error=" + sslError;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        mgn0.e eVar = mgn0Var.e.m;
        String url = sslError != null ? sslError.getUrl() : null;
        if (url == null) {
            url = "";
        }
        if (eVar == null || !eVar.a(url)) {
            this.c.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        String concat = "onReceivedSslError: skip SSL for ".concat(url);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(concat);
        }
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.f("onRenderProcessGone");
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        return superappUiRouterBridge.B(webView) || super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        String str = "onScaleChanged: oldScale=" + f + ", newScale=" + f2;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        this.c.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        String str = "onTooManyRedirects: cancelMsg=" + message + ", continueMsg=" + message2;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        this.c.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        String str = "onUnhandledKeyEvent: event=" + keyEvent;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        this.c.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        String str = "shouldOverrideKeyEvent: event=" + keyEvent;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        return this.c.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String b = go9.b("shouldOverrideUrlLoading: url=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(b);
        }
        return this.c.shouldOverrideUrlLoading(webView, str);
    }
}
