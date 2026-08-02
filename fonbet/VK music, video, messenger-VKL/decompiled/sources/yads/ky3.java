package yads;

import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class ky3 implements Runnable {
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;
    public final /* synthetic */ my3 d;

    public ky3(my3 my3Var, WebView webView, String str) {
        this.d = my3Var;
        this.b = webView;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        my3 my3Var = this.d;
        WebView webView = this.b;
        String str = this.c;
        my3Var.getClass();
        my3.a(webView, str);
    }
}
