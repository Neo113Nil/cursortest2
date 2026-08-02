package yads;

import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class dx3 implements Runnable {
    public final WebView b;

    public dx3(hx3 hx3Var) {
        WebView webView;
        webView = hx3Var.g;
        this.b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.destroy();
    }
}
