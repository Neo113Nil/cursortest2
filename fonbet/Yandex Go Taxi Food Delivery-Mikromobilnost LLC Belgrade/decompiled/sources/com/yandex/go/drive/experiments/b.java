package com.yandex.go.drive.experiments;

import com.yandex.go.drive.experiments.DriveLazyInitExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DriveLazyInitExperiment.InitType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
