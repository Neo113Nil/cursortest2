package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.oauth.VkOAuthGoal;
import com.vk.auth.oauth.VkOAuthRouterInfo;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthPauseRequests$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthPauseRequests$Response;
import com.vk.superapp.auth.js.bridge.api.events.AuthRestore$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthResumeRequests$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.ConfirmUserByService$Error;
import com.vk.superapp.auth.js.bridge.api.events.ConfirmUserByService$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.ConfirmUserByService$Response;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Error;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetRestoreHash$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetRestoreHash$Response;
import com.vk.superapp.auth.js.bridge.api.events.GetSilentToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.IsMultiaccountAvailable$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.IsMultiaccountAvailable$Response;
import com.vk.superapp.auth.js.bridge.api.events.OAuthActivate$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OAuthDeactivate$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OpenMultiaccountSwitcher$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OpenMultiaccountSwitcher$Response;
import com.vk.superapp.auth.js.bridge.api.events.RelatedPinCodeChanged$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedProfileCreated$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedProfileDeleted$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.SaveCredentials$Error;
import com.vk.superapp.auth.js.bridge.api.events.SaveCredentials$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.UserDeactivated$Error;
import com.vk.superapp.auth.js.bridge.api.events.UserDeactivated$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserByService$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserServicesInfo$Error;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserServicesInfo$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserServicesInfo$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.verification.account.VerificationFlow;
import com.vk.toggle.anonymous.SakFeatures;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.g2y;
import xsna.lvv0;
import xsna.p2y;
import xsna.pgn0;
import xsna.x6y;

/* compiled from: JsAuthDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class l2y extends z46 implements g2y {
    public xwv0 d;
    public final com.vk.superapp.base.js.bridge.b e;
    public final g2y.a f;
    public final awz g;
    public final j5y h;
    public final tdk i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;

    /* compiled from: JsAuthDelegateImpl.kt */
    public static final /* synthetic */ class a extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((l2y) this.receiver).d;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((l2y) this.receiver).d = (xwv0) obj;
        }
    }

    public l2y(xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar, g2y.a aVar, awz awzVar, j5y j5yVar, bpn0 bpn0Var, tdk tdkVar) {
        super(xwv0Var, 4);
        this.d = xwv0Var;
        this.e = bVar;
        this.f = aVar;
        this.g = awzVar;
        this.h = j5yVar;
        this.i = tdkVar;
        this.j = new bpn0(new qbj(this, 20));
        this.k = new bpn0(new tvj(this, 16));
        this.l = new bpn0(new com.vk.movika.sdk.base.ui.m(10, bpn0Var, this));
        this.m = new bpn0(new cvs(this, 9));
    }

    @Override // xsna.x1y
    public final void F0(p2y<SaveCredentials$Parameters> p2yVar) {
        SaveCredentials$Parameters saveCredentials$Parameters;
        VkUiView view;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppSaveCredentials"), b);
        Activity activity = null;
        if (!m()) {
            w0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            saveCredentials$Parameters = p2yVar.a();
        } catch (Exception e) {
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(w0.a, new JsMethod("VKWebAppSaveCredentials"), new SaveCredentials$Error(null, new SaveCredentials$Error.Data(SaveCredentials$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
            saveCredentials$Parameters = null;
        }
        SaveCredentials$Parameters saveCredentials$Parameters2 = saveCredentials$Parameters;
        if (saveCredentials$Parameters2 == null) {
            return;
        }
        int i = 15;
        kp5 kp5Var = new kp5(i, this, b);
        if (!SakFeatures.Type.SAK_PASSWORD_AUTO_COMPLETE_ANDROID.h()) {
            kp5Var.invoke(Boolean.FALSE);
            return;
        }
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null && (view = xwv0Var.getView()) != null) {
            activity = view.B0();
        }
        if (activity == null || !(activity instanceof f5z)) {
            kp5Var.invoke(Boolean.FALSE);
            return;
        }
        this.i.c();
        r55 r55Var = r55.a;
        oou0 oou0Var = (oou0) r55.c.getValue();
        if (oou0Var != null) {
            oou0Var.b(activity, g5z.a((f5z) activity)).a(new VkAuthCredentials(saveCredentials$Parameters2.c(), saveCredentials$Parameters2.d()), new com.vk.catalog2.common.ui.holders.a(i, this, kp5Var), new k22(9, this, kp5Var));
        }
    }

    @Override // xsna.x1y
    public final void H(p2y<UserDeactivated$Parameters> p2yVar) {
        VkUiView view;
        izs<lvv0, s3q0> ke;
        x6y.f fVar = this.f.c;
        JsMethod jsMethod = new JsMethod("VKWebAppUserDeactivated");
        String b = p2yVar.b();
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        bVar.k(jsMethod, b);
        try {
            p2yVar.a();
        } catch (Exception e) {
            com.vk.superapp.base.js.bridge.b.o(bVar, jsMethod, new UserDeactivated$Error(null, new UserDeactivated$Error.Data(UserDeactivated$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null)), 1, null), null, null, 12);
        }
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || (view = xwv0Var.getView()) == null || (ke = view.ke()) == null) {
            return;
        }
        ke.invoke(new lvv0.b(false, ((w25) fVar.invoke()).a, ((w25) fVar.invoke()).f, true));
    }

    @Override // xsna.x1y
    public final void I(int i, Intent intent) {
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        String b = defpackage.j0.b("VKWebAppConfirmUserByService", bVar);
        if (i != -1 || intent == null) {
            com.vk.superapp.base.js.bridge.b.o(bVar, new JsMethod("VKWebAppConfirmUserByService"), new ConfirmUserByService$Error(null, new ConfirmUserByService$Error.Data(ConfirmUserByService$Error.Data.Type.CLIENT_ERROR, b, null), 1, null), null, null, 12);
        } else {
            com.vk.superapp.base.js.bridge.b.p(bVar, new JsMethod("VKWebAppConfirmUserByService"), new ConfirmUserByService$Response(null, new ConfirmUserByService$Response.Data(intent.getStringExtra("callbackURL"), b), b, 1, null), null, null, false, null, 60);
        }
    }

    @Override // xsna.z46
    public final xwv0 L() {
        return this.d;
    }

    public final w1n0 L0() {
        return (w1n0) this.k.getValue();
    }

    @Override // xsna.x1y
    public final void M(p2y<OAuthActivate$Parameters> p2yVar) {
        OAuthActivate$Parameters oAuthActivate$Parameters;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppOAuthActivate"), b);
        if (!m()) {
            w0().i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            oAuthActivate$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            oAuthActivate$Parameters = null;
        }
        OAuthActivate$Parameters oAuthActivate$Parameters2 = oAuthActivate$Parameters;
        if (oAuthActivate$Parameters2 == null) {
            return;
        }
        VkOAuthService.a aVar = VkOAuthService.Companion;
        String c = p2yVar.a().c();
        aVar.getClass();
        VkOAuthService a2 = VkOAuthService.a.a(c);
        if ((a2 != null ? a2.i() : null) == null) {
            w0().i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "No service name for " + oAuthActivate$Parameters2.c() + JwtParser.SEPARATOR_CHAR, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        com.vk.auth.oauth.a aVar2 = umu0Var.j;
        Context a3 = r55.a();
        VkOAuthRouterInfo vkOAuthRouterInfo = new VkOAuthRouterInfo(a2, null, null, VkOAuthGoal.ACTIVATION);
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent intent = new Intent(a3, (Class<?>) AuthActivity.OauthActivity.class);
        intent.putExtra("oauthData", vkOAuthRouterInfo);
        a3.startActivity(intent.addFlags(268435456));
    }

    @Override // xsna.x1y
    public final void N0(p2y<ConfirmUserByService$Parameters> p2yVar) {
        ConfirmUserByService$Parameters confirmUserByService$Parameters;
        Context a2;
        VkUiView view;
        JsMethod jsMethod = new JsMethod("VKWebAppConfirmUserByService");
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        if (bVar.j(jsMethod)) {
            return;
        }
        bVar.k(jsMethod, p2yVar.b());
        try {
            confirmUserByService$Parameters = p2yVar.a();
        } catch (Exception e) {
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(bVar, new JsMethod("VKWebAppConfirmUserByService"), new ConfirmUserByService$Error(null, new ConfirmUserByService$Error.Data(ConfirmUserByService$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
            confirmUserByService$Parameters = null;
        }
        ConfirmUserByService$Parameters confirmUserByService$Parameters2 = confirmUserByService$Parameters;
        if (confirmUserByService$Parameters2 != null) {
            xwv0 xwv0Var = this.d;
            if (xwv0Var == null || (view = xwv0Var.getView()) == null || (a2 = view.B0()) == null) {
                r55 r55Var = r55.a;
                a2 = r55.a();
            }
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            (superappUiRouterBridge != null ? superappUiRouterBridge : null).C(a2, confirmUserByService$Parameters2.d(), confirmUserByService$Parameters2.c());
        }
    }

    @Override // xsna.x1y
    public final void R(p2y<GetAuthToken$Parameters> p2yVar) {
        GetAuthToken$Parameters getAuthToken$Parameters;
        sf3.b("VKWebAppGetAuthToken", this.e, p2yVar.b());
        try {
            getAuthToken$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0().a(GetAuthToken$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            getAuthToken$Parameters = null;
        }
        GetAuthToken$Parameters getAuthToken$Parameters2 = getAuthToken$Parameters;
        if (getAuthToken$Parameters2 != null) {
            ypt yptVar = (ypt) this.m.getValue();
            rvp rvpVar = yptVar.e;
            com.vk.movika.sdk.base.logic.interactor.i iVar = new com.vk.movika.sdk.base.logic.interactor.i(13, yptVar, getAuthToken$Parameters2);
            xwv0 xwv0Var = (xwv0) yptVar.a.get();
            Long valueOf = xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null;
            if (valueOf != null && valueOf.longValue() > 0) {
                if (valueOf.longValue() != getAuthToken$Parameters2.d()) {
                    ypt.b(rvpVar, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), getAuthToken$Parameters2.f(), 1, null));
                    return;
                }
            }
            iVar.invoke(getAuthToken$Parameters2);
        }
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthByExchangeToken(String str) {
        g2y.b.VKWebAppAuthByExchangeToken(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthPauseRequests(String str) {
        g2y.b.VKWebAppAuthPauseRequests(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthRestore(String str) {
        g2y.b.VKWebAppAuthRestore(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthResumeRequests(String str) {
        g2y.b.VKWebAppAuthResumeRequests(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppConfirmUserByService(String str) {
        g2y.b.VKWebAppConfirmUserByService(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppGetAuthToken(String str) {
        g2y.b.VKWebAppGetAuthToken(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppGetRestoreHash(String str) {
        g2y.b.VKWebAppGetRestoreHash(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppGetSilentToken(String str) {
        g2y.b.VKWebAppGetSilentToken(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppIsMultiaccountAvailable(String str) {
        g2y.b.VKWebAppIsMultiaccountAvailable(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppOAuthActivate(String str) {
        g2y.b.VKWebAppOAuthActivate(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppOAuthDeactivate(String str) {
        g2y.b.VKWebAppOAuthDeactivate(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppOpenMultiaccountSwitcher(String str) {
        g2y.b.VKWebAppOpenMultiaccountSwitcher(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppRelatedPinCodeChanged(String str) {
        g2y.b.VKWebAppRelatedPinCodeChanged(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppRelatedProfileCreated(String str) {
        g2y.b.VKWebAppRelatedProfileCreated(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppRelatedProfileDeleted(String str) {
        g2y.b.VKWebAppRelatedProfileDeleted(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppSaveCredentials(String str) {
        g2y.b.VKWebAppSaveCredentials(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppUserDeactivated(String str) {
        g2y.b.VKWebAppUserDeactivated(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppVerifyUserByService(String str) {
        g2y.b.VKWebAppVerifyUserByService(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppVerifyUserServicesInfo(String str) {
        g2y.b.VKWebAppVerifyUserServicesInfo(this, str);
    }

    @Override // xsna.x1y
    public final void W(p2y<IsMultiaccountAvailable$Parameters> p2yVar) {
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppIsMultiaccountAvailable"), b);
        if (!m()) {
            w0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        try {
            p2yVar.a();
            com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppIsMultiaccountAvailable"), new IsMultiaccountAvailable$Response(null, new IsMultiaccountAvailable$Response.Data(this.h.b(), b), b, 1, null), null, null, false, null, 60);
        } catch (Exception e) {
            w0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
        }
    }

    @Override // xsna.x1y
    public final void Y0(p2y<AuthResumeRequests$Parameters> p2yVar) {
        wvs wvsVar = this.f.d;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppAuthResumeRequests"), b);
        try {
            if (!m()) {
                w0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
                return;
            }
            p2yVar.a();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.C(null);
            L0().a(b);
        } catch (Exception e) {
            w0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
        } finally {
            wvsVar.a();
        }
    }

    @Override // xsna.x1y
    public final void e0(p2y<GetRestoreHash$Parameters> p2yVar) {
        String str;
        String b = p2yVar.b();
        sf3.b("VKWebAppGetRestoreHash", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            w0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            if (!m()) {
                w0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
                return;
            }
            try {
                q55 q55Var = q55.a;
                str = q55.c().a.B;
            } catch (Throwable unused) {
                str = null;
            }
            try {
                if (str != null) {
                    com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppGetRestoreHash"), new GetRestoreHash$Response(null, new GetRestoreHash$Response.Data(str, b), b, 1, null), null, null, false, null, 60);
                } else {
                    w0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, "Auth hash is absent", 1, null), null, null, 114686, null), b, 1, null));
                }
            } catch (Exception unused2) {
                w0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
            }
        }
    }

    @Override // xsna.x1y
    public final void h1(p2y<RelatedPinCodeChanged$Parameters> p2yVar) {
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            xwv0Var.O(axv0.a);
        }
    }

    @Override // xsna.x1y
    public final void n0(p2y<VerifyUserServicesInfo$Parameters> p2yVar) {
        JsMethod jsMethod = new JsMethod("VKWebAppVerifyUserServicesInfo");
        String b = p2yVar.b();
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        bVar.k(jsMethod, b);
        VerifyUserServicesInfo$Parameters verifyUserServicesInfo$Parameters = null;
        if (!m()) {
            com.vk.superapp.base.js.bridge.b.o(bVar, jsMethod, new VerifyUserServicesInfo$Error(null, 1, null), null, null, 12);
            return;
        }
        try {
            verifyUserServicesInfo$Parameters = p2yVar.a();
        } catch (Exception e) {
            new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(bVar, jsMethod, new VerifyUserServicesInfo$Error(null, 1, null), null, null, 12);
        }
        VerifyUserServicesInfo$Parameters verifyUserServicesInfo$Parameters2 = verifyUserServicesInfo$Parameters;
        if (verifyUserServicesInfo$Parameters2 != null) {
            cnr0 cnr0Var = (cnr0) this.l.getValue();
            List<go70> d = ((com.vk.auth.oauth.di.b) cnr0Var.a.getValue()).d();
            ArrayList arrayList = new ArrayList(c5g.u(d, 10));
            for (go70 go70Var : d) {
                String i = go70Var.a.i();
                if (i == null) {
                    i = "";
                }
                arrayList.add(new VerifyUserServicesInfo$Response.Data.SupportedOauthVerificationProviders(i, go70Var.b));
            }
            w1n0 w1n0Var = cnr0Var.b;
            String c = verifyUserServicesInfo$Parameters2.c();
            com.vk.superapp.base.js.bridge.b.p(w1n0Var.a, new JsMethod("VKWebAppVerifyUserServicesInfo"), new VerifyUserServicesInfo$Response(null, new VerifyUserServicesInfo$Response.Data(arrayList, c), c, 1, null), null, null, false, null, 60);
        }
    }

    @Override // xsna.x1y
    public final void p(p2y<AuthPauseRequests$Parameters> p2yVar) {
        AuthPauseRequests$Parameters authPauseRequests$Parameters;
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        gvv0 view2;
        wvs wvsVar = this.f.d;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppAuthPauseRequests"), b);
        if (!m()) {
            w0().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            authPauseRequests$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            authPauseRequests$Parameters = null;
        }
        AuthPauseRequests$Parameters authPauseRequests$Parameters2 = authPauseRequests$Parameters;
        if (authPauseRequests$Parameters2 == null) {
            return;
        }
        try {
            fvv0 fvv0Var = (fvv0) wvsVar.a.invoke();
            if (fvv0Var != null && (view2 = fvv0Var.getView()) != null) {
                up2.j(hg1.m(wvsVar.b, view2.B0(), 0L, false, 52).subscribe(), view2);
            }
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            int i = pgn0.a.a;
            String str = wdx0Var.c().a;
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.C(str);
            io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(new yw1(1));
            xwv0 xwv0Var = this.d;
            if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
                D6.b(fVar);
            }
            com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppAuthPauseRequests"), new AuthPauseRequests$Response(null, new AuthPauseRequests$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } catch (Exception e2) {
            wvsVar.a();
            rvp w02 = w0();
            String c = authPauseRequests$Parameters2.c();
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown reason.";
            }
            w02.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, message, 1, null), null, null, 114686, null), c, 1, null));
        }
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
    }

    @Override // xsna.x1y
    public final void s0(p2y<GetSilentToken$Parameters> p2yVar) {
        GetSilentToken$Parameters getSilentToken$Parameters;
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppGetSilentToken"), b);
        rvp w0 = w0();
        try {
            getSilentToken$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            getSilentToken$Parameters = null;
        }
        GetSilentToken$Parameters getSilentToken$Parameters2 = getSilentToken$Parameters;
        if (getSilentToken$Parameters2 == null) {
            return;
        }
        xwv0 xwv0Var = this.d;
        long appId = xwv0Var != null ? xwv0Var.getAppId() : 0L;
        if (appId > 0 && appId != getSilentToken$Parameters2.c()) {
            w0().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "Presenter app id is not equal to the request app id.", null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        vdx0 vdx0Var = e370.e;
        io.reactivex.rxjava3.disposables.c subscribe = (vdx0Var != null ? vdx0Var : null).e().m(getSilentToken$Parameters2.c()).subscribe(new p41(new yl0(13, this, b), 29), new kjs(new mh4(18, this, b), 2));
        xwv0 xwv0Var2 = this.d;
        if (xwv0Var2 == null || (view = xwv0Var2.getView()) == null || (D6 = view.D6()) == null) {
            return;
        }
        D6.b(subscribe);
    }

    @Override // xsna.x1y
    public final void u(p2y<AuthRestore$Parameters> p2yVar) {
        AuthRestore$Parameters authRestore$Parameters;
        VkAuthMetaInfo vkAuthMetaInfo;
        g2y.a aVar = this.f;
        x6y.f fVar = aVar.c;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppAuthRestore"), b);
        int i = 0;
        if (!m()) {
            w0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            authRestore$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            authRestore$Parameters = null;
        }
        AuthRestore$Parameters authRestore$Parameters2 = authRestore$Parameters;
        if (authRestore$Parameters2 == null) {
            return;
        }
        String str = ((w25) fVar.invoke()).a;
        if (str == null) {
            w0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
            return;
        }
        long c = authRestore$Parameters2.c();
        gzs<s3q0> gzsVar = fkq0.a;
        AuthResult authResult = new AuthResult(str, ((w25) fVar.invoke()).c, new UserId(c), false, 0, null, (VkAuthCredentials) aVar.a.invoke(), null, null, 0, null, 0, null, null, null, 0L, null, ((w25) fVar.invoke()).f, null, null, null, null, null, 8257464, null);
        try {
            q55 q55Var = q55.a;
            vkAuthMetaInfo = q55.c().a.I;
        } catch (Throwable unused) {
            vkAuthMetaInfo = null;
        }
        if (vkAuthMetaInfo == null) {
            vkAuthMetaInfo = VkAuthMetaInfo.h;
        }
        l55 l55Var = l55.a;
        r55 r55Var = r55.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 b2 = l55Var.b(r55.a(), authResult, VkAuthMetaInfo.zb(vkAuthMetaInfo, null, AuthTarget.a(vkAuthMetaInfo.f, null, false, false, true, 23), null, 47));
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            xwv0Var.w(b2.subscribe(new k2y(new d05(22, b, (Object) this), i), new y00(new bp7(17, this, b), 24)));
        }
    }

    @Override // xsna.x1y
    public final void v(p2y<AuthByExchangeToken$Parameters> p2yVar) {
        AuthByExchangeToken$Parameters authByExchangeToken$Parameters;
        g2y.a aVar = this.f;
        String b = p2yVar.b();
        JsMethod jsMethod = new JsMethod("VKWebAppAuthByExchangeToken");
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        bVar.k(jsMethod, b);
        if (!m()) {
            w0().d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            authByExchangeToken$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            authByExchangeToken$Parameters = null;
        }
        AuthByExchangeToken$Parameters authByExchangeToken$Parameters2 = authByExchangeToken$Parameters;
        if (authByExchangeToken$Parameters2 == null) {
            return;
        }
        try {
            r55 r55Var = r55.a;
            a2y a2yVar = new a2y(r55.a(), (VkAuthCredentials) aVar.a.invoke(), bVar, new a(this, l2y.class, "presenter", "getPresenter()Lcom/vk/superapp/base/js/bridge/VkUiPresenter;", 0), b, new h57(13, this, authByExchangeToken$Parameters2));
            a2yVar.d(l55.e(l55.a, a2yVar.f, authByExchangeToken$Parameters2.c(), UserId.d, a2yVar.b(), AuthByExchangeTokenInitiator.WEB_HANDLER_AUTHORIZATION));
        } catch (Exception e2) {
            aVar.d.a();
            rvp w02 = w0();
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown reason.";
            }
            w02.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, message, 1, null), null, null, 114686, null), b, 1, null));
        }
    }

    @Override // xsna.x1y
    public final void v1(p2y<VerifyUserByService$Parameters> p2yVar) {
        VerifyUserByService$Parameters verifyUserByService$Parameters;
        this.e.k(new JsMethod("VKWebAppVerifyUserByService"), p2yVar.b());
        if (!m()) {
            w0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), p2yVar.b(), 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            verifyUserByService$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            verifyUserByService$Parameters = null;
        }
        VerifyUserByService$Parameters verifyUserByService$Parameters2 = verifyUserByService$Parameters;
        if (verifyUserByService$Parameters2 != null) {
            cnr0 cnr0Var = (cnr0) this.l.getValue();
            rvp rvpVar = cnr0Var.c;
            VkOAuthService.a aVar = VkOAuthService.Companion;
            String e2 = verifyUserByService$Parameters2.e();
            aVar.getClass();
            VkOAuthService a2 = VkOAuthService.a.a(e2);
            if (a2 == null) {
                rvpVar.c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "Could not find VkOAuthService for '" + verifyUserByService$Parameters2.e() + "' service name.", null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), verifyUserByService$Parameters2.d(), 1, null));
                return;
            }
            List<String> c = verifyUserByService$Parameters2.c();
            String d = verifyUserByService$Parameters2.d();
            if (!((com.vk.auth.oauth.di.b) cnr0Var.a.getValue()).c(a2)) {
                rvpVar.c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "Verification for '" + a2 + "' is not supported.", null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), d, 1, null));
                return;
            }
            List<String> list = c;
            VerificationFlow app2App = (list == null || list.isEmpty()) ? VerificationFlow.Web.b : new VerificationFlow.App2App(c);
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
            r55 r55Var = r55.a;
            r55.a();
            superappUiRouterBridge2.G(a2.name(), app2App);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.x1y
    public final void w(p2y<OpenMultiaccountSwitcher$Parameters> p2yVar) {
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppOpenMultiaccountSwitcher"), b);
        if (!m()) {
            w0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        try {
            p2yVar.a();
            this.h.a();
            com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppOpenMultiaccountSwitcher"), new OpenMultiaccountSwitcher$Response(null, new OpenMultiaccountSwitcher$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } catch (Exception e) {
            w0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
        }
    }

    public final rvp w0() {
        return (rvp) this.j.getValue();
    }

    @Override // xsna.x1y
    public final void y0(p2y<OAuthDeactivate$Parameters> p2yVar) {
        OAuthDeactivate$Parameters oAuthDeactivate$Parameters;
        VkUiView view;
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppOAuthDeactivate"), b);
        if (!m()) {
            w0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b, 1, null));
            return;
        }
        rvp w0 = w0();
        try {
            oAuthDeactivate$Parameters = p2yVar.a();
        } catch (Exception e) {
            w0.j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, e.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            oAuthDeactivate$Parameters = null;
        }
        OAuthDeactivate$Parameters oAuthDeactivate$Parameters2 = oAuthDeactivate$Parameters;
        if (oAuthDeactivate$Parameters2 == null) {
            return;
        }
        VkOAuthService.a aVar = VkOAuthService.Companion;
        String d = oAuthDeactivate$Parameters2.d();
        aVar.getClass();
        VkOAuthService a2 = VkOAuthService.a.a(d);
        String i = a2 != null ? a2.i() : null;
        if (i == null) {
            w0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "No service name for " + oAuthDeactivate$Parameters2.d() + JwtParser.SEPARATOR_CHAR, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || (view = xwv0Var.getView()) == null) {
            return;
        }
        String c = oAuthDeactivate$Parameters2.c();
        Boolean e2 = oAuthDeactivate$Parameters2.e();
        vdx0 vdx0Var = e370.e;
        view.D6().b((vdx0Var != null ? vdx0Var : null).q().b(e2, i, c).subscribe(new vl0(new jp5(14, this, b), 26), new mp0(new u6(21, this, b), 28)));
    }

    @Override // xsna.x1y
    public final void E0(p2y<RelatedProfileDeleted$Parameters> p2yVar) {
    }

    @Override // xsna.x1y
    public final void O0(p2y<RelatedProfileCreated$Parameters> p2yVar) {
    }
}
