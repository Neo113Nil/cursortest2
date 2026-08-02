package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyPropertiesDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MasstransitSlotItemBodyPropertiesDto.Align.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
