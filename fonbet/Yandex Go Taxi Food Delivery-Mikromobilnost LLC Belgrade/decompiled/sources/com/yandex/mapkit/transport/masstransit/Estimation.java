package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Estimation implements Serializable {
    private Time arrivalTime;
    private String vehicleId;

    public Estimation(String str, Time time) {
        this.vehicleId = str;
        this.arrivalTime = time;
    }

    public Time getArrivalTime() {
        return this.arrivalTime;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleId = archive.add(this.vehicleId, true);
        this.arrivalTime = (Time) archive.add((Archive) this.arrivalTime, true, (Class<Archive>) Time.class);
    }

    public Estimation() {
    }
}
