package com.yandex.passport.data.network.token;

/* loaded from: classes8.dex */
public final class f0 extends com.yandex.passport.data.network.core.k {
    public final z h;

    public f0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, a0 a0Var, e0 e0Var, z zVar, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, a0Var, e0Var, oVar, "GetMasterTokenByDeviceCodeRequest");
        this.h = zVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
