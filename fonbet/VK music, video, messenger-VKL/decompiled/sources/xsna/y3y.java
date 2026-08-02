package xsna;

import android.webkit.JavascriptInterface;
import xsna.x3y;

/* compiled from: JsDatingSdkDelegate.kt */
/* loaded from: classes6.dex */
public interface y3y extends x3y, npf0 {

    /* compiled from: JsDatingSdkDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppCaptureProtection(y3y y3yVar, String str) {
            x3y.a.VKWebAppCaptureProtection(y3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetPermissions(y3y y3yVar, String str) {
            x3y.a.VKWebAppGetPermissions(y3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppNavigateToSettings(y3y y3yVar, String str) {
            x3y.a.VKWebAppNavigateToSettings(y3yVar, str);
        }
    }

    @Override // xsna.x3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCaptureProtection(String str);

    @Override // xsna.x3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetPermissions(String str);

    @Override // xsna.x3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppNavigateToSettings(String str);
}
