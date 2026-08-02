package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;

/* loaded from: classes8.dex */
public abstract class ModuleServiceEntryPoint<T> {
    public ClientConfigProvider getClientConfigProvider() {
        return null;
    }

    public abstract String getIdentifier();

    public LocationServiceExtension getLocationServiceExtension() {
        return null;
    }

    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return null;
    }

    public ModuleServicesDatabase getModuleServicesDatabase() {
        return null;
    }

    public RemoteConfigExtensionConfiguration<T> getRemoteConfigExtensionConfiguration() {
        return null;
    }

    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<T> moduleRemoteConfig) {
    }
}
