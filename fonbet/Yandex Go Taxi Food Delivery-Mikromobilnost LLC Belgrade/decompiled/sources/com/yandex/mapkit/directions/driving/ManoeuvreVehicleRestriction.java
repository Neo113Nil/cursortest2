package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ManoeuvreVehicleRestriction implements Serializable {
    private PolylinePosition position;
    private VehicleRestriction vehicleRestriction;

    public ManoeuvreVehicleRestriction(VehicleRestriction vehicleRestriction, PolylinePosition polylinePosition) {
        if (vehicleRestriction == null) {
            ny61.g("Required field \"vehicleRestriction\" cannot be null");
            throw null;
        }
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.vehicleRestriction = vehicleRestriction;
        this.position = polylinePosition;
    }

    public PolylinePosition getPosition() {
        return this.position;
    }

    public VehicleRestriction getVehicleRestriction() {
        return this.vehicleRestriction;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleRestriction = (VehicleRestriction) archive.add((Archive) this.vehicleRestriction, false, (Class<Archive>) VehicleRestriction.class);
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public ManoeuvreVehicleRestriction() {
    }
}
