package com.yandex.go.taxi.order.models.api.response.status;

import com.yandex.go.taxi.order.models.api.response.status.RideCardStatusProperties;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RideCardStatusProperties.Effect.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
