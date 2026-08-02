package com.yandex.go.blur.experiments;

import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BlurConfigurationExperiment.DevicePerformanceClass.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
