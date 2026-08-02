package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class i4 extends com.yandex.passport.data.network.core.n {
    public final c4 h;

    public i4(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, d4 d4Var, h4 h4Var, c4 c4Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, d4Var, h4Var, oVar, "GetClientOrMasterTokenByMasterTokenRequest");
        this.h = c4Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
