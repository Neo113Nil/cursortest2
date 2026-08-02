package yads;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import xsna.emb;
import xsna.epx;

/* loaded from: classes10.dex */
public final class n11 extends WebViewClient {
    public final o11 a;
    public final kp3 b;
    public m11 c;

    public /* synthetic */ n11(o11 o11Var) {
        this(o11Var, dt2.b());
    }

    public final void a(vt2 vt2Var) {
        this.c = vt2Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.a(i);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (((mp3) this.b).a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String a;
        m11 m11Var = this.c;
        if (m11Var != null) {
            vt2 vt2Var = (vt2) m11Var;
            Uri url = webResourceRequest.getUrl();
            WebResourceResponse webResourceResponse = null;
            if (epx.f(url != null ? url.getLastPathSegment() : null, vt2Var.a) && (a = vt2Var.b.a()) != null && a.length() != 0) {
                webResourceResponse = new WebResourceResponse("text/javascript", C.UTF8_NAME, new ByteArrayInputStream(a.getBytes(emb.b)));
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.a.a(webView.getContext(), str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.a(webResourceError.getErrorCode());
    }

    public n11(o11 o11Var, kp3 kp3Var) {
        this.a = o11Var;
        this.b = kp3Var;
    }
}
