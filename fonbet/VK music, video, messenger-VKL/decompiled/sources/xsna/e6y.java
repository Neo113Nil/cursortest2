package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.subscriptions.js.bridge.api.events.CanShowAltPayMethod$Parameters;
import xsna.p2y;

/* compiled from: JsSubscriptionsBridge.kt */
/* loaded from: classes6.dex */
public interface e6y {

    /* compiled from: JsSubscriptionsBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppCanShowAltPayMethod(e6y e6yVar, String str) {
            try {
                CanShowAltPayMethod$Parameters a = CanShowAltPayMethod$Parameters.a((CanShowAltPayMethod$Parameters) new Gson().fromJson(str, CanShowAltPayMethod$Parameters.class));
                CanShowAltPayMethod$Parameters.b(a);
                e6yVar.l(new p2y<>(a, str));
            } catch (Exception e) {
                e6yVar.l(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    @JavascriptInterface
    void VKWebAppCanShowAltPayMethod(String str);

    void l(p2y<CanShowAltPayMethod$Parameters> p2yVar);
}
