package com.yandex.go.mainscreen.superapp.impl.header.experiment;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppConfigMenuExperiment.MenuIconType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
