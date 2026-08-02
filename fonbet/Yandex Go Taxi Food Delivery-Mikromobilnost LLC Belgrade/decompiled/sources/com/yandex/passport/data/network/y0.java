package com.yandex.passport.data.network;

import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class y0 extends com.yandex.passport.data.network.core.a {
    public final u0 f;
    public final com.yandex.passport.data.network.core.s g;

    public y0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, u0 u0Var, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(x0.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), new com.yandex.passport.data.network.core.j());
        this.f = u0Var;
        this.g = sVar;
    }

    @Override // com.yandex.passport.data.network.core.a, com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        t0 t0Var = (t0) obj;
        return this.g.a(new com.yandex.passport.data.network.core.r(t0Var, "CompleteStatusRequest", new s0(this, t0Var, 0)), continuation);
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }

    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: d */
    public final Object b(Object obj, Continuation continuation) {
        t0 t0Var = (t0) obj;
        return this.g.a(new com.yandex.passport.data.network.core.r(t0Var, "CompleteStatusRequest", new s0(this, t0Var, 0)), continuation);
    }
}
