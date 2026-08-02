package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.FlagName;
import com.yandex.passport.internal.methods.x2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class x implements w0 {
    public final com.yandex.passport.internal.flags.j a;

    public x(com.yandex.passport.internal.flags.j jVar) {
        this.a = jVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.flags.a aVar;
        try {
            int i = w.a[((FlagName) ((com.yandex.passport.internal.methods.z0) x2Var).b.c).ordinal()];
            if (i == 1) {
                aVar = com.yandex.passport.internal.flags.q.a0;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = com.yandex.passport.internal.flags.q.b;
            }
            Boolean bool = (Boolean) this.a.b(aVar);
            bool.getClass();
            return bool;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
