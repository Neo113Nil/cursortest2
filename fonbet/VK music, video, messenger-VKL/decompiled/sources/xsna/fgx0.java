package xsna;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: WebClients.kt */
/* loaded from: classes6.dex */
public final class fgx0 {
    public final WebView a;
    public WebViewClient b;

    public fgx0(WebView webView, WebViewClient webViewClient) {
        this.a = webView;
        this.b = webViewClient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgx0)) {
            return false;
        }
        fgx0 fgx0Var = (fgx0) obj;
        return epx.f(this.a, fgx0Var.a) && epx.f(this.b, fgx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Holder(webView=" + this.a + ", client=" + this.b + ')';
    }
}
