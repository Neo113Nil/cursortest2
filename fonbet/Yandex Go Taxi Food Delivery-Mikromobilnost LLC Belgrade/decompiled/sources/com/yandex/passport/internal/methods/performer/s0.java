package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.y1;

/* loaded from: classes8.dex */
public final class s0 implements w0 {
    public final com.yandex.passport.internal.usecase.d0 a;
    public final com.yandex.passport.internal.usecase.v0 b;

    public s0(com.yandex.passport.internal.usecase.d0 d0Var, com.yandex.passport.internal.usecase.v0 v0Var) {
        this.a = d0Var;
        this.b = v0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new LogoutPerformer$performMethod$1(this, com.yandex.passport.internal.util.p.B((PassportUidImpl) ((y1) x2Var).b.c), null));
    }
}
