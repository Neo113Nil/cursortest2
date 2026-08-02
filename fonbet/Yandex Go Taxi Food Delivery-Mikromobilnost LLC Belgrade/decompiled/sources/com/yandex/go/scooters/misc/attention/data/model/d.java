package com.yandex.go.scooters.misc.attention.data.model;

import com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersAttentionDto.Action.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
