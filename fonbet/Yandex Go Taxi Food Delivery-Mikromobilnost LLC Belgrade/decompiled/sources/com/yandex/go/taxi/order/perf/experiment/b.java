package com.yandex.go.taxi.order.perf.experiment;

import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TaxiOrderPerfTweaksExperiment.DelayType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
