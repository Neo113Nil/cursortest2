package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class l extends com.yandex.passport.data.network.core.a {
    public final f f;

    public l(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, k kVar, f fVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(new j(), d.Companion.serializer()), kVar);
        this.f = fVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
