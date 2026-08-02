package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class j8 extends com.yandex.passport.data.network.core.f {
    public final f8 f;

    public j8(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, f8 f8Var) {
        super(aVar, cVar, l0Var, i8.Companion.serializer());
        this.f = f8Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
