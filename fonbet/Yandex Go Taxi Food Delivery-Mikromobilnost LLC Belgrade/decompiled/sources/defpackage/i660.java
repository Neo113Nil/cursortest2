package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

/* loaded from: classes12.dex */
public final class i660 {
    public static final void a(i660 i660Var, WebView webView, String str, tls tlsVar) {
        i660Var.getClass();
        if (str == null) {
            str = "";
        }
        tlsVar.invoke(str);
        new Handler(Looper.getMainLooper()).post(new sf30(20, webView));
    }
}
