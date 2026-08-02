package xsna;

import android.webkit.JavascriptInterface;
import xsna.k6y;

/* compiled from: JsVibrationDelegate.kt */
/* loaded from: classes6.dex */
public interface l6y extends k6y, npf0 {

    /* compiled from: JsVibrationDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppTapticImpactOccurred(l6y l6yVar, String str) {
            k6y.a.VKWebAppTapticImpactOccurred(l6yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppTapticNotificationOccurred(l6y l6yVar, String str) {
            k6y.a.VKWebAppTapticNotificationOccurred(l6yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppTapticSelectionChanged(l6y l6yVar, String str) {
            k6y.a.VKWebAppTapticSelectionChanged(l6yVar, str);
        }
    }

    @Override // xsna.k6y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTapticImpactOccurred(String str);

    @Override // xsna.k6y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTapticNotificationOccurred(String str);

    @Override // xsna.k6y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTapticSelectionChanged(String str);
}
