package com.yandex.passport.common.network;

import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class h {
    public final <T> KSerializer serializer(KSerializer kSerializer) {
        return new q(kSerializer);
    }
}
