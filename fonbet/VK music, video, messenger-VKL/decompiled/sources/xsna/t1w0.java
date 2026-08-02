package xsna;

import android.webkit.WebView;

/* compiled from: VkSharedWebViewPool.kt */
/* loaded from: classes6.dex */
public final class t1w0 {
    public WebView a;
    public u1w0 b;

    public t1w0(WebView webView) {
        u1w0 u1w0Var = u1w0.READY;
        this.a = webView;
        this.b = u1w0Var;
    }

    public final WebView a() {
        return this.a;
    }

    public final void b(u1w0 u1w0Var) {
        this.b = u1w0Var;
    }
}
