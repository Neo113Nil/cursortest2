package com.yandex.go.mainscreen.superapp.popup.data.experiments;

import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppFallbackBehaviourExperiment.State.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
