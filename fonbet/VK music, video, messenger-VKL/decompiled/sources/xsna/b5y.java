package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import xsna.p2y;

/* compiled from: JsLocationBridge.kt */
/* loaded from: classes6.dex */
public interface b5y {

    /* compiled from: JsLocationBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppGetGeodata(b5y b5yVar, String str) {
            try {
                GetGeodata$Parameters a = GetGeodata$Parameters.a((GetGeodata$Parameters) new Gson().fromJson(str, GetGeodata$Parameters.class));
                GetGeodata$Parameters.b(a);
                b5yVar.f0(new p2y<>(a, str));
            } catch (Exception e) {
                b5yVar.f0(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    @JavascriptInterface
    void VKWebAppGetGeodata(String str);

    void f0(p2y<GetGeodata$Parameters> p2yVar);
}
