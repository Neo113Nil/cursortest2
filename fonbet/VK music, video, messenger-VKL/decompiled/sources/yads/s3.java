package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.text.Regex;
import xsna.brm0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class s3 extends WebViewClient {
    public static final /* synthetic */ qcy[] d = {wb.a(s3.class, "context", "getContext()Landroid/content/Context;", 0)};
    public final mn2 a;
    public final mp3 b = dt2.b();
    public final hc3 c = new hc3();

    public s3(Context context) {
        this.a = nn2.a(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        mn2 mn2Var = this.a;
        qcy qcyVar = d[0];
        Object obj = (Context) mn2Var.a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        mn2 mn2Var = this.a;
        qcy qcyVar = d[0];
        Object obj = (Context) mn2Var.a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r6.c.a(r7.getContext(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r8) == false) goto L18;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null && str.length() > 0) {
            if (str.length() != 0) {
                String i = new Regex("http(s?)://").i(str, "");
                ec3.c.getClass();
                ec3[] ec3VarArr = {ec3.d, ec3.e, ec3.f, ec3.g};
                for (int i2 = 0; i2 < 4; i2++) {
                    if (brm0.B(i, ec3VarArr[i2].b, false)) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
