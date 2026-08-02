package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageDelete$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetMeta$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetState$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageRead$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageWrite$Parameters;
import xsna.p2y;

/* compiled from: JsLocalStorageBridge.kt */
/* loaded from: classes6.dex */
public interface w4y {

    /* compiled from: JsLocalStorageBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppLocalStorageDelete(w4y w4yVar, String str) {
            try {
                LocalStorageDelete$Parameters a = LocalStorageDelete$Parameters.a((LocalStorageDelete$Parameters) new Gson().fromJson(str, LocalStorageDelete$Parameters.class));
                LocalStorageDelete$Parameters.b(a);
                w4yVar.r1(new p2y<>(a, str));
            } catch (Exception e) {
                w4yVar.r1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageGetMeta(w4y w4yVar, String str) {
            try {
                LocalStorageGetMeta$Parameters a = LocalStorageGetMeta$Parameters.a((LocalStorageGetMeta$Parameters) new Gson().fromJson(str, LocalStorageGetMeta$Parameters.class));
                LocalStorageGetMeta$Parameters.b(a);
                w4yVar.B(new p2y<>(a, str));
            } catch (Exception e) {
                w4yVar.B(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageGetState(w4y w4yVar, String str) {
            try {
                LocalStorageGetState$Parameters a = LocalStorageGetState$Parameters.a((LocalStorageGetState$Parameters) new Gson().fromJson(str, LocalStorageGetState$Parameters.class));
                LocalStorageGetState$Parameters.b(a);
                w4yVar.h0(new p2y<>(a, str));
            } catch (Exception e) {
                w4yVar.h0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageRead(w4y w4yVar, String str) {
            try {
                LocalStorageRead$Parameters a = LocalStorageRead$Parameters.a((LocalStorageRead$Parameters) new Gson().fromJson(str, LocalStorageRead$Parameters.class));
                LocalStorageRead$Parameters.b(a);
                w4yVar.d(new p2y<>(a, str));
            } catch (Exception e) {
                w4yVar.d(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageWrite(w4y w4yVar, String str) {
            try {
                LocalStorageWrite$Parameters a = LocalStorageWrite$Parameters.a((LocalStorageWrite$Parameters) new Gson().fromJson(str, LocalStorageWrite$Parameters.class));
                LocalStorageWrite$Parameters.b(a);
                w4yVar.m(new p2y<>(a, str));
            } catch (Exception e) {
                w4yVar.m(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    void B(p2y<LocalStorageGetMeta$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppLocalStorageDelete(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageGetMeta(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageGetState(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageRead(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageWrite(String str);

    void d(p2y<LocalStorageRead$Parameters> p2yVar);

    void h0(p2y<LocalStorageGetState$Parameters> p2yVar);

    void m(p2y<LocalStorageWrite$Parameters> p2yVar);

    void r1(p2y<LocalStorageDelete$Parameters> p2yVar);
}
