package com.yandex.go.suggest.impl.data.experiments;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
