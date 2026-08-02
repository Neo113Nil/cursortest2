package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class d9 extends com.yandex.passport.data.network.core.a {
    public final y8 f;

    public d9(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, c9 c9Var, y8 y8Var) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(b9.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), c9Var);
        this.f = y8Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
