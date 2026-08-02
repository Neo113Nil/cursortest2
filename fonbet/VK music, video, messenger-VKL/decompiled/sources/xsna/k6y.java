package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.vibration.js.bridge.api.events.TapticImpactOccurred$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticNotificationOccurred$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticSelectionChanged$Parameters;
import xsna.p2y;

/* compiled from: JsVibrationBridge.kt */
/* loaded from: classes6.dex */
public interface k6y {

    /* compiled from: JsVibrationBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppTapticImpactOccurred(k6y k6yVar, String str) {
            try {
                TapticImpactOccurred$Parameters a = TapticImpactOccurred$Parameters.a((TapticImpactOccurred$Parameters) new Gson().fromJson(str, TapticImpactOccurred$Parameters.class));
                TapticImpactOccurred$Parameters.b(a);
                k6yVar.L0(new p2y<>(a, str));
            } catch (Exception e) {
                k6yVar.L0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppTapticNotificationOccurred(k6y k6yVar, String str) {
            try {
                TapticNotificationOccurred$Parameters a = TapticNotificationOccurred$Parameters.a((TapticNotificationOccurred$Parameters) new Gson().fromJson(str, TapticNotificationOccurred$Parameters.class));
                TapticNotificationOccurred$Parameters.b(a);
                k6yVar.X0(new p2y<>(a, str));
            } catch (Exception e) {
                k6yVar.X0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppTapticSelectionChanged(k6y k6yVar, String str) {
            try {
                TapticSelectionChanged$Parameters a = TapticSelectionChanged$Parameters.a((TapticSelectionChanged$Parameters) new Gson().fromJson(str, TapticSelectionChanged$Parameters.class));
                TapticSelectionChanged$Parameters.b(a);
                k6yVar.x(new p2y<>(a, str));
            } catch (Exception e) {
                k6yVar.x(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    void L0(p2y<TapticImpactOccurred$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppTapticImpactOccurred(String str);

    @JavascriptInterface
    void VKWebAppTapticNotificationOccurred(String str);

    @JavascriptInterface
    void VKWebAppTapticSelectionChanged(String str);

    void X0(p2y<TapticNotificationOccurred$Parameters> p2yVar);

    void x(p2y<TapticSelectionChanged$Parameters> p2yVar);
}
