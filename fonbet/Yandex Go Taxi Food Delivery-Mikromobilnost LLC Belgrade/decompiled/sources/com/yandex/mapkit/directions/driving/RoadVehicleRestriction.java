package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RoadVehicleRestriction implements Serializable {
    private Subpolyline position;
    private VehicleRestriction vehicleRestriction;

    public RoadVehicleRestriction(VehicleRestriction vehicleRestriction, Subpolyline subpolyline) {
        if (vehicleRestriction == null) {
            ny61.g("Required field \"vehicleRestriction\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.vehicleRestriction = vehicleRestriction;
        this.position = subpolyline;
    }

    public Subpolyline getPosition() {
        return this.position;
    }

    public VehicleRestriction getVehicleRestriction() {
        return this.vehicleRestriction;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleRestriction = (VehicleRestriction) archive.add((Archive) this.vehicleRestriction, false, (Class<Archive>) VehicleRestriction.class);
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
    }

    public RoadVehicleRestriction() {
    }
}
