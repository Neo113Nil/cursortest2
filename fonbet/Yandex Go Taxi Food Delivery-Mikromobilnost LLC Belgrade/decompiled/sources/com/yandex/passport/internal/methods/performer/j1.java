package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.q2;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.usecase.p1;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class j1 implements w0 {
    public final p1 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public j1(p1 p1Var, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = p1Var;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object h = com.yandex.passport.common.util.a.h(new TryAddPlusDevicePerformer$performMethod$1((q2) x2Var, this, null));
        Throwable a = Result.a(h);
        if (a == null) {
            return h;
        }
        try {
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
