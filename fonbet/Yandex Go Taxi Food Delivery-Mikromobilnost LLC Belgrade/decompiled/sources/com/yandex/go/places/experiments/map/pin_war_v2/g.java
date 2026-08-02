package com.yandex.go.places.experiments.map.pin_war_v2;

import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PlacesPinWarV2Experiment.LabelRenderingMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
