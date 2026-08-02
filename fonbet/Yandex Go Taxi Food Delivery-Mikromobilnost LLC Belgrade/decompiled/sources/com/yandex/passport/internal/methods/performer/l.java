package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class l implements w0 {
    public final com.yandex.passport.internal.core.tokens.b a;

    public l(com.yandex.passport.internal.core.tokens.b bVar) {
        this.a = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new DropTokenPerformer$performMethod$1(this, (com.yandex.passport.internal.methods.l0) x2Var, null));
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
