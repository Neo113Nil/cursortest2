package com.yandex.mapkit.transport.internal;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.transport.Transport;
import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import com.yandex.mapkit.transport.masstransit.MasstransitLayer;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter;
import com.yandex.mapkit.transport.taxi.TaxiManager;
import com.yandex.mapkit.transport.time.AdjustedClock;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class TransportBinding implements Transport {
    private final NativeObject nativeObject;

    public TransportBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.Transport
    @Deprecated
    public native BicycleRouter createBicycleRouter();

    @Override // com.yandex.mapkit.transport.Transport
    public native BicycleRouterV2 createBicycleRouterV2();

    @Override // com.yandex.mapkit.transport.Transport
    public native BicycleRouterV2 createElectricBikeRouter();

    @Override // com.yandex.mapkit.transport.Transport
    public native MasstransitInfoService createMasstransitInfoService();

    @Override // com.yandex.mapkit.transport.Transport
    public native MasstransitLayer createMasstransitLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.transport.Transport
    public native MasstransitRouter createMasstransitRouter();

    @Override // com.yandex.mapkit.transport.Transport
    public native PedestrianRouter createPedestrianRouter();

    @Override // com.yandex.mapkit.transport.Transport
    public native BicycleRouterV2 createScooterRouter();

    @Override // com.yandex.mapkit.transport.Transport
    public native TaxiManager createTaxiManager();

    @Override // com.yandex.mapkit.transport.Transport
    public native TaxiMasstransitRouter createTaxiMasstransitRouter();

    @Override // com.yandex.mapkit.transport.Transport
    public native AdjustedClock getAdjustedClock();

    @Override // com.yandex.mapkit.transport.Transport
    public native boolean isValid();
}
