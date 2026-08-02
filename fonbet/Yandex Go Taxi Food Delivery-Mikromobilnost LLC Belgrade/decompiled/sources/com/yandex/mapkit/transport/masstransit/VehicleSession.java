package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface VehicleSession {

    /* loaded from: classes6.dex */
    public interface VehicleListener {
        void onVehicleError(Error error);

        void onVehicleResponse(Vehicle vehicle);
    }

    void cancel();

    void retry(VehicleListener vehicleListener);
}
