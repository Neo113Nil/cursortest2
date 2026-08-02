package com.yandex.passport.data.network.token;

/* loaded from: classes15.dex */
public final class r0 extends com.yandex.passport.data.network.core.k {
    public final l0 h;

    public r0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, m0 m0Var, q0 q0Var, l0 l0Var2, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, m0Var, q0Var, oVar, "GetMasterTokenByMailishSocialTaskIdRequest");
        this.h = l0Var2;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
