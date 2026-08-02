package com.yandex.passport.internal.account;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.h;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.network.exception.PartitionNotMatchedException;
import com.yandex.passport.internal.network.m;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.ui.social.gimap.ExtAuthFailedException;
import com.yandex.passport.internal.ui.social.gimap.MailProvider;
import com.yandex.passport.internal.usecase.authorize.j;
import com.yandex.passport.internal.usecase.n;
import com.yandex.passport.internal.usecase.n1;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class c {
    public final com.yandex.passport.internal.network.client.c a;
    public final com.yandex.passport.internal.core.accounts.e b;
    public final p c;
    public final DatabaseHelper d;
    public final b1 e;
    public final com.yandex.passport.internal.network.a f;
    public final j g;
    public final com.yandex.passport.internal.usecase.p h;
    public final n1 i;
    public final n j;

    public c(com.yandex.passport.internal.network.client.c cVar, com.yandex.passport.internal.core.accounts.e eVar, p pVar, DatabaseHelper databaseHelper, b1 b1Var, com.yandex.passport.internal.network.a aVar, j jVar, com.yandex.passport.internal.usecase.p pVar2, n1 n1Var, n nVar) {
        this.a = cVar;
        this.b = eVar;
        this.c = pVar;
        this.d = databaseHelper;
        this.e = b1Var;
        this.f = aVar;
        this.g = jVar;
        this.h = pVar2;
        this.i = n1Var;
        this.j = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserCredentials userCredentials, String str, AnalyticsFromValue analyticsFromValue, ContinuationImpl continuationImpl) {
        LoginController$authorizeByCredentials$1 loginController$authorizeByCredentials$1;
        int i;
        if (continuationImpl instanceof LoginController$authorizeByCredentials$1) {
            loginController$authorizeByCredentials$1 = (LoginController$authorizeByCredentials$1) continuationImpl;
            int i2 = loginController$authorizeByCredentials$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginController$authorizeByCredentials$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loginController$authorizeByCredentials$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loginController$authorizeByCredentials$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    LoginController$authorizeByCredentials$2 loginController$authorizeByCredentials$2 = new LoginController$authorizeByCredentials$2(userCredentials, this, null, null, str, analyticsFromValue, null);
                    loginController$authorizeByCredentials$1.label = 1;
                    obj = tje.k0(mdhVar, loginController$authorizeByCredentials$2, loginController$authorizeByCredentials$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        loginController$authorizeByCredentials$1 = new LoginController$authorizeByCredentials$1(this, continuationImpl);
        Object obj2 = loginController$authorizeByCredentials$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loginController$authorizeByCredentials$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final ModernAccount b(Environment environment, String str, String str2, PassportSocialProviderCode passportSocialProviderCode, AnalyticsFromValue analyticsFromValue) {
        Object h = com.yandex.passport.common.util.a.h(new LoginController$authorizeByMailPassword$1(this, environment, str, str2, passportSocialProviderCode, analyticsFromValue, null));
        kotlin.b.b(h);
        return (ModernAccount) h;
    }

    public final ModernAccount c(Environment environment, h hVar) {
        Object h = com.yandex.passport.common.util.a.h(new LoginController$authorizeByMailPasswordExt$1(this, environment, hVar, null));
        kotlin.b.b(h);
        return (ModernAccount) h;
    }

    public final ModernAccount d(Environment environment, String str, String str2, PassportSocialProviderCode passportSocialProviderCode, String str3) {
        Object h = com.yandex.passport.common.util.a.h(new LoginController$authorizeByNativeMailOAuthToken$1(this, environment, str, str2, passportSocialProviderCode, str3, null));
        kotlin.b.b(h);
        return (ModernAccount) h;
    }

    public final ModernAccount e(Environment environment, String str, AnalyticsFromValue analyticsFromValue) {
        ClientCredentials r = this.c.r(environment);
        if (r == null) {
            throw new PassportCredentialsNotFoundException(com.yandex.passport.internal.util.p.y(environment));
        }
        String decryptedId = r.getDecryptedId();
        this.f.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(ACSPConstants.STATUS);
        if (WriteBlocks.OK.equals(string)) {
            MasterToken from = MasterToken.from(jSONObject.getString("x_token"));
            jSONObject.remove("x_token");
            String e = m.e("access_token", jSONObject);
            ClientToken clientToken = e == null ? null : new ClientToken(e, decryptedId);
            jSONObject.remove("access_token");
            return h(environment, new com.yandex.passport.internal.network.response.e(from, com.yandex.passport.internal.ui.sloth.e.f((int) (System.currentTimeMillis() / 1000), str), clientToken), null, analyticsFromValue);
        }
        ArrayList e2 = com.yandex.passport.internal.network.a.e(jSONObject);
        if (e2 == null || e2.size() <= 0) {
            throw new FailedResponseException(string);
        }
        if (e2.contains("partition.not_matched")) {
            throw new PartitionNotMatchedException();
        }
        if (e2.contains("dc_token.invalid")) {
            throw new InvalidTokenException("dc_token.invalid");
        }
        if (e2.contains("action.impossible")) {
            throw new FailedResponseException("action.impossible");
        }
        throw new FailedResponseException((String) e2.get(0));
    }

    public final MailProvider f(String str, Environment environment) {
        try {
            this.a.a(environment).j(str, "stub");
            throw new IllegalStateException("shouldn't pass auth with stub password");
        } catch (ExtAuthFailedException e) {
            MailProvider mailProvider = e.suggestedProvider;
            return mailProvider == null ? MailProvider.OTHER : mailProvider;
        }
    }

    public final ModernAccount g(Environment environment, MasterToken masterToken, AnalyticsFromValue analyticsFromValue) {
        return this.b.a((ModernAccount) tje.Y(EmptyCoroutineContext.a, new LoginController$fetchModernAccount$1(this, environment, masterToken, null, analyticsFromValue, null)), analyticsFromValue.getEvent(), true);
    }

    public final ModernAccount h(Environment environment, com.yandex.passport.internal.network.response.e eVar, String str, AnalyticsFromValue analyticsFromValue) {
        ModernAccount a = this.b.a(l.b(environment, eVar.b(), eVar.c(), str), analyticsFromValue.getEvent(), true);
        long value = a.getUid().getValue();
        Uid masterUid = a.getMasterUid();
        this.e.l(value, masterUid != null ? Long.valueOf(masterUid.getValue()) : null, a.getUserInfo().getHasMasterToken(), analyticsFromValue, eVar.c().getLocationId());
        if (eVar.a() != null) {
            this.d.putClientToken(a.getUid(), eVar.a());
        }
        return a;
    }
}
