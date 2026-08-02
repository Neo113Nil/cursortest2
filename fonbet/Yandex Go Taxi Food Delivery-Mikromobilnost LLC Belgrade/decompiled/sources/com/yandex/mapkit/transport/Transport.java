package com.yandex.mapkit.transport;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import com.yandex.mapkit.transport.masstransit.MasstransitLayer;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter;
import com.yandex.mapkit.transport.taxi.TaxiManager;
import com.yandex.mapkit.transport.time.AdjustedClock;

/* loaded from: classes15.dex */
public interface Transport {
    @Deprecated
    BicycleRouter createBicycleRouter();

    BicycleRouterV2 createBicycleRouterV2();

    BicycleRouterV2 createElectricBikeRouter();

    MasstransitInfoService createMasstransitInfoService();

    MasstransitLayer createMasstransitLayer(MapWindow mapWindow);

    MasstransitRouter createMasstransitRouter();

    PedestrianRouter createPedestrianRouter();

    BicycleRouterV2 createScooterRouter();

    TaxiManager createTaxiManager();

    TaxiMasstransitRouter createTaxiMasstransitRouter();

    AdjustedClock getAdjustedClock();

    boolean isValid();
}
