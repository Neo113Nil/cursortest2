package defpackage;

import android.webkit.WebView;
import com.yandex.go.platform.web_view_client.a;

/* loaded from: classes13.dex */
public final class fst implements Runnable {
    public final /* synthetic */ int a = 0;
    public final WebView b;

    public fst(gq81 gq81Var) {
        this.b = gq81Var.g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebView webView = this.b;
        switch (i) {
            case 0:
                webView.setAlpha(0.0f);
                oj91.a(webView, 200L);
                break;
            default:
                webView.destroy();
                break;
        }
    }

    public fst(WebView webView, a aVar, WebView webView2) {
        this.b = webView2;
    }
}
