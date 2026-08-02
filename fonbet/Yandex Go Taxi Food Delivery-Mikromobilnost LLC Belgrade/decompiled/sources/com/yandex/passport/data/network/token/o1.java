package com.yandex.passport.data.network.token;

/* loaded from: classes8.dex */
public final class o1 extends com.yandex.passport.data.network.core.k {
    public final j1 h;

    public o1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, n1 n1Var, j1 j1Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(m1.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), n1Var, oVar, "GetMasterTokenForwardByTrackRequest");
        this.h = j1Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
