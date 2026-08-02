package com.yandex.go.taxi.order.multi.feed.experiments;

import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TaxiOrderFeedStateSettingsExperiment.StateDto.State.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
