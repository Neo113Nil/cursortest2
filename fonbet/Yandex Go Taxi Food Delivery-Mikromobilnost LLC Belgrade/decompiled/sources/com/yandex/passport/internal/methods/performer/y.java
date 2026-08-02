package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class y implements w0 {
    public final com.yandex.passport.internal.usecase.f0 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public y(com.yandex.passport.internal.usecase.f0 f0Var, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = f0Var;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object h = com.yandex.passport.common.util.a.h(new GetChildCodeByUidParentPerformer$performMethod$1((com.yandex.passport.internal.methods.a1) x2Var, this, null));
        Throwable a = Result.a(h);
        if (a == null) {
            return h;
        }
        try {
            com.yandex.passport.internal.methods.performer.error.a aVar = this.b;
            String localizedMessage = a.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, new PassportFailedResponseException(localizedMessage), null, null, null, 58);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
