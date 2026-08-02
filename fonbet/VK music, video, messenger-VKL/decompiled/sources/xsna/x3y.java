package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.dating.sdk.js.bridge.api.events.CaptureProtection$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.GetPermissions$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.NavigateToSettings$Parameters;
import xsna.p2y;

/* compiled from: JsDatingSdkBridge.kt */
/* loaded from: classes6.dex */
public interface x3y {

    /* compiled from: JsDatingSdkBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppCaptureProtection(x3y x3yVar, String str) {
            try {
                x3yVar.Z(new p2y<>(CaptureProtection$Parameters.a((CaptureProtection$Parameters) new Gson().fromJson(str, CaptureProtection$Parameters.class)), str));
            } catch (Exception e) {
                x3yVar.Z(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetPermissions(x3y x3yVar, String str) {
            try {
                GetPermissions$Parameters a = GetPermissions$Parameters.a((GetPermissions$Parameters) new Gson().fromJson(str, GetPermissions$Parameters.class));
                GetPermissions$Parameters.b(a);
                x3yVar.P(new p2y<>(a, str));
            } catch (Exception e) {
                x3yVar.P(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppNavigateToSettings(x3y x3yVar, String str) {
            try {
                NavigateToSettings$Parameters a = NavigateToSettings$Parameters.a((NavigateToSettings$Parameters) new Gson().fromJson(str, NavigateToSettings$Parameters.class));
                NavigateToSettings$Parameters.b(a);
                x3yVar.w0(new p2y<>(a, str));
            } catch (Exception e) {
                x3yVar.w0(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    void P(p2y<GetPermissions$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppCaptureProtection(String str);

    @JavascriptInterface
    void VKWebAppGetPermissions(String str);

    @JavascriptInterface
    void VKWebAppNavigateToSettings(String str);

    void Z(p2y<CaptureProtection$Parameters> p2yVar);

    void w0(p2y<NavigateToSettings$Parameters> p2yVar);
}
