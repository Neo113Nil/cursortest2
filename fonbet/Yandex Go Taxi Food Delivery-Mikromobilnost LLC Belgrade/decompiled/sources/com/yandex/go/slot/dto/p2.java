package com.yandex.go.slot.dto;

import com.yandex.go.slot.dto.SlotItemTrailDto$ButtonDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class p2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SlotItemTrailDto$ButtonDto.Style.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
