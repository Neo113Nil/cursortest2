package xsna;

import android.webkit.JavascriptInterface;
import xsna.v5y;

/* compiled from: JsPermissionDelegate.kt */
/* loaded from: classes6.dex */
public interface w5y extends v5y {

    /* compiled from: JsPermissionDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppGetGrantedPermissions(w5y w5yVar, String str) {
            v5y.a.VKWebAppGetGrantedPermissions(w5yVar, str);
        }
    }

    @Override // xsna.v5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetGrantedPermissions(String str);
}
