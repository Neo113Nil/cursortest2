package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RouteStop implements Serializable {
    private RouteStopMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;

    public RouteStop(RouteStopMetadata routeStopMetadata, Point point) {
        this.metadata__is_initialized = false;
        this.position__is_initialized = false;
        if (routeStopMetadata == null) {
            ny61.g("Required field \"metadata\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(routeStopMetadata, point);
        this.metadata = routeStopMetadata;
        this.metadata__is_initialized = true;
        this.position = point;
        this.position__is_initialized = true;
    }

    private native RouteStopMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RouteStop";
    }

    private native Point getPosition__Native();

    private native NativeObject init(RouteStopMetadata routeStopMetadata, Point point);

    public synchronized RouteStopMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.metadata;
    }

    public synchronized Point getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) RouteStopMetadata.class);
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            return;
        }
        this.metadata = (RouteStopMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) RouteStopMetadata.class);
        this.metadata__is_initialized = true;
        Point point = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position = point;
        this.position__is_initialized = true;
        this.nativeObject = init(this.metadata, point);
    }

    public RouteStop() {
        this.metadata__is_initialized = false;
        this.position__is_initialized = false;
    }

    private RouteStop(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
