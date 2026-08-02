package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class DrivingOptions implements Serializable {
    private AnnotationLanguage annotationLanguage;
    private AvoidanceFlags avoidanceFlags;
    private List<LinearRing> avoidedZones;
    private Long departureTime;
    private Boolean hdRoute;
    private Double initialAzimuth;
    private Integer routesCount;

    public DrivingOptions(Double d, Integer num, Long l, AnnotationLanguage annotationLanguage, Boolean bool, AvoidanceFlags avoidanceFlags, List<LinearRing> list) {
        this.initialAzimuth = null;
        this.routesCount = null;
        this.departureTime = null;
        this.annotationLanguage = null;
        this.hdRoute = null;
        this.avoidanceFlags = null;
        this.avoidedZones = Collections.EMPTY_LIST;
        if (list == null) {
            ny61.g("Required field \"avoidedZones\" cannot be null");
            throw null;
        }
        this.initialAzimuth = d;
        this.routesCount = num;
        this.departureTime = l;
        this.annotationLanguage = annotationLanguage;
        this.hdRoute = bool;
        this.avoidanceFlags = avoidanceFlags;
        this.avoidedZones = list;
    }

    public AnnotationLanguage getAnnotationLanguage() {
        return this.annotationLanguage;
    }

    public AvoidanceFlags getAvoidanceFlags() {
        return this.avoidanceFlags;
    }

    public List<LinearRing> getAvoidedZones() {
        return this.avoidedZones;
    }

    public Long getDepartureTime() {
        return this.departureTime;
    }

    public Boolean getHdRoute() {
        return this.hdRoute;
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
        this.annotationLanguage = (AnnotationLanguage) archive.add((Archive) this.annotationLanguage, true, (Class<Archive>) AnnotationLanguage.class);
        this.hdRoute = archive.add(this.hdRoute, true);
        this.avoidanceFlags = (AvoidanceFlags) archive.add((Archive) this.avoidanceFlags, true, (Class<Archive>) AvoidanceFlags.class);
        this.avoidedZones = nzs.e(LinearRing.class, archive, this.avoidedZones, false);
    }

    public DrivingOptions setAnnotationLanguage(AnnotationLanguage annotationLanguage) {
        this.annotationLanguage = annotationLanguage;
        return this;
    }

    public DrivingOptions setAvoidanceFlags(AvoidanceFlags avoidanceFlags) {
        this.avoidanceFlags = avoidanceFlags;
        return this;
    }

    public DrivingOptions setAvoidedZones(List<LinearRing> list) {
        if (list != null) {
            this.avoidedZones = list;
            return this;
        }
        ny61.g("Required field \"avoidedZones\" cannot be null");
        return null;
    }

    public DrivingOptions setDepartureTime(Long l) {
        this.departureTime = l;
        return this;
    }

    public DrivingOptions setHdRoute(Boolean bool) {
        this.hdRoute = bool;
        return this;
    }

    public DrivingOptions setInitialAzimuth(Double d) {
        this.initialAzimuth = d;
        return this;
    }

    public DrivingOptions setRoutesCount(Integer num) {
        this.routesCount = num;
        return this;
    }

    public DrivingOptions() {
        this.initialAzimuth = null;
        this.routesCount = null;
        this.departureTime = null;
        this.annotationLanguage = null;
        this.hdRoute = null;
        this.avoidanceFlags = null;
        this.avoidedZones = Collections.EMPTY_LIST;
    }

    public DrivingOptions(Double d, Integer num, Long l, AnnotationLanguage annotationLanguage, AvoidanceFlags avoidanceFlags) {
        this.initialAzimuth = null;
        this.routesCount = null;
        this.departureTime = null;
        this.annotationLanguage = null;
        this.hdRoute = null;
        this.avoidanceFlags = null;
        this.avoidedZones = Collections.EMPTY_LIST;
        this.initialAzimuth = d;
        this.routesCount = num;
        this.departureTime = l;
        this.annotationLanguage = annotationLanguage;
        this.avoidanceFlags = avoidanceFlags;
    }
}
