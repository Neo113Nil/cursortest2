package com.yandex.go.safety.center.experiment;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SafetyCenterExperiment.ButtonPlace.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
