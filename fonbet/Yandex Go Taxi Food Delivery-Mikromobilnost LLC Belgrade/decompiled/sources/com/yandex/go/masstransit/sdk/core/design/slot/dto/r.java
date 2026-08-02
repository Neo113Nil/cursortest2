package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$IconSpotDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class r {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MasstransitSlotItemTrailDto$IconSpotDto.SpotType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
