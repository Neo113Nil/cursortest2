package com.yandex.go.suggest.impl.data.experiments;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperappSuggestExperiment.LoadingStrategy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
