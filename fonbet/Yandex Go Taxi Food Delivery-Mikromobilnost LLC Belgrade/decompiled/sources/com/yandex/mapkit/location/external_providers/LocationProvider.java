package com.yandex.mapkit.location.external_providers;

/* loaded from: classes15.dex */
public interface LocationProvider {
    void resume();

    void subscribe(LocationProviderListener locationProviderListener);

    void suspend();

    void unsubscribe(LocationProviderListener locationProviderListener);
}
