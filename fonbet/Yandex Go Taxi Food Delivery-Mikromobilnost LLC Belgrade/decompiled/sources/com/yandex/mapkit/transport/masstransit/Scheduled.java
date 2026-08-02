package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Scheduled implements Serializable {
    private Time arrivalTime;
    private Time departureTime;
    private Estimation estimation;

    public Scheduled(Time time, Time time2, Estimation estimation) {
        this.arrivalTime = time;
        this.departureTime = time2;
        this.estimation = estimation;
    }

    public Time getArrivalTime() {
        return this.arrivalTime;
    }

    public Time getDepartureTime() {
        return this.departureTime;
    }

    public Estimation getEstimation() {
        return this.estimation;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.arrivalTime = (Time) archive.add((Archive) this.arrivalTime, true, (Class<Archive>) Time.class);
        this.departureTime = (Time) archive.add((Archive) this.departureTime, true, (Class<Archive>) Time.class);
        this.estimation = (Estimation) archive.add((Archive) this.estimation, true, (Class<Archive>) Estimation.class);
    }

    public Scheduled() {
    }
}
