package com.yandex.go.places.experiments.tabbar;

import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DiscoveryTabbarExperiment.DiscoveryTabType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
