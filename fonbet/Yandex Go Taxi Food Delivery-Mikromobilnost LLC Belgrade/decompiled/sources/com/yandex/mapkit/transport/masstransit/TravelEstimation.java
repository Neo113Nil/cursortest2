package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TravelEstimation implements Serializable {
    private Time arrivalTime;
    private Time departureTime;

    public TravelEstimation(Time time, Time time2) {
        if (time == null) {
            ny61.g("Required field \"departureTime\" cannot be null");
            throw null;
        }
        if (time2 == null) {
            ny61.g("Required field \"arrivalTime\" cannot be null");
            throw null;
        }
        this.departureTime = time;
        this.arrivalTime = time2;
    }

    public Time getArrivalTime() {
        return this.arrivalTime;
    }

    public Time getDepartureTime() {
        return this.departureTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.departureTime = (Time) archive.add((Archive) this.departureTime, false, (Class<Archive>) Time.class);
        this.arrivalTime = (Time) archive.add((Archive) this.arrivalTime, false, (Class<Archive>) Time.class);
    }

    public TravelEstimation() {
    }
}
