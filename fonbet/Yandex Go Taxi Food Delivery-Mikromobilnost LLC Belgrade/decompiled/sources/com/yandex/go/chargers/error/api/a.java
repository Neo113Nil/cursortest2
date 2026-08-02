package com.yandex.go.chargers.error.api;

import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class a {
    public static ChargersErrorDetailsDto a() {
        return ChargersErrorDetailsDto.d;
    }

    public final KSerializer serializer() {
        return ChargersErrorDetailsDto$$serializer.INSTANCE;
    }
}
