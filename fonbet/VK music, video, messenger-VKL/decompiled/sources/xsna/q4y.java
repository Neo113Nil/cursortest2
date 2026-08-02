package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCancel$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCheck$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyResend$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyStart$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifySupported$Parameters;
import xsna.p2y;

/* compiled from: JsLibverifyBridge.kt */
/* loaded from: classes6.dex */
public interface q4y {
    @JavascriptInterface
    void VKWebAppLibverifyCancel(String str);

    @JavascriptInterface
    void VKWebAppLibverifyChangeState(String str);

    @JavascriptInterface
    void VKWebAppLibverifyCheck(String str);

    @JavascriptInterface
    void VKWebAppLibverifyResend(String str);

    @JavascriptInterface
    void VKWebAppLibverifyStart(String str);

    @JavascriptInterface
    void VKWebAppLibverifySupported(String str);

    void a(p2y<LibverifyResend$Parameters> p2yVar);

    void b(p2y<LibverifySupported$Parameters> p2yVar);

    void c(p2y<LibverifyCancel$Parameters> p2yVar);

    void d(p2y<LibverifyStart$Parameters> p2yVar);

    void e(p2y<LibverifyCheck$Parameters> p2yVar);

    /* compiled from: JsLibverifyBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppLibverifyCancel(q4y q4yVar, String str) {
            try {
                LibverifyCancel$Parameters a = LibverifyCancel$Parameters.a((LibverifyCancel$Parameters) new Gson().fromJson(str, LibverifyCancel$Parameters.class));
                LibverifyCancel$Parameters.b(a);
                q4yVar.c(new p2y<>(a, str));
            } catch (Exception e) {
                q4yVar.c(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLibverifyCheck(q4y q4yVar, String str) {
            try {
                LibverifyCheck$Parameters a = LibverifyCheck$Parameters.a((LibverifyCheck$Parameters) new Gson().fromJson(str, LibverifyCheck$Parameters.class));
                LibverifyCheck$Parameters.b(a);
                q4yVar.e(new p2y<>(a, str));
            } catch (Exception e) {
                q4yVar.e(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLibverifyResend(q4y q4yVar, String str) {
            try {
                LibverifyResend$Parameters a = LibverifyResend$Parameters.a((LibverifyResend$Parameters) new Gson().fromJson(str, LibverifyResend$Parameters.class));
                LibverifyResend$Parameters.b(a);
                q4yVar.a(new p2y<>(a, str));
            } catch (Exception e) {
                q4yVar.a(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLibverifyStart(q4y q4yVar, String str) {
            try {
                LibverifyStart$Parameters a = LibverifyStart$Parameters.a((LibverifyStart$Parameters) new Gson().fromJson(str, LibverifyStart$Parameters.class));
                LibverifyStart$Parameters.b(a);
                q4yVar.d(new p2y<>(a, str));
            } catch (Exception e) {
                q4yVar.d(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLibverifySupported(q4y q4yVar, String str) {
            try {
                LibverifySupported$Parameters a = LibverifySupported$Parameters.a((LibverifySupported$Parameters) new Gson().fromJson(str, LibverifySupported$Parameters.class));
                LibverifySupported$Parameters.b(a);
                q4yVar.b(new p2y<>(a, str));
            } catch (Exception e) {
                q4yVar.b(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLibverifyChangeState(q4y q4yVar, String str) {
        }
    }
}
