package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.t1;
import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class p0 implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;

    public p0(com.yandex.passport.internal.core.accounts.d dVar) {
        this.a = dVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new GetUidByNormalizedLoginPerformer$performMethod$1((t1) x2Var, this, null));
    }
}
