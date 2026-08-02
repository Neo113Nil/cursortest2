package com.yandex.go.scooters.ignition.data.model;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
