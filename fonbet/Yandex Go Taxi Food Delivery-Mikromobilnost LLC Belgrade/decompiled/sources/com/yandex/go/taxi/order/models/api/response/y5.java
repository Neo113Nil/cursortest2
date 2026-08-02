package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class y5 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RideCardItemDto$StatusProgress.State.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
