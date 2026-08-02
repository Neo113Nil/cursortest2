package com.yandex.passport.internal.helper;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.network.r;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.DomikResultImpl;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.usecase.ui.g0;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public final class f {
    public final com.yandex.passport.internal.network.client.c a;
    public final p b;
    public final com.yandex.passport.internal.account.c c;
    public final g0 d;

    public f(com.yandex.passport.internal.network.client.c cVar, p pVar, com.yandex.passport.internal.account.c cVar2, g0 g0Var) {
        this.a = cVar;
        this.b = pVar;
        this.c = cVar2;
        this.d = g0Var;
    }

    public final DomikResultImpl a(String str, Environment environment) {
        AnalyticsFromValue analyticsFromValue;
        ClientCredentials r = this.b.r(environment);
        if (r == null) {
            throw new PassportCredentialsNotFoundException(com.yandex.passport.internal.util.p.y(environment));
        }
        com.yandex.passport.internal.network.client.a a = this.a.a(environment);
        String decryptedId = r.getDecryptedId();
        r rVar = new r((String) a.b.c().a);
        rVar.c("/1/bundle/mobile/auth/sms_code/");
        rVar.f("track_id", str);
        com.yandex.passport.internal.network.response.e eVar = (com.yandex.passport.internal.network.response.e) a.e(rVar.a(), new s0(a, str, decryptedId));
        AnalyticsFromValue.Companion.getClass();
        analyticsFromValue = AnalyticsFromValue.AUTH_BY_SMS;
        ModernAccount h = this.c.h(environment, eVar, null, analyticsFromValue);
        o oVar = DomikResult.Companion;
        ClientToken clientToken = eVar.c;
        PassportLoginAction fromAction = analyticsFromValue.getFromAction();
        EnumSet noneOf = EnumSet.noneOf(FinishRegistrationActivities.class);
        oVar.getClass();
        return new DomikResultImpl(h, clientToken, fromAction, null, noneOf, 8, null);
    }
}
