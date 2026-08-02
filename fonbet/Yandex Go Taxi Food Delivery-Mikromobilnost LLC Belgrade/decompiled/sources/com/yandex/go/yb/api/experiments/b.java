package com.yandex.go.yb.api.experiments;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = YbWalletEntryPointExperiment.EntryPoint.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
