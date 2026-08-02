package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class za extends com.yandex.passport.data.network.core.f {
    public final ya f;

    public za(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, ya yaVar) {
        super(aVar, cVar, l0Var, com.yandex.passport.data.models.o.Companion.serializer());
        this.f = yaVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
