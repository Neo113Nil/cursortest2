package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.l0;
import com.yandex.passport.common.network.u;
import com.yandex.passport.common.network.x;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public abstract class g extends n {
    public g(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.c cVar, l0 l0Var, KSerializer kSerializer, o oVar, String str) {
        super(aVar, cVar, l0Var, new u(kSerializer, x.Companion.serializer()), new j(), oVar, str);
    }
}
