package com.yandex.go.app.icon.experiments;

import com.yandex.go.app.icon.experiments.AppDynamicIconExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AppDynamicIconExperiment.DynamicAppIcon.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
