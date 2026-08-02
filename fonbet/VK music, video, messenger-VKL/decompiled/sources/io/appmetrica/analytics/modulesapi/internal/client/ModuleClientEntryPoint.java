package io.appmetrica.analytics.modulesapi.internal.client;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;

/* loaded from: classes8.dex */
public abstract class ModuleClientEntryPoint<T> {
    public AdRevenueCollector getAdRevenueCollector() {
        return null;
    }

    public abstract String getIdentifier();

    public ServiceConfigExtensionConfiguration<T> getServiceConfigExtensionConfiguration() {
        return null;
    }

    public void onActivated() {
    }

    public void initClientSide(ClientContext clientContext) {
    }
}
