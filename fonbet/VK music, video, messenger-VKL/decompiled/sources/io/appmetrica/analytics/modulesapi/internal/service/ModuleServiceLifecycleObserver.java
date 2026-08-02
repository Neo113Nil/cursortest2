package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes8.dex */
public interface ModuleServiceLifecycleObserver {
    void onAllClientsDisconnected();

    void onFirstClientConnected();
}
