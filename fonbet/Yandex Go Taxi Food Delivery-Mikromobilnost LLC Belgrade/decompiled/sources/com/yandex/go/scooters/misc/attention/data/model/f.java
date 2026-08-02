package com.yandex.go.scooters.misc.attention.data.model;

import com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersAttentionDto.Style.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
