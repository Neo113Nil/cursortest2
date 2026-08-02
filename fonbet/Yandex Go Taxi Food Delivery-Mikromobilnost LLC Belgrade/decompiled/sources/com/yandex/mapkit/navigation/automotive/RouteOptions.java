package com.yandex.mapkit.navigation.automotive;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class RouteOptions implements Serializable {
    private Long departureTime;
    private Double initialAzimuth;
    private Integer routesCount;

    public RouteOptions() {
        this.initialAzimuth = null;
        this.routesCount = null;
        this.departureTime = null;
    }

    public Long getDepartureTime() {
        return this.departureTime;
    }

    public Double getInitialAzimuth() {
        return this.initialAzimuth;
    }

    public Integer getRoutesCount() {
        return this.routesCount;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.initialAzimuth = archive.add(this.initialAzimuth, true);
        this.routesCount = archive.add(this.routesCount, true);
        this.departureTime = archive.add(this.departureTime, true);
    }

    public RouteOptions setDepartureTime(Long l) {
        this.departureTime = l;
        return this;
    }

    public RouteOptions setInitialAzimuth(Double d) {
        this.initialAzimuth = d;
        return this;
    }

    public RouteOptions setRoutesCount(Integer num) {
        this.routesCount = num;
        return this;
    }

    public RouteOptions(Double d, Integer num, Long l) {
        this.initialAzimuth = d;
        this.routesCount = num;
        this.departureTime = l;
    }

    public RouteOptions(Double d, Integer num) {
        this.departureTime = null;
        this.initialAzimuth = d;
        this.routesCount = num;
    }
}
