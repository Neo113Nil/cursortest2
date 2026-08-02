package xsna;

import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* compiled from: Checkout3dsPaymentFragment.kt */
/* loaded from: classes6.dex */
public final class m2c extends WebChromeClient {
    public final /* synthetic */ n2c a;
    public final /* synthetic */ WebView b;

    public m2c(n2c n2cVar, WebView webView) {
        this.a = n2cVar;
        this.b = webView;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (i == 100) {
            new Handler().postDelayed(new p69(this.b, 2), 200L);
            ProgressBar progressBar = this.a.i;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
        }
    }
}
