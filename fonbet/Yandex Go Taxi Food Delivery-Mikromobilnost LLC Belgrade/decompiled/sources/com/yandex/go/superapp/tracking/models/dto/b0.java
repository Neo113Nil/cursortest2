package com.yandex.go.superapp.tracking.models.dto;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardTimerDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class b0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TrackingCardTimerDto.TimerType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
