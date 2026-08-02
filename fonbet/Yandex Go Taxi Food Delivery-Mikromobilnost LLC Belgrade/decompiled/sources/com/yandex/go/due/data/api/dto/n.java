package com.yandex.go.due.data.api.dto;

import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class n {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
