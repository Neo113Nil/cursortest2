package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class oa extends com.yandex.passport.data.network.core.a {
    public final ja f;

    public oa(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, ja jaVar, na naVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(ma.Companion.serializer(), com.yandex.passport.common.network.j0.Companion.serializer()), naVar);
        this.f = jaVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
