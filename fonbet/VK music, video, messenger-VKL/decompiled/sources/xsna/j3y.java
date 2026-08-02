package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.core.js.bridge.api.events.BecameInteractive$Parameters;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Parameters;
import com.vk.superapp.core.js.bridge.api.events.Close$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetClientVersion$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetConfig$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Parameters;
import com.vk.superapp.core.js.bridge.api.events.Init$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SendCustomEvent$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SetViewSettings$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageGet$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Parameters;
import xsna.p2y;

/* compiled from: JsCoreBridge.kt */
/* loaded from: classes6.dex */
public interface j3y {
    void C(p2y<Init$Parameters> p2yVar);

    void J0(p2y<GetLaunchParams$Parameters> p2yVar);

    void N(p2y<GetConfig$Parameters> p2yVar);

    void O(p2y<StorageGet$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppBecameInteractive(String str);

    @JavascriptInterface
    void VKWebAppCallAPIMethod(String str);

    @JavascriptInterface
    void VKWebAppChangeFragment(String str);

    @JavascriptInterface
    void VKWebAppClose(String str);

    @JavascriptInterface
    void VKWebAppGetClientVersion(String str);

    @JavascriptInterface
    void VKWebAppGetConfig(String str);

    @JavascriptInterface
    void VKWebAppGetLaunchParams(String str);

    @JavascriptInterface
    void VKWebAppInit(String str);

    @JavascriptInterface
    void VKWebAppSendCustomEvent(String str);

    @JavascriptInterface
    void VKWebAppSetViewSettings(String str);

    @JavascriptInterface
    void VKWebAppStorageGet(String str);

    @JavascriptInterface
    void VKWebAppStorageSet(String str);

    @JavascriptInterface
    void VKWebAppUpdateConfig(String str);

    @JavascriptInterface
    void VKWebAppViewHide(String str);

    @JavascriptInterface
    void VKWebAppViewRestore(String str);

    void Z0(p2y<StorageSet$Parameters> p2yVar);

    void i1(p2y<CallAPIMethod$Parameters> p2yVar);

    void m1(p2y<Close$Parameters> p2yVar);

    void t0(p2y<GetClientVersion$Parameters> p2yVar);

    void x1(p2y<SendCustomEvent$Parameters> p2yVar);

    void y1(p2y<BecameInteractive$Parameters> p2yVar);

    void z(p2y<SetViewSettings$Parameters> p2yVar);

    /* compiled from: JsCoreBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppBecameInteractive(j3y j3yVar, String str) {
            try {
                BecameInteractive$Parameters a = BecameInteractive$Parameters.a((BecameInteractive$Parameters) new Gson().fromJson(str, BecameInteractive$Parameters.class));
                BecameInteractive$Parameters.b(a);
                j3yVar.y1(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.y1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppCallAPIMethod(j3y j3yVar, String str) {
            try {
                CallAPIMethod$Parameters a = CallAPIMethod$Parameters.a((CallAPIMethod$Parameters) new Gson().fromJson(str, CallAPIMethod$Parameters.class));
                CallAPIMethod$Parameters.b(a);
                j3yVar.i1(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.i1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppClose(j3y j3yVar, String str) {
            try {
                Close$Parameters a = Close$Parameters.a((Close$Parameters) new Gson().fromJson(str, Close$Parameters.class));
                Close$Parameters.b(a);
                j3yVar.m1(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.m1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetClientVersion(j3y j3yVar, String str) {
            try {
                GetClientVersion$Parameters a = GetClientVersion$Parameters.a((GetClientVersion$Parameters) new Gson().fromJson(str, GetClientVersion$Parameters.class));
                GetClientVersion$Parameters.b(a);
                j3yVar.t0(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.t0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetConfig(j3y j3yVar, String str) {
            try {
                GetConfig$Parameters a = GetConfig$Parameters.a((GetConfig$Parameters) new Gson().fromJson(str, GetConfig$Parameters.class));
                GetConfig$Parameters.b(a);
                j3yVar.N(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.N(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetLaunchParams(j3y j3yVar, String str) {
            try {
                GetLaunchParams$Parameters a = GetLaunchParams$Parameters.a((GetLaunchParams$Parameters) new Gson().fromJson(str, GetLaunchParams$Parameters.class));
                GetLaunchParams$Parameters.b(a);
                j3yVar.J0(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.J0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppInit(j3y j3yVar, String str) {
            try {
                Init$Parameters a = Init$Parameters.a((Init$Parameters) new Gson().fromJson(str, Init$Parameters.class));
                Init$Parameters.b(a);
                j3yVar.C(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.C(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppSendCustomEvent(j3y j3yVar, String str) {
            try {
                SendCustomEvent$Parameters a = SendCustomEvent$Parameters.a((SendCustomEvent$Parameters) new Gson().fromJson(str, SendCustomEvent$Parameters.class));
                SendCustomEvent$Parameters.b(a);
                j3yVar.x1(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.x1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppSetViewSettings(j3y j3yVar, String str) {
            try {
                SetViewSettings$Parameters a = SetViewSettings$Parameters.a((SetViewSettings$Parameters) new Gson().fromJson(str, SetViewSettings$Parameters.class));
                SetViewSettings$Parameters.b(a);
                j3yVar.z(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.z(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppStorageGet(j3y j3yVar, String str) {
            try {
                StorageGet$Parameters a = StorageGet$Parameters.a((StorageGet$Parameters) new Gson().fromJson(str, StorageGet$Parameters.class));
                StorageGet$Parameters.b(a);
                j3yVar.O(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.O(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppStorageSet(j3y j3yVar, String str) {
            try {
                StorageSet$Parameters a = StorageSet$Parameters.a((StorageSet$Parameters) new Gson().fromJson(str, StorageSet$Parameters.class));
                StorageSet$Parameters.c(a);
                StorageSet$Parameters.b(a);
                j3yVar.Z0(new p2y<>(a, str));
            } catch (Exception e) {
                j3yVar.Z0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppChangeFragment(j3y j3yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppUpdateConfig(j3y j3yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppViewHide(j3y j3yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppViewRestore(j3y j3yVar, String str) {
        }
    }
}
