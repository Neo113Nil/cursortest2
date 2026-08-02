package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.methods.p1;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class m0 implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.usecase.h0 b;
    public final com.yandex.passport.internal.methods.performer.error.a c;

    public m0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.usecase.h0 h0Var, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = dVar;
        this.b = h0Var;
        this.c = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(p1 p1Var) {
        try {
            Object h = com.yandex.passport.common.util.a.h(new GetTokenPerformer$getToken$1(this, com.yandex.passport.internal.util.p.B((PassportUidImpl) p1Var.b.c), (ClientCredentials) new GetTokenPerformer$performMethod$1$1(p1Var, p1.class, "clientCredentials", "getClientCredentials()Lcom/yandex/passport/internal/credentials/ClientCredentials;", 0).get(), null));
            Throwable a = Result.a(h);
            if (a != null) {
                try {
                    throw com.yandex.passport.internal.methods.performer.error.a.a(this.c, a, null, null, null, null, new PassportActionForbiddenException(), 30);
                } catch (Throwable th) {
                    h = new Result.Failure(th);
                }
            }
            kotlin.b.b(h);
            return (ClientToken) h;
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }
}
