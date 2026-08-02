package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class mc extends com.yandex.passport.data.network.core.a {
    public final hc f;

    public mc(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, lc lcVar, hc hcVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(kc.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), lcVar);
        this.f = hcVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
