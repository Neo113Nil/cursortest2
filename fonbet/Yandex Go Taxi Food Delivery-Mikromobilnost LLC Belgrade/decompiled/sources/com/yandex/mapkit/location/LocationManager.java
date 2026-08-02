package com.yandex.mapkit.location;

/* loaded from: classes15.dex */
public interface LocationManager {
    void requestSingleUpdate(LocationListener locationListener);

    void resume();

    void setUserLocation(Location location);

    void subscribeForLocationUpdates(SubscriptionSettings subscriptionSettings, LocationListener locationListener);

    void suspend();

    void unsubscribe(LocationListener locationListener);
}
