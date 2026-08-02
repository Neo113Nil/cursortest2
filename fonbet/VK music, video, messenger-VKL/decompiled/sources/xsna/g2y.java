package xsna;

import android.webkit.JavascriptInterface;
import xsna.x1y;
import xsna.x6y;

/* compiled from: JsAuthDelegate.kt */
/* loaded from: classes6.dex */
public interface g2y extends x1y, npf0 {

    /* compiled from: JsAuthDelegate.kt */
    public static final class a {
        public final x6y.d a;
        public final x6y.e b;
        public final x6y.f c;
        public final wvs d;
        public final xis e;

        public a(x6y.d dVar, x6y.e eVar, x6y.f fVar, wvs wvsVar, xis xisVar) {
            this.a = dVar;
            this.b = eVar;
            this.c = fVar;
            this.d = wvsVar;
            this.e = xisVar;
        }
    }

    /* compiled from: JsAuthDelegate.kt */
    public static final class b {
        @JavascriptInterface
        public static void VKWebAppAuthByExchangeToken(g2y g2yVar, String str) {
            x1y.a.VKWebAppAuthByExchangeToken(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppAuthPauseRequests(g2y g2yVar, String str) {
            x1y.a.VKWebAppAuthPauseRequests(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppAuthRestore(g2y g2yVar, String str) {
            x1y.a.VKWebAppAuthRestore(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppAuthResumeRequests(g2y g2yVar, String str) {
            x1y.a.VKWebAppAuthResumeRequests(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppConfirmUserByService(g2y g2yVar, String str) {
            x1y.a.VKWebAppConfirmUserByService(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetAuthToken(g2y g2yVar, String str) {
            x1y.a.VKWebAppGetAuthToken(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetRestoreHash(g2y g2yVar, String str) {
            x1y.a.VKWebAppGetRestoreHash(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetSilentToken(g2y g2yVar, String str) {
            x1y.a.VKWebAppGetSilentToken(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppIsMultiaccountAvailable(g2y g2yVar, String str) {
            x1y.a.VKWebAppIsMultiaccountAvailable(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppOAuthActivate(g2y g2yVar, String str) {
            x1y.a.VKWebAppOAuthActivate(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppOAuthDeactivate(g2y g2yVar, String str) {
            x1y.a.VKWebAppOAuthDeactivate(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppOpenMultiaccountSwitcher(g2y g2yVar, String str) {
            x1y.a.VKWebAppOpenMultiaccountSwitcher(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppRelatedPinCodeChanged(g2y g2yVar, String str) {
            x1y.a.VKWebAppRelatedPinCodeChanged(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppRelatedProfileCreated(g2y g2yVar, String str) {
            x1y.a.VKWebAppRelatedProfileCreated(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppRelatedProfileDeleted(g2y g2yVar, String str) {
            x1y.a.VKWebAppRelatedProfileDeleted(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppSaveCredentials(g2y g2yVar, String str) {
            x1y.a.VKWebAppSaveCredentials(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppUserDeactivated(g2y g2yVar, String str) {
            x1y.a.VKWebAppUserDeactivated(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppVerifyUserByService(g2y g2yVar, String str) {
            x1y.a.VKWebAppVerifyUserByService(g2yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppVerifyUserServicesInfo(g2y g2yVar, String str) {
            x1y.a.VKWebAppVerifyUserServicesInfo(g2yVar, str);
        }
    }

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthByExchangeToken(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthPauseRequests(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthRestore(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthResumeRequests(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppConfirmUserByService(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetAuthToken(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetRestoreHash(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetSilentToken(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppIsMultiaccountAvailable(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOAuthActivate(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOAuthDeactivate(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenMultiaccountSwitcher(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppRelatedPinCodeChanged(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppRelatedProfileCreated(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppRelatedProfileDeleted(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSaveCredentials(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppUserDeactivated(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppVerifyUserByService(String str);

    @Override // xsna.x1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppVerifyUserServicesInfo(String str);
}
