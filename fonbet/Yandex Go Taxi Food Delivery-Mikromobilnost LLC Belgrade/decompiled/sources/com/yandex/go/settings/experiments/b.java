package com.yandex.go.settings.experiments;

import com.yandex.go.settings.experiments.SuperAppConfigAppSettingsExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppConfigAppSettingsExperiment.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
