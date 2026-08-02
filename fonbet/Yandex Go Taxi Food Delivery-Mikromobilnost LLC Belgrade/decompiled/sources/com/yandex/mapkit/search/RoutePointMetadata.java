package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RoutePointMetadata implements BaseMetadata, Serializable {
    private List<DrivingArrivalPoint> drivingArrivalPoints;
    private boolean drivingArrivalPoints__is_initialized;
    private List<Entrance> entrances;
    private boolean entrances__is_initialized;
    private NativeObject nativeObject;
    private String routePointContext;
    private boolean routePointContext__is_initialized;

    public RoutePointMetadata(String str, List<Entrance> list, List<DrivingArrivalPoint> list2) {
        this.routePointContext__is_initialized = false;
        this.entrances__is_initialized = false;
        this.drivingArrivalPoints__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"routePointContext\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"entrances\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"drivingArrivalPoints\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, list2);
        this.routePointContext = str;
        this.routePointContext__is_initialized = true;
        this.entrances = list;
        this.entrances__is_initialized = true;
        this.drivingArrivalPoints = list2;
        this.drivingArrivalPoints__is_initialized = true;
    }

    private native List<DrivingArrivalPoint> getDrivingArrivalPoints__Native();

    private native List<Entrance> getEntrances__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RoutePointMetadata";
    }

    private native String getRoutePointContext__Native();

    private native NativeObject init(String str, List<Entrance> list, List<DrivingArrivalPoint> list2);

    public synchronized List<DrivingArrivalPoint> getDrivingArrivalPoints() {
        try {
            if (!this.drivingArrivalPoints__is_initialized) {
                this.drivingArrivalPoints = getDrivingArrivalPoints__Native();
                this.drivingArrivalPoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.drivingArrivalPoints;
    }

    public synchronized List<Entrance> getEntrances() {
        try {
            if (!this.entrances__is_initialized) {
                this.entrances = getEntrances__Native();
                this.entrances__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.entrances;
    }

    public synchronized String getRoutePointContext() {
        try {
            if (!this.routePointContext__is_initialized) {
                this.routePointContext = getRoutePointContext__Native();
                this.routePointContext__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routePointContext;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getRoutePointContext(), false);
            archive.add((List) getEntrances(), false, (ArchivingHandler) new ClassHandler(Entrance.class));
            nzs.m(DrivingArrivalPoint.class, archive, getDrivingArrivalPoints(), false);
            return;
        }
        this.routePointContext = archive.add(this.routePointContext, false);
        this.routePointContext__is_initialized = true;
        this.entrances = nzs.e(Entrance.class, archive, this.entrances, false);
        this.entrances__is_initialized = true;
        List<DrivingArrivalPoint> e = nzs.e(DrivingArrivalPoint.class, archive, this.drivingArrivalPoints, false);
        this.drivingArrivalPoints = e;
        this.drivingArrivalPoints__is_initialized = true;
        this.nativeObject = init(this.routePointContext, this.entrances, e);
    }

    public RoutePointMetadata() {
        this.routePointContext__is_initialized = false;
        this.entrances__is_initialized = false;
        this.drivingArrivalPoints__is_initialized = false;
    }

    private RoutePointMetadata(NativeObject nativeObject) {
        this.routePointContext__is_initialized = false;
        this.entrances__is_initialized = false;
        this.drivingArrivalPoints__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
