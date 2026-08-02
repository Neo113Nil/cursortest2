package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.io.File;

/* compiled from: VkUiDefaultWebViewProvider.kt */
/* loaded from: classes6.dex */
public class uvv0 implements v1w0 {
    public final Context a;
    public final s1w0 b;

    static {
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        new File(mgn0Var.b, "/cache/vkapps");
    }

    public uvv0(Context context, s1w0 s1w0Var) {
        this.a = context;
        this.b = s1w0Var;
    }

    @Override // xsna.v1w0
    @SuppressLint({"SetJavaScriptEnabled"})
    public void a(WebView webView) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setCacheMode(-1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
    }
}
