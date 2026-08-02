package com.yandex.go.superapp.order_tracking.common.experiments;

import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.PreferredTrackingType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
