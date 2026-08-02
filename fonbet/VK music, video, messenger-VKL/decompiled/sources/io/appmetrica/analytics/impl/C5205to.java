package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5205to implements InterfaceC5229um {
    public final UtilityServiceProvider a;

    public C5205to(UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5229um
    public final void a(C5100pm c5100pm) {
        this.a.updateConfiguration(new UtilityServiceConfiguration(c5100pm.v, c5100pm.u));
    }
}
