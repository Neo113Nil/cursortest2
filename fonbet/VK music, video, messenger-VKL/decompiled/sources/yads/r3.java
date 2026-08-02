package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class r3 extends WebChromeClient {
    public static final /* synthetic */ qcy[] b = {wb.a(r3.class, "context", "getContext()Landroid/content/Context;", 0)};
    public final mn2 a;

    public r3(Context context) {
        this.a = nn2.a(context);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        mn2 mn2Var = this.a;
        qcy qcyVar = b[0];
        Object obj = (Context) mn2Var.a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            t1 t1Var = (t1) t3Var;
            int i2 = i * 100;
            t1Var.i.setProgress(i2);
            if (10000 > i2) {
                t1Var.a(0);
            } else {
                t1Var.h.setText(webView.getTitle());
                t1Var.a(8);
            }
        }
    }
}
