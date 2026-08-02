package com.yandex.mapkit.transport.taxi;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface RideInfoSession {

    public interface RideInfoListener {
        void onRideInfoError(Error error);

        void onRideInfoReceived(RideInfo rideInfo);
    }

    void cancel();

    void retry(RideInfoListener rideInfoListener);
}
