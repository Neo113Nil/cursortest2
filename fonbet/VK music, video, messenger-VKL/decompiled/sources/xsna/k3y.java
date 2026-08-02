package xsna;

import android.graphics.Rect;
import android.webkit.JavascriptInterface;
import xsna.j3y;

/* compiled from: JsCoreDelegate.kt */
/* loaded from: classes6.dex */
public interface k3y extends j3y, npf0 {

    /* compiled from: JsCoreDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppBecameInteractive(k3y k3yVar, String str) {
            j3y.a.VKWebAppBecameInteractive(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppCallAPIMethod(k3y k3yVar, String str) {
            j3y.a.VKWebAppCallAPIMethod(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppChangeFragment(k3y k3yVar, String str) {
            j3y.a.VKWebAppChangeFragment(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppClose(k3y k3yVar, String str) {
            j3y.a.VKWebAppClose(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetClientVersion(k3y k3yVar, String str) {
            j3y.a.VKWebAppGetClientVersion(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetConfig(k3y k3yVar, String str) {
            j3y.a.VKWebAppGetConfig(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetLaunchParams(k3y k3yVar, String str) {
            j3y.a.VKWebAppGetLaunchParams(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppInit(k3y k3yVar, String str) {
            j3y.a.VKWebAppInit(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppSendCustomEvent(k3y k3yVar, String str) {
            j3y.a.VKWebAppSendCustomEvent(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppSetViewSettings(k3y k3yVar, String str) {
            j3y.a.VKWebAppSetViewSettings(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppStorageGet(k3y k3yVar, String str) {
            j3y.a.VKWebAppStorageGet(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppStorageSet(k3y k3yVar, String str) {
            j3y.a.VKWebAppStorageSet(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppUpdateConfig(k3y k3yVar, String str) {
            j3y.a.VKWebAppUpdateConfig(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppViewHide(k3y k3yVar, String str) {
            j3y.a.VKWebAppViewHide(k3yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppViewRestore(k3y k3yVar, String str) {
            j3y.a.VKWebAppViewRestore(k3yVar, str);
        }
    }

    void B0(String str);

    void U0();

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppBecameInteractive(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCallAPIMethod(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppChangeFragment(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppClose(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetClientVersion(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetConfig(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetLaunchParams(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppInit(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSendCustomEvent(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSetViewSettings(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStorageGet(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStorageSet(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppUpdateConfig(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppViewHide(String str);

    @Override // xsna.j3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppViewRestore(String str);

    void l0();

    void p0(Rect rect);

    void q();

    void t(String str);

    void y();
}
