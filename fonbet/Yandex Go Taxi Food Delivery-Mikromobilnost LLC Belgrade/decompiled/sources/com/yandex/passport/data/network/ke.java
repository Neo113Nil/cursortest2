package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class ke extends com.yandex.passport.data.network.core.a {
    public final fe f;

    public ke(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, je jeVar, fe feVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(ie.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), jeVar);
        this.f = feVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
