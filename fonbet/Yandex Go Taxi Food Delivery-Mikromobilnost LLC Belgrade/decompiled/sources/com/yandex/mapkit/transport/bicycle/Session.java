package com.yandex.mapkit.transport.bicycle;

import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface Session {

    public interface RouteListener {
        void onBicycleRoutes(List<Route> list);

        void onBicycleRoutesError(Error error);
    }

    void cancel();

    void retry(RouteListener routeListener);
}
