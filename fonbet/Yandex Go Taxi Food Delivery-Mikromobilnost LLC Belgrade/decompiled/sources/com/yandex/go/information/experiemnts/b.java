package com.yandex.go.information.experiemnts;

import com.yandex.go.information.experiemnts.SuperAppConfigInformationExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppConfigInformationExperiment.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
