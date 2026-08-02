package com.yandex.go.pickuppoints.impl;

import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
