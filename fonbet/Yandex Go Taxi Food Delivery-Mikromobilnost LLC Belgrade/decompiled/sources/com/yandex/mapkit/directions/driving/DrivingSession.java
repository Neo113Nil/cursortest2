package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface DrivingSession {

    public interface DrivingRouteListener {
        void onDrivingRoutes(List<DrivingRoute> list);

        void onDrivingRoutesError(Error error);
    }

    void cancel();

    void retry(DrivingRouteListener drivingRouteListener);
}
