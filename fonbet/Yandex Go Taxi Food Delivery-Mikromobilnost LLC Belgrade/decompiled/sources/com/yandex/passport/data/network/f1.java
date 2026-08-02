package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class f1 extends com.yandex.passport.data.network.core.f {
    public final b1 f;

    public f1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, b1 b1Var) {
        super(aVar, cVar, l0Var, e1.Companion.serializer());
        this.f = b1Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
