package com.yandex.go.places.experiments.map;

import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PlacesMapScreenExperiment.Screen.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
