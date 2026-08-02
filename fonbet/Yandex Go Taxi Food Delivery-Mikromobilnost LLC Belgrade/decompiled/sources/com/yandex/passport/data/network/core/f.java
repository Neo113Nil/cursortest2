package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.l0;
import com.yandex.passport.common.network.u;
import com.yandex.passport.common.network.x;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public abstract class f extends a {
    public f(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.c cVar, l0 l0Var, KSerializer kSerializer) {
        this(aVar, cVar, l0Var, new u(kSerializer, x.Companion.serializer()));
    }

    public f(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.c cVar, com.yandex.passport.common.domain.a aVar2, d dVar) {
        super(aVar, cVar, aVar2, dVar, new j());
    }
}
