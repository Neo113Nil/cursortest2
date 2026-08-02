package io.appmetrica.analytics.modulesapi.internal.client;

/* loaded from: classes8.dex */
public abstract class ServiceConfigExtensionConfiguration<T> {
    public abstract BundleToServiceConfigConverter<T> getBundleConverter();

    public abstract ServiceConfigUpdateListener<T> getServiceConfigUpdateListener();
}
