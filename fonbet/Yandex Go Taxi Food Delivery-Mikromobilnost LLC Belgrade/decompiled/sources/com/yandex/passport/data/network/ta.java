package com.yandex.passport.data.network;

/* loaded from: classes15.dex */
public final class ta extends com.yandex.passport.data.network.core.g {
    public final sa h;

    public ta(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, sa saVar, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, com.yandex.passport.data.models.o.Companion.serializer(), oVar, "PhonishToNeophonishRequest");
        this.h = saVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
