package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class ae extends com.yandex.passport.data.network.core.g {
    public final wd h;

    public ae(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, wd wdVar, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, zd.Companion.serializer(), oVar, "UpdateAvatarRequest");
        this.h = wdVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
