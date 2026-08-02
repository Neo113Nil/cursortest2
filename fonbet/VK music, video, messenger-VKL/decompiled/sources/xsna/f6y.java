package xsna;

import android.webkit.JavascriptInterface;
import xsna.e6y;

/* compiled from: JsSubscriptionsDelegate.kt */
/* loaded from: classes6.dex */
public interface f6y extends e6y, npf0 {

    /* compiled from: JsSubscriptionsDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppCanShowAltPayMethod(f6y f6yVar, String str) {
            e6y.a.VKWebAppCanShowAltPayMethod(f6yVar, str);
        }
    }

    @Override // xsna.e6y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCanShowAltPayMethod(String str);
}
