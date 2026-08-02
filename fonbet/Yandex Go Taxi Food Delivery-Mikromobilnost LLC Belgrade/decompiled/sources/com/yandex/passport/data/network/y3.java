package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class y3 extends com.yandex.passport.data.network.core.f {
    public final u3 f;

    public y3(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, u3 u3Var) {
        super(aVar, cVar, l0Var, x3.Companion.serializer());
        this.f = u3Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
