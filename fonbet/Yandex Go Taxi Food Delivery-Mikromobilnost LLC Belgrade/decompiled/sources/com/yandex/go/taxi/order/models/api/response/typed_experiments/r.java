package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class r {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = WalkRouteOrderExperiment.OrderStatusRule.PointType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
