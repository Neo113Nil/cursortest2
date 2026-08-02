package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.internal.methods.x1;
import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class r0 implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.data.network.core.o b;

    public r0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.data.network.core.o oVar) {
        this.a = dVar;
        this.b = oVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new IsMasterTokenValidPerformer$performMethod$1(this, com.yandex.passport.internal.util.p.B((PassportUidImpl) ((x1) x2Var).b.c), null));
    }
}
