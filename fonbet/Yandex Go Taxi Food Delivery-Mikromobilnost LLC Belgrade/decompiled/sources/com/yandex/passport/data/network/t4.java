package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class t4 extends com.yandex.passport.data.network.core.f {
    public final p4 f;

    public t4(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, p4 p4Var) {
        super(aVar, cVar, l0Var, s4.Companion.serializer());
        this.f = p4Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
