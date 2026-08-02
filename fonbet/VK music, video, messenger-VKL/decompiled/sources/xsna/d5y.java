package xsna;

import android.webkit.JavascriptInterface;
import xsna.b5y;

/* compiled from: JsLocationDelegate.kt */
/* loaded from: classes6.dex */
public interface d5y extends b5y, npf0 {

    /* compiled from: JsLocationDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppGetGeodata(d5y d5yVar, String str) {
            b5y.a.VKWebAppGetGeodata(d5yVar, str);
        }
    }

    @Override // xsna.b5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetGeodata(String str);
}
