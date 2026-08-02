package xsna;

import android.net.Uri;
import android.webkit.JavascriptInterface;

/* compiled from: JsProxyBridge.kt */
/* loaded from: classes6.dex */
public interface a6y {

    /* compiled from: JsProxyBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static boolean onWebAppCheckHost(a6y a6yVar, String str) {
            afx0 afx0Var = e370.r;
            if (afx0Var != null) {
                return afx0Var.e(Uri.parse(str));
            }
            return false;
        }

        @JavascriptInterface
        public static void onWebAppProxyAddAwaitRequest(a6y a6yVar, String str) {
            b6y c = a6yVar.c();
            if (c != null) {
                c.b(str);
            }
        }

        @JavascriptInterface
        public static void onWebAppProxyDeviceInfo(a6y a6yVar, String str) {
            b6y c = a6yVar.c();
            if (c != null) {
                c.c(str);
            }
        }

        @JavascriptInterface
        public static void onWebAppProxyInterceptAsyncRequest(a6y a6yVar, String str, String str2, String str3) {
            b6y c = a6yVar.c();
            if (c != null) {
                c.a(str, str2, str3);
            }
        }
    }

    b6y c();

    @JavascriptInterface
    boolean onWebAppCheckHost(String str);

    @JavascriptInterface
    void onWebAppProxyAddAwaitRequest(String str);

    @JavascriptInterface
    void onWebAppProxyDeviceInfo(String str);

    @JavascriptInterface
    void onWebAppProxyInterceptAsyncRequest(String str, String str2, String str3);
}
