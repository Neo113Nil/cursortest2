package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class k {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RoadObjectSettingsExperiment.RoadObjectType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
