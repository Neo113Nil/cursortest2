package com.yandex.go.slot.dto;

import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class t2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SlotItemTrailDto$IconSpotDto.SpotType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
