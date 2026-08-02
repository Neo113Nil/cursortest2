package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* loaded from: classes8.dex */
public final class W5 implements V5 {
    public final C5212u5 a;

    public W5(C5212u5 c5212u5) {
        this.a = c5212u5;
    }

    @Override // io.appmetrica.analytics.impl.V5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C5212u5 getAdRevenueProcessorsHolder() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.a;
    }
}
