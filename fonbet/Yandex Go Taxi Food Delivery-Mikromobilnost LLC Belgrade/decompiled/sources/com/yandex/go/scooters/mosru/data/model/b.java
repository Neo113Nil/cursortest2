package com.yandex.go.scooters.mosru.data.model;

import com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
