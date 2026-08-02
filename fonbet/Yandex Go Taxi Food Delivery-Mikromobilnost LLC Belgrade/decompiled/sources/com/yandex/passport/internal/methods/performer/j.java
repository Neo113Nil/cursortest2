package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class j implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.core.accounts.g b;

    public j(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.accounts.g gVar) {
        this.a = dVar;
        this.b = gVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new CorruptMasterTokenPerformer$performMethod$1((com.yandex.passport.internal.methods.h0) x2Var, this, null));
        Throwable a = Result.a(g);
        if (a == null) {
            return g;
        }
        try {
            throw a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
