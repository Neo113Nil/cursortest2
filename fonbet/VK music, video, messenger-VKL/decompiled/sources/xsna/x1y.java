package xsna;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthPauseRequests$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthRestore$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthResumeRequests$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.ConfirmUserByService$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetRestoreHash$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetSilentToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.IsMultiaccountAvailable$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OAuthActivate$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OAuthDeactivate$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OpenMultiaccountSwitcher$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedPinCodeChanged$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedProfileCreated$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedProfileDeleted$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.SaveCredentials$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.UserDeactivated$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserByService$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserServicesInfo$Parameters;
import xsna.p2y;

/* compiled from: JsAuthBridge.kt */
/* loaded from: classes6.dex */
public interface x1y {

    /* compiled from: JsAuthBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppAuthByExchangeToken(x1y x1yVar, String str) {
            try {
                AuthByExchangeToken$Parameters a = AuthByExchangeToken$Parameters.a((AuthByExchangeToken$Parameters) new Gson().fromJson(str, AuthByExchangeToken$Parameters.class));
                AuthByExchangeToken$Parameters.b(a);
                x1yVar.v(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.v(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAuthPauseRequests(x1y x1yVar, String str) {
            try {
                AuthPauseRequests$Parameters a = AuthPauseRequests$Parameters.a((AuthPauseRequests$Parameters) new Gson().fromJson(str, AuthPauseRequests$Parameters.class));
                AuthPauseRequests$Parameters.b(a);
                x1yVar.p(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.p(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAuthRestore(x1y x1yVar, String str) {
            try {
                AuthRestore$Parameters a = AuthRestore$Parameters.a((AuthRestore$Parameters) new Gson().fromJson(str, AuthRestore$Parameters.class));
                AuthRestore$Parameters.b(a);
                x1yVar.u(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.u(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAuthResumeRequests(x1y x1yVar, String str) {
            try {
                AuthResumeRequests$Parameters a = AuthResumeRequests$Parameters.a((AuthResumeRequests$Parameters) new Gson().fromJson(str, AuthResumeRequests$Parameters.class));
                AuthResumeRequests$Parameters.b(a);
                x1yVar.Y0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.Y0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppConfirmUserByService(x1y x1yVar, String str) {
            try {
                ConfirmUserByService$Parameters a = ConfirmUserByService$Parameters.a((ConfirmUserByService$Parameters) new Gson().fromJson(str, ConfirmUserByService$Parameters.class));
                ConfirmUserByService$Parameters.b(a);
                x1yVar.N0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.N0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetAuthToken(x1y x1yVar, String str) {
            try {
                GetAuthToken$Parameters a = GetAuthToken$Parameters.a((GetAuthToken$Parameters) new Gson().fromJson(str, GetAuthToken$Parameters.class));
                GetAuthToken$Parameters.c(a);
                GetAuthToken$Parameters.b(a);
                x1yVar.R(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.R(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetRestoreHash(x1y x1yVar, String str) {
            try {
                GetRestoreHash$Parameters a = GetRestoreHash$Parameters.a((GetRestoreHash$Parameters) new Gson().fromJson(str, GetRestoreHash$Parameters.class));
                GetRestoreHash$Parameters.b(a);
                x1yVar.e0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.e0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetSilentToken(x1y x1yVar, String str) {
            try {
                GetSilentToken$Parameters a = GetSilentToken$Parameters.a((GetSilentToken$Parameters) new Gson().fromJson(str, GetSilentToken$Parameters.class));
                GetSilentToken$Parameters.b(a);
                x1yVar.s0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.s0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppIsMultiaccountAvailable(x1y x1yVar, String str) {
            try {
                IsMultiaccountAvailable$Parameters a = IsMultiaccountAvailable$Parameters.a((IsMultiaccountAvailable$Parameters) new Gson().fromJson(str, IsMultiaccountAvailable$Parameters.class));
                IsMultiaccountAvailable$Parameters.b(a);
                x1yVar.W(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.W(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOAuthActivate(x1y x1yVar, String str) {
            try {
                OAuthActivate$Parameters a = OAuthActivate$Parameters.a((OAuthActivate$Parameters) new Gson().fromJson(str, OAuthActivate$Parameters.class));
                OAuthActivate$Parameters.b(a);
                x1yVar.M(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.M(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOAuthDeactivate(x1y x1yVar, String str) {
            try {
                OAuthDeactivate$Parameters a = OAuthDeactivate$Parameters.a((OAuthDeactivate$Parameters) new Gson().fromJson(str, OAuthDeactivate$Parameters.class));
                OAuthDeactivate$Parameters.b(a);
                x1yVar.y0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.y0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenMultiaccountSwitcher(x1y x1yVar, String str) {
            try {
                OpenMultiaccountSwitcher$Parameters a = OpenMultiaccountSwitcher$Parameters.a((OpenMultiaccountSwitcher$Parameters) new Gson().fromJson(str, OpenMultiaccountSwitcher$Parameters.class));
                OpenMultiaccountSwitcher$Parameters.b(a);
                x1yVar.w(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.w(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppRelatedPinCodeChanged(x1y x1yVar, String str) {
            try {
                RelatedPinCodeChanged$Parameters a = RelatedPinCodeChanged$Parameters.a((RelatedPinCodeChanged$Parameters) new Gson().fromJson(str, RelatedPinCodeChanged$Parameters.class));
                RelatedPinCodeChanged$Parameters.b(a);
                x1yVar.h1(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.h1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppRelatedProfileCreated(x1y x1yVar, String str) {
            try {
                RelatedProfileCreated$Parameters a = RelatedProfileCreated$Parameters.a((RelatedProfileCreated$Parameters) new Gson().fromJson(str, RelatedProfileCreated$Parameters.class));
                RelatedProfileCreated$Parameters.b(a);
                x1yVar.O0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.O0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppRelatedProfileDeleted(x1y x1yVar, String str) {
            try {
                RelatedProfileDeleted$Parameters a = RelatedProfileDeleted$Parameters.a((RelatedProfileDeleted$Parameters) new Gson().fromJson(str, RelatedProfileDeleted$Parameters.class));
                RelatedProfileDeleted$Parameters.b(a);
                x1yVar.E0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.E0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppSaveCredentials(x1y x1yVar, String str) {
            try {
                SaveCredentials$Parameters a = SaveCredentials$Parameters.a((SaveCredentials$Parameters) new Gson().fromJson(str, SaveCredentials$Parameters.class));
                SaveCredentials$Parameters.b(a);
                x1yVar.F0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.F0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppUserDeactivated(x1y x1yVar, String str) {
            try {
                UserDeactivated$Parameters a = UserDeactivated$Parameters.a((UserDeactivated$Parameters) new Gson().fromJson(str, UserDeactivated$Parameters.class));
                UserDeactivated$Parameters.b(a);
                x1yVar.H(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.H(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppVerifyUserByService(x1y x1yVar, String str) {
            try {
                VerifyUserByService$Parameters a = VerifyUserByService$Parameters.a((VerifyUserByService$Parameters) new Gson().fromJson(str, VerifyUserByService$Parameters.class));
                VerifyUserByService$Parameters.b(a);
                x1yVar.v1(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.v1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppVerifyUserServicesInfo(x1y x1yVar, String str) {
            try {
                VerifyUserServicesInfo$Parameters a = VerifyUserServicesInfo$Parameters.a((VerifyUserServicesInfo$Parameters) new Gson().fromJson(str, VerifyUserServicesInfo$Parameters.class));
                VerifyUserServicesInfo$Parameters.b(a);
                x1yVar.n0(new p2y<>(a, str));
            } catch (Exception e) {
                x1yVar.n0(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    void E0(p2y<RelatedProfileDeleted$Parameters> p2yVar);

    void F0(p2y<SaveCredentials$Parameters> p2yVar);

    void H(p2y<UserDeactivated$Parameters> p2yVar);

    void I(int i, Intent intent);

    void M(p2y<OAuthActivate$Parameters> p2yVar);

    void N0(p2y<ConfirmUserByService$Parameters> p2yVar);

    void O0(p2y<RelatedProfileCreated$Parameters> p2yVar);

    void R(p2y<GetAuthToken$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppAuthByExchangeToken(String str);

    @JavascriptInterface
    void VKWebAppAuthPauseRequests(String str);

    @JavascriptInterface
    void VKWebAppAuthRestore(String str);

    @JavascriptInterface
    void VKWebAppAuthResumeRequests(String str);

    @JavascriptInterface
    void VKWebAppConfirmUserByService(String str);

    @JavascriptInterface
    void VKWebAppGetAuthToken(String str);

    @JavascriptInterface
    void VKWebAppGetRestoreHash(String str);

    @JavascriptInterface
    void VKWebAppGetSilentToken(String str);

    @JavascriptInterface
    void VKWebAppIsMultiaccountAvailable(String str);

    @JavascriptInterface
    void VKWebAppOAuthActivate(String str);

    @JavascriptInterface
    void VKWebAppOAuthDeactivate(String str);

    @JavascriptInterface
    void VKWebAppOpenMultiaccountSwitcher(String str);

    @JavascriptInterface
    void VKWebAppRelatedPinCodeChanged(String str);

    @JavascriptInterface
    void VKWebAppRelatedProfileCreated(String str);

    @JavascriptInterface
    void VKWebAppRelatedProfileDeleted(String str);

    @JavascriptInterface
    void VKWebAppSaveCredentials(String str);

    @JavascriptInterface
    void VKWebAppUserDeactivated(String str);

    @JavascriptInterface
    void VKWebAppVerifyUserByService(String str);

    @JavascriptInterface
    void VKWebAppVerifyUserServicesInfo(String str);

    void W(p2y<IsMultiaccountAvailable$Parameters> p2yVar);

    void Y0(p2y<AuthResumeRequests$Parameters> p2yVar);

    void e0(p2y<GetRestoreHash$Parameters> p2yVar);

    void h1(p2y<RelatedPinCodeChanged$Parameters> p2yVar);

    void n0(p2y<VerifyUserServicesInfo$Parameters> p2yVar);

    void p(p2y<AuthPauseRequests$Parameters> p2yVar);

    void s0(p2y<GetSilentToken$Parameters> p2yVar);

    void u(p2y<AuthRestore$Parameters> p2yVar);

    void v(p2y<AuthByExchangeToken$Parameters> p2yVar);

    void v1(p2y<VerifyUserByService$Parameters> p2yVar);

    void w(p2y<OpenMultiaccountSwitcher$Parameters> p2yVar);

    void y0(p2y<OAuthDeactivate$Parameters> p2yVar);
}
