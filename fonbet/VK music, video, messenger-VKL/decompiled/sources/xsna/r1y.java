package xsna;

import android.webkit.JavascriptInterface;
import xsna.p1y;

/* compiled from: JsAnalyticsDelegate.kt */
/* loaded from: classes6.dex */
public interface r1y extends p1y, npf0 {

    /* compiled from: JsAnalyticsDelegate.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppGetMyTrackerId(r1y r1yVar, String str) {
            p1y.a.VKWebAppGetMyTrackerId(r1yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppTrackEvent(r1y r1yVar, String str) {
            p1y.a.VKWebAppTrackEvent(r1yVar, str);
        }
    }

    @Override // xsna.p1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetMyTrackerId(String str);

    @Override // xsna.p1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTrackEvent(String str);
}
