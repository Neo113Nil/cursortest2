package com.yandex.go.inapp_calls.experiment;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InAppCallExperiment.FullScreenRequestModal.ShowMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
