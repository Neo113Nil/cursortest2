package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class i0 extends com.yandex.passport.data.network.core.a {
    public final d0 f;

    public i0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, d0 d0Var, h0 h0Var) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(g0.Companion.serializer(), com.yandex.passport.common.network.j0.Companion.serializer()), h0Var);
        this.f = d0Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
