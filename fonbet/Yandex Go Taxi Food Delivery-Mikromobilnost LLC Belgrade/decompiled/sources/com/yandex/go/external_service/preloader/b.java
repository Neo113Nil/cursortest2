package com.yandex.go.external_service.preloader;

import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppConfigEatsKitStaticExperiment.BundleStrategy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
