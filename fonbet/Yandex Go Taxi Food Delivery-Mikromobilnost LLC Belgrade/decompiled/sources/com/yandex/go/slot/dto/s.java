package com.yandex.go.slot.dto;

import com.yandex.go.slot.dto.SlotButtonDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class s {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SlotButtonDto.Properties.Size.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
