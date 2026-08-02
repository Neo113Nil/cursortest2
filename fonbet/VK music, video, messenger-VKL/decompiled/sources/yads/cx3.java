package yads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class cx3 extends WebViewClient {
    public final /* synthetic */ hx3 a;

    public cx3(hx3 hx3Var) {
        this.a = hx3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        Objects.toString(webView);
        if (((WebView) this.a.b.get()) == webView) {
            hx3 hx3Var = this.a;
            hx3Var.getClass();
            hx3Var.b = new lx3(null);
        }
        webView.destroy();
        return true;
    }
}
