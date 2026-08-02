package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class s3 extends com.yandex.passport.data.network.core.f {
    public final l3 f;

    public s3(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, l3 l3Var) {
        super(aVar, cVar, l0Var, o3.Companion.serializer());
        this.f = l3Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }
}
