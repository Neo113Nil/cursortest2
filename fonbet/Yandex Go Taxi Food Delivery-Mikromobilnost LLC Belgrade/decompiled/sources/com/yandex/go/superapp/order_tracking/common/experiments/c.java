package com.yandex.go.superapp.order_tracking.common.experiments;

import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
