package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class p6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RideCardItemDto$Timeline.TimelineType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
