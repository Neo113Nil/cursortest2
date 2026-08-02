package com.yandex.go.mainscreen.superapp.impl.header.experiment;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CurrentAddressModalExperiment.OnMapClickActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
