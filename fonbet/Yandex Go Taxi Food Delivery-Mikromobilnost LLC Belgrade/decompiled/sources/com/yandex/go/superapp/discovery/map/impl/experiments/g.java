package com.yandex.go.superapp.discovery.map.impl.experiments;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppDiscoveryMapExperiment.CategoryFilterType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
