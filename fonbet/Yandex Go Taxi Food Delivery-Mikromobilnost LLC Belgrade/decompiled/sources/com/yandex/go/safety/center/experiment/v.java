package com.yandex.go.safety.center.experiment;

import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class v {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SafetyCenterWebConfig.Button.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
