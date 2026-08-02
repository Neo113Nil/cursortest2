package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class y1 extends com.yandex.passport.data.network.core.g {
    public final u1 h;

    public y1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, u1 u1Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, x1.Companion.serializer(), oVar, "DisablePhonishRequest");
        this.h = u1Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
