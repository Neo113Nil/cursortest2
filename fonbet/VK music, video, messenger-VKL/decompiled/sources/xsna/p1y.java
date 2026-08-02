package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.analytics.js.bridge.api.events.GetMyTrackerId$Parameters;
import com.vk.superapp.analytics.js.bridge.api.events.TrackEvent$Parameters;
import xsna.p2y;

/* compiled from: JsAnalyticsBridge.kt */
/* loaded from: classes6.dex */
public interface p1y {

    /* compiled from: JsAnalyticsBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppGetMyTrackerId(p1y p1yVar, String str) {
            try {
                GetMyTrackerId$Parameters.b(GetMyTrackerId$Parameters.a((GetMyTrackerId$Parameters) new Gson().fromJson(str, GetMyTrackerId$Parameters.class)));
                p1yVar.getClass();
            } catch (Exception unused) {
                p1yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppTrackEvent(p1y p1yVar, String str) {
            try {
                TrackEvent$Parameters a = TrackEvent$Parameters.a((TrackEvent$Parameters) new Gson().fromJson(str, TrackEvent$Parameters.class));
                TrackEvent$Parameters.c(a);
                TrackEvent$Parameters.b(a);
                p1yVar.j(new p2y<>(a, str));
            } catch (Exception e) {
                p1yVar.j(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    @JavascriptInterface
    void VKWebAppGetMyTrackerId(String str);

    @JavascriptInterface
    void VKWebAppTrackEvent(String str);

    void j(p2y<TrackEvent$Parameters> p2yVar);
}
