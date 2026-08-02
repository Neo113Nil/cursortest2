package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes8.dex */
public final class TimeOptions implements Serializable {
    private Long arrivalTime;
    private Long departureTime;

    public TimeOptions() {
        this.departureTime = null;
        this.arrivalTime = null;
    }

    public Long getArrivalTime() {
        return this.arrivalTime;
    }

    public Long getDepartureTime() {
        return this.departureTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.departureTime = archive.add(this.departureTime, true);
        this.arrivalTime = archive.add(this.arrivalTime, true);
    }

    public TimeOptions setArrivalTime(Long l) {
        this.arrivalTime = l;
        return this;
    }

    public TimeOptions setDepartureTime(Long l) {
        this.departureTime = l;
        return this;
    }

    public TimeOptions(Long l, Long l2) {
        this.departureTime = l;
        this.arrivalTime = l2;
    }
}
