package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScheduledOrderCalculationsResponse.CalculationsStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
