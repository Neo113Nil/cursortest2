package com.yandex.go.lifecycle.experiments;

import com.yandex.go.lifecycle.experiments.AppLifecycleLcpExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AppLifecycleLcpExperiment.DelayScenario.Strategy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
