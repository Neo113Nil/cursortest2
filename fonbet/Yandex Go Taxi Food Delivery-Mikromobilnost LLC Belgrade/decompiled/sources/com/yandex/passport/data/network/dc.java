package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class dc extends com.yandex.passport.data.network.core.a {
    public final yb f;

    public dc(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, cc ccVar, yb ybVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(bc.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), ccVar);
        this.f = ybVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
