package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class zc extends com.yandex.passport.data.network.core.a {
    public final rc f;

    public zc(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, rc rcVar, yc ycVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(uc.Companion.serializer(), com.yandex.passport.common.network.j0.Companion.serializer()), ycVar);
        this.f = rcVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
