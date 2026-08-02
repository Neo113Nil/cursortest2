package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class h0 implements w0 {
    public final com.yandex.passport.internal.helper.h a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public h0(com.yandex.passport.internal.helper.h hVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new GetPersonProfilePerformer$performMethod$1((com.yandex.passport.internal.methods.k1) x2Var, this, null));
        Throwable a = Result.a(g);
        if (a == null) {
            return g;
        }
        try {
            com.yandex.passport.internal.methods.performer.error.a aVar = this.b;
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, null, null, null, new PassportFailedResponseException(message), 30);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
