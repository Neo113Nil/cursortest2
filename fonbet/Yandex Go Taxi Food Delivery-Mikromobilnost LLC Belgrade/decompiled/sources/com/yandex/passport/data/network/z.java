package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class z extends com.yandex.passport.data.network.core.a {
    public final u f;

    public z(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, u uVar, y yVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(x.Companion.serializer(), com.yandex.passport.common.network.j0.Companion.serializer()), yVar);
        this.f = uVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
