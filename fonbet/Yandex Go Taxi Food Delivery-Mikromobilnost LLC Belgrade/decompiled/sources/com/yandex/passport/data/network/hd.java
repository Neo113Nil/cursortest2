package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class hd extends com.yandex.passport.data.network.core.f {
    public final dd f;

    public hd(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, dd ddVar) {
        super(aVar, cVar, l0Var, gd.Companion.serializer());
        this.f = ddVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
