package xsna;

import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Error;
import com.vk.superapp.auth.js.bridge.api.events.AuthPauseRequests$Error;
import com.vk.superapp.auth.js.bridge.api.events.AuthRestore$Error;
import com.vk.superapp.auth.js.bridge.api.events.AuthResumeRequests$Error;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Error;
import com.vk.superapp.auth.js.bridge.api.events.GetRestoreHash$Error;
import com.vk.superapp.auth.js.bridge.api.events.GetSilentToken$Error;
import com.vk.superapp.auth.js.bridge.api.events.IsMultiaccountAvailable$Error;
import com.vk.superapp.auth.js.bridge.api.events.OAuthActivate$Error;
import com.vk.superapp.auth.js.bridge.api.events.OAuthDeactivate$Error;
import com.vk.superapp.auth.js.bridge.api.events.OpenMultiaccountSwitcher$Error;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserByService$Error;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$AuthError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class rvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public rvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(GetAuthToken$Error.Data.Type type, Responses$AuthError responses$AuthError, Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetAuthToken"), new GetAuthToken$Error(null, new GetAuthToken$Error.Data(type, responses$ClientError != null ? responses$ClientError.c() : null, responses$AuthError, responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetSilentToken"), new GetSilentToken$Error(str, new GetSilentToken$Error.Data(GetSilentToken$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), null, responses$ClientError, 4, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppVerifyUserByService"), new VerifyUserByService$Error(null, new VerifyUserByService$Error.Data(VerifyUserByService$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void d(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAuthByExchangeToken"), new AuthByExchangeToken$Error(null, new AuthByExchangeToken$Error.Data(AuthByExchangeToken$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAuthPauseRequests"), new AuthPauseRequests$Error(null, new AuthPauseRequests$Error.Data(AuthPauseRequests$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAuthResumeRequests"), new AuthResumeRequests$Error(null, new AuthResumeRequests$Error.Data(AuthResumeRequests$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetRestoreHash"), new GetRestoreHash$Error(null, new GetRestoreHash$Error.Data(GetRestoreHash$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppIsMultiaccountAvailable"), new IsMultiaccountAvailable$Error(null, new IsMultiaccountAvailable$Error.Data(IsMultiaccountAvailable$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppOAuthActivate"), new OAuthActivate$Error(null, new OAuthActivate$Error.Data(OAuthActivate$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppOAuthDeactivate"), new OAuthDeactivate$Error(null, new OAuthDeactivate$Error.Data(OAuthDeactivate$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppOpenMultiaccountSwitcher"), new OpenMultiaccountSwitcher$Error(null, new OpenMultiaccountSwitcher$Error.Data(OpenMultiaccountSwitcher$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAuthRestore"), new AuthRestore$Error(null, new AuthRestore$Error.Data(AuthRestore$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }
}
