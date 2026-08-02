package com.yandex.passport.common.network;

import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class e {
    public final <T, E> KSerializer serializer(KSerializer kSerializer, KSerializer kSerializer2) {
        return new l(kSerializer, kSerializer2);
    }
}
