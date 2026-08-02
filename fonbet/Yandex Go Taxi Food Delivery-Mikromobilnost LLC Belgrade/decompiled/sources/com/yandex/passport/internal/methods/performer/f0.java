package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class f0 implements w0 {
    public final com.yandex.passport.internal.usecase.k0 a;

    public f0(com.yandex.passport.internal.usecase.k0 k0Var) {
        this.a = k0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new GetLocationIdPerformer$performMethod$1((com.yandex.passport.internal.methods.i1) x2Var, this, null));
    }
}
