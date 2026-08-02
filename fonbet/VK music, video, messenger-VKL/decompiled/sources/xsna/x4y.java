package xsna;

import android.webkit.JavascriptInterface;
import xsna.w4y;

/* compiled from: JsLocalStorageDelegate.kt */
/* loaded from: classes6.dex */
public interface x4y extends w4y, npf0 {

    /* compiled from: JsLocalStorageDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppLocalStorageDelete(x4y x4yVar, String str) {
            w4y.a.VKWebAppLocalStorageDelete(x4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageGetMeta(x4y x4yVar, String str) {
            w4y.a.VKWebAppLocalStorageGetMeta(x4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageGetState(x4y x4yVar, String str) {
            w4y.a.VKWebAppLocalStorageGetState(x4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageRead(x4y x4yVar, String str) {
            w4y.a.VKWebAppLocalStorageRead(x4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppLocalStorageWrite(x4y x4yVar, String str) {
            w4y.a.VKWebAppLocalStorageWrite(x4yVar, str);
        }
    }

    @Override // xsna.w4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppLocalStorageDelete(String str);

    @Override // xsna.w4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppLocalStorageGetMeta(String str);

    @Override // xsna.w4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppLocalStorageGetState(String str);

    @Override // xsna.w4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppLocalStorageRead(String str);

    @Override // xsna.w4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppLocalStorageWrite(String str);
}
