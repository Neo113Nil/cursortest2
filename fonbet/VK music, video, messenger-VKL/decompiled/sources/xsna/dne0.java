package xsna;

import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: QrAuthWebView.kt */
/* loaded from: classes15.dex */
public final class dne0 extends WebView {
    public final bir0 b;
    public final ujx0 c;
    public yme0 d;
    public final pf40 e;

    public dne0(Context context) {
        super(context);
        bir0 bir0Var = new bir0();
        this.b = bir0Var;
        ujx0 ujx0Var = new ujx0(this);
        this.c = ujx0Var;
        pf40 pf40Var = new pf40(this, 10);
        this.e = pf40Var;
        setWebChromeClient(bir0Var);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(1);
        nr2.n(this, (cir0) pf40Var.invoke(ujx0Var));
    }

    public final yme0 getCallback() {
        return this.d;
    }

    public final izs<sjx0, dir0> getWebViewClientProvider() {
        return this.e;
    }

    public final void setCallback(yme0 yme0Var) {
        this.d = yme0Var;
    }

    /* compiled from: QrAuthWebView.kt */
    public static final class a extends rjx0 {
        public final /* synthetic */ dne0 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sjx0 sjx0Var, dne0 dne0Var) {
            super(sjx0Var);
            this.f = dne0Var;
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            yme0 callback = this.f.getCallback();
            if (callback != null) {
                callback.b();
            }
            super.onPageFinished(webView, str);
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            yme0 callback = this.f.getCallback();
            if (callback != null) {
                callback.onError();
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // xsna.rjx0, xsna.dir0, android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            yme0 callback;
            if (str != null && ((drm0.D(str, "m.".concat(a0a.d), false) || drm0.D(str, "m.vk.com", false)) && (callback = this.f.getCallback()) != null)) {
                callback.c();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            yme0 callback = this.f.getCallback();
            if (callback != null) {
                callback.onError();
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }
}
