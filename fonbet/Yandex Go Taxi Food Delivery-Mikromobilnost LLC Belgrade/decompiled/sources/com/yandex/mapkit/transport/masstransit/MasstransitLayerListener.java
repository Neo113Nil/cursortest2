package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.map.PlacemarkMapObject;

/* loaded from: classes6.dex */
public interface MasstransitLayerListener {
    void onVehiclePlacemarkAdded(PlacemarkMapObject placemarkMapObject, VehicleData vehicleData);

    void onVehiclePlacemarkDirectionUpdated(PlacemarkMapObject placemarkMapObject, VehicleData vehicleData);

    void onVehiclePlacemarkRemoved(PlacemarkMapObject placemarkMapObject, VehicleData vehicleData);
}
