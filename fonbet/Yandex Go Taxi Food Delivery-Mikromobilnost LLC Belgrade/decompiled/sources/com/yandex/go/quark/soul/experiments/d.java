package com.yandex.go.quark.soul.experiments;

import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SoulAiAssistantExperiment.Navbar.Mode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
