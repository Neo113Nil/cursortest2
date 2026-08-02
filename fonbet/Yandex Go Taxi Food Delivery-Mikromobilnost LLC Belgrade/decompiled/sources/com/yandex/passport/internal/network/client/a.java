package com.yandex.passport.internal.network.client;

import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.analytics.f;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.common.network.o;
import com.yandex.passport.common.network.r;
import com.yandex.passport.common.network.u;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.analytics.l;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.JwtToken;
import com.yandex.passport.internal.entities.PersonProfile;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.h;
import com.yandex.passport.internal.j;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.network.response.LoginSdkResult;
import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.g;
import defpackage.d5j0;
import defpackage.fv;
import defpackage.nci0;
import defpackage.oo31;
import defpackage.rs5;
import defpackage.tls;
import defpackage.w53;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class a {
    public final OkHttpClient a;
    public final u b;
    public final j c;
    public final com.yandex.passport.internal.network.a d;
    public final w e;
    public final f f;
    public final com.yandex.passport.internal.e g;
    public final com.yandex.passport.common.common.a h;

    public a(OkHttpClient okHttpClient, u uVar, j jVar, com.yandex.passport.internal.network.a aVar, w wVar, f fVar, com.yandex.passport.internal.e eVar, com.yandex.passport.common.common.a aVar2) {
        this.a = okHttpClient;
        this.b = uVar;
        this.c = jVar;
        this.d = aVar;
        this.e = wVar;
        this.f = fVar;
        this.g = eVar;
        this.h = aVar2;
    }

    public final void a(MasterToken masterToken, String str, String str2) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        String a = this.g.a();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        Map c = this.f.c(eVar.a(), eVar.b());
        r g = oo31.g((String) this.b.c().a, "/1/bundle/auth/password/multi_step/magic_link/commit/");
        g.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
        g.e(c);
        g.f("track_id", str);
        g.f("language", a);
        g.f("secret", str2);
        e(g.a(), new BackendClient$acceptAuthInTrack$1(this.d));
    }

    public final LoginSdkResult b(MasterToken masterToken, String str) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        r g = oo31.g((String) this.b.c().a, "/2/authorize/commit");
        g.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
        g.f("request_id", str);
        return (LoginSdkResult) e(g.a(), new BackendClient$acceptExternalApplicationPermissions$1(this.d));
    }

    public final String c(MasterToken masterToken) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        Map c = this.f.c(eVar.a(), eVar.b());
        r g = oo31.g((String) this.b.c().a, "/1/bundle/track/init/");
        g.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
        g.g(c);
        return (String) e(g.a(), BackendClient$createTrackWithUid$1.b);
    }

    public final void d(MasterToken masterToken, String str) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        Map c = this.f.c(eVar.a(), eVar.b());
        r g = oo31.g((String) this.b.c().a, "/1/bundle/auth/password/multi_step/magic_link/invalidate/");
        g.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
        g.e(c);
        g.f("track_id", str);
        e(g.a(), new BackendClient$declineAuthInTrack$1(this.d));
    }

    public final Object e(d5j0 d5j0Var, tls tlsVar) {
        int i = 0;
        do {
            try {
                return tlsVar.invoke(((nci0) this.a.newCall(d5j0Var)).execute());
            } catch (FailedResponseException e) {
                boolean z = true;
                i++;
                String message = e.getMessage();
                if (message == null) {
                    Pattern pattern = g.d;
                    z = false;
                } else if (!g.d.matcher(message).find()) {
                    z = "backend.failed".equals(message);
                }
                if (!z) {
                    throw e;
                }
                x xVar = (x) this.e;
                w53 w53Var = new w53();
                w53Var.put("error", Log.getStackTraceString(e));
                xVar.a.a(l.p, w53Var);
                Thread.sleep(300L);
            }
        } while (i < 3);
        throw e;
    }

    public final boolean f(MasterToken masterToken, String str, String str2) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        r rVar = new r((String) this.b.c().a);
        rVar.c("/1/authz_in_app/entrust_to_account/");
        rVar.f("task_id", str);
        rVar.f("code_verifier", str2);
        rVar.f(AuthSdkActivity.RESPONSE_TYPE_TOKEN, nonNullValueOrThrow);
        return ((Boolean) e(rVar.a(), new BackendClient$finishBindApplication$1(this.d))).booleanValue();
    }

    public final JwtToken g(MasterToken masterToken, String str, String str2) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        o oVar = new o((String) this.b.c().a);
        oVar.c("/1/user_info/anonymized");
        oVar.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
        oVar.d("client_id", str);
        oVar.d(EsiaBindWebClient.REDIRECT_PARAM_NAME, str2);
        return (JwtToken) e(oVar.a(), new BackendClient$getAnonymizedUserInfo$1(this.d));
    }

    public final ExternalApplicationPermissionsResult h(MasterToken masterToken, String str, List list, String str2, String str3, String str4, String str5, String str6) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        return (ExternalApplicationPermissionsResult) e(this.b.b(new fv(nonNullValueOrThrow, str, str2, str3, str4, str5, list, str6, this.f.c(eVar.a(), eVar.b()), 1)), new BackendClient$getExternalApplicationPermissions$1(this.d));
    }

    public final JwtToken i(String str) {
        o oVar = new o((String) this.b.c().a);
        oVar.c("/1/yandex_login/info");
        oVar.b("Ya-Consumer-Authorization", "OAuth ".concat(str));
        oVar.d("format", "jwt");
        return (JwtToken) e(oVar.a(), new BackendClient$getJwtToken$1(this.d));
    }

    public final MasterToken j(String str, String str2) {
        j jVar = this.c;
        String decryptedId = jVar.getDecryptedId();
        String decryptedSecret = jVar.getDecryptedSecret();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        Map c = this.f.c(eVar.a(), eVar.b());
        r rVar = new r((String) this.b.c().a);
        rVar.c("/1/external_auth_by_password");
        rVar.f("client_id", decryptedId);
        rVar.f("client_secret", decryptedSecret);
        rVar.f(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, str2);
        rVar.f("email", str);
        rVar.e(c);
        return (MasterToken) e(rVar.a(), BackendClient$getMasterTokenByMailishPassword$1.b);
    }

    public final MasterToken k(h hVar) {
        j jVar = this.c;
        final String decryptedId = jVar.getDecryptedId();
        final String decryptedSecret = jVar.getDecryptedSecret();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        final Map c = this.f.c(eVar.a(), eVar.b());
        final String str = hVar.a;
        final String str2 = hVar.b;
        final String str3 = hVar.c;
        final String str4 = hVar.d;
        final String str5 = hVar.e;
        final boolean z = hVar.f;
        final String str6 = hVar.g;
        final String str7 = hVar.h;
        final String str8 = hVar.i;
        final String str9 = hVar.j;
        final boolean z2 = hVar.k;
        return (MasterToken) e(this.b.b(new tls() { // from class: com.yandex.passport.internal.network.requester.b
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                r rVar = (r) obj;
                rVar.c("/1/external_auth_by_password_ex");
                rVar.f("client_id", decryptedId);
                rVar.f("client_secret", decryptedSecret);
                rVar.e(c);
                rVar.f("imap_login", str2);
                rVar.f("imap_password", str3);
                rVar.f("imap_host", str4);
                rVar.f("imap_port", str5);
                rVar.f("imap_ssl", z ? "yes" : "no");
                rVar.f("smtp_login", str6);
                rVar.f("smtp_password", str7);
                rVar.f("smtp_host", str8);
                rVar.f("smtp_port", str9);
                rVar.f("smtp_ssl", z2 ? "yes" : "no");
                rVar.f("email", str);
                return zy11.a;
            }
        }), BackendClient$getMasterTokenByMailishPasswordExt$1.b);
    }

    public final MasterToken l(String str, String str2, String str3, String str4) {
        j jVar = this.c;
        String decryptedId = jVar.getDecryptedId();
        String decryptedSecret = jVar.getDecryptedSecret();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        return (MasterToken) e(this.b.b(new rs5(decryptedId, decryptedSecret, str, str3, str2, str4, this.f.c(eVar.a(), eVar.b()))), BackendClient$getMasterTokenByMailishSocialToken$1.b);
    }

    public final PersonProfile m(MasterToken masterToken, final boolean z) {
        final String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        tls tlsVar = new tls() { // from class: com.yandex.passport.internal.network.requester.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o oVar = (o) obj;
                oVar.c("/1/bundle/account/");
                oVar.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
                oVar.d("need_display_name_variants", Boolean.toString(z));
                oVar.d("need_social_profiles", Boolean.toString(false));
                return zy11.a;
            }
        };
        o oVar = new o((String) this.b.c().a);
        tlsVar.invoke(oVar);
        return (PersonProfile) e(oVar.a(), BackendClient$getPersonProfile$1.b);
    }

    public final UserInfo n(MasterToken masterToken) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.h;
        s0 s0Var = new s0(5, nonNullValueOrThrow, this.f.c(eVar.a(), eVar.b()));
        o oVar = new o((String) this.b.c().a);
        s0Var.invoke(oVar);
        UserInfo userInfo = (UserInfo) e(oVar.a(), new BackendClient$getUserInfo$1(this.d));
        if (userInfo != null) {
            return userInfo;
        }
        throw new RuntimeException();
    }

    public final com.yandex.passport.internal.network.response.f o(final String str, final boolean z, final boolean z2, ClientCredentials clientCredentials, final String str2, String str3, String str4) {
        j jVar = this.c;
        final String decryptedId = jVar.getDecryptedId();
        final String decryptedSecret = jVar.getDecryptedSecret();
        final String decryptedId2 = clientCredentials != null ? clientCredentials.getDecryptedId() : null;
        final String decryptedSecret2 = clientCredentials != null ? clientCredentials.getDecryptedSecret() : null;
        final Map c = this.f.c(str3, str4);
        return (com.yandex.passport.internal.network.response.f) e(this.b.b(new tls() { // from class: com.yandex.passport.internal.network.requester.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                r rVar = (r) obj;
                rVar.c("/2/bundle/mobile/start/");
                rVar.f(LegacyAccountType.STRING_LOGIN, str);
                rVar.f("force_register", Boolean.toString(z));
                rVar.f("is_phone_number", Boolean.toString(z2));
                rVar.f("x_token_client_id", decryptedId);
                rVar.f("x_token_client_secret", decryptedSecret);
                rVar.f("client_id", decryptedId2);
                rVar.f("client_secret", decryptedSecret2);
                rVar.f("display_language", str2);
                rVar.e(c);
                return zy11.a;
            }
        }), new BackendClient$startAuthorization$1(this.d));
    }

    public final void p(String str, MasterToken masterToken, PersonProfile personProfile) {
        String nonNullValueOrThrow = masterToken.getNonNullValueOrThrow();
        r g = oo31.g((String) this.b.c().a, "/1/bundle/account/person/");
        g.b("Ya-Consumer-Authorization", "OAuth ".concat(nonNullValueOrThrow));
        g.g(personProfile.toMap());
        g.f("track_id", str);
        e(g.a(), BackendClient$updatePersonProfile$1.b);
    }
}
