package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
