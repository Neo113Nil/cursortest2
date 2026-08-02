package com.yandex.go.safety.center.experiment;

import com.yandex.go.safety.center.experiment.SafetyCenterOrderButtonExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class r {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SafetyCenterOrderButtonExperiment.SafetyCenterOrderButtonState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
