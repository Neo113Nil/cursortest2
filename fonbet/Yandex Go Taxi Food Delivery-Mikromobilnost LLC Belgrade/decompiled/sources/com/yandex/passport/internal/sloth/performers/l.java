package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.sloth.command.r;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import defpackage.kqn;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class l implements s {
    public final com.yandex.passport.internal.properties.p a;
    public final com.yandex.passport.common.analytics.f b;

    public l(com.yandex.passport.internal.properties.p pVar, com.yandex.passport.common.analytics.f fVar) {
        this.a = pVar;
        this.b = fVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        ClientCredentials r = this.a.r(slothParams.getEnvironment());
        if (r == null) {
            com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.d;
            return dVar instanceof r ? new iqn(dVar) : new kqn(dVar);
        }
        Pair pair = new Pair("clientId", r.getDecryptedId());
        Pair pair2 = new Pair("clientSecret", r.getDecryptedSecret());
        String d = this.b.d();
        return new iqn(com.yandex.passport.internal.ui.sloth.e.b(pair, pair2, new Pair("deviceId", d != null ? new com.yandex.passport.common.value.a(d) : null)));
    }
}
