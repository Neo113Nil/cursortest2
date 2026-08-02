package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;

/* loaded from: classes15.dex */
public interface MasstransitLayer {
    void addLineFilter(String str);

    void addListener(MasstransitLayerListener masstransitLayerListener);

    void addTypeFilter(String str);

    void clearLineFilter();

    void clearTypeFilter();

    VehicleData getVehicleData(PlacemarkMapObject placemarkMapObject);

    MapObjectCollection getVehicleObjects();

    boolean isValid();

    boolean isVehiclesVisible();

    void removeListener(MasstransitLayerListener masstransitLayerListener);

    void setVehicleTapListener(MasstransitVehicleTapListener masstransitVehicleTapListener);

    void setVehiclesVisible(boolean z);
}
