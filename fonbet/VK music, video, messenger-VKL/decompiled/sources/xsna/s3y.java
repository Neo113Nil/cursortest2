package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.dating.js.bridge.api.events.AllowLocationPermission$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.GetPushToken$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.InAppUpdate$Parameters;
import xsna.p2y;

/* compiled from: JsDatingBridge.kt */
/* loaded from: classes6.dex */
public interface s3y {
    void S(p2y<InAppUpdate$Parameters> p2yVar);

    @JavascriptInterface
    default void VKWebAppAllowLocationPermission(String str) {
        try {
            AllowLocationPermission$Parameters a = AllowLocationPermission$Parameters.a((AllowLocationPermission$Parameters) new Gson().fromJson(str, AllowLocationPermission$Parameters.class));
            AllowLocationPermission$Parameters.b(a);
            s1(new p2y<>(a, str));
        } catch (Exception e) {
            s1(new p2y<>(new p2y.a(e), str));
        }
    }

    @JavascriptInterface
    default void VKWebAppGetPushToken(String str) {
        try {
            t1(new p2y<>(GetPushToken$Parameters.a((GetPushToken$Parameters) new Gson().fromJson(str, GetPushToken$Parameters.class)), str));
        } catch (Exception e) {
            t1(new p2y<>(new p2y.a(e), str));
        }
    }

    @JavascriptInterface
    default void VKWebAppImageShare(String str) {
        try {
            ImageShare$Parameters a = ImageShare$Parameters.a((ImageShare$Parameters) new Gson().fromJson(str, ImageShare$Parameters.class));
            ImageShare$Parameters.b(a);
            b1(new p2y<>(a, str));
        } catch (Exception e) {
            b1(new p2y<>(new p2y.a(e), str));
        }
    }

    @JavascriptInterface
    default void VKWebAppInAppUpdate(String str) {
        try {
            InAppUpdate$Parameters a = InAppUpdate$Parameters.a((InAppUpdate$Parameters) new Gson().fromJson(str, InAppUpdate$Parameters.class));
            InAppUpdate$Parameters.b(a);
            S(new p2y<>(a, str));
        } catch (Exception e) {
            S(new p2y<>(new p2y.a(e), str));
        }
    }

    void b1(p2y<ImageShare$Parameters> p2yVar);

    void s1(p2y<AllowLocationPermission$Parameters> p2yVar);

    void t1(p2y<GetPushToken$Parameters> p2yVar);
}
