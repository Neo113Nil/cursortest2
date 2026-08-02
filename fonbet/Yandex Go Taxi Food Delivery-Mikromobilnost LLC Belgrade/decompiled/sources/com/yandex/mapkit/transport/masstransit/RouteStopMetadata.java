package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RouteStopMetadata implements BaseMetadata, Serializable {
    private Point exitPoint;
    private boolean exitPoint__is_initialized;
    private NativeObject nativeObject;
    private Stop stop;
    private Stop stopExit;
    private boolean stopExit__is_initialized;
    private boolean stop__is_initialized;

    public RouteStopMetadata(Stop stop, Stop stop2, Point point) {
        this.stop__is_initialized = false;
        this.stopExit__is_initialized = false;
        this.exitPoint__is_initialized = false;
        if (stop == null) {
            ny61.g("Required field \"stop\" cannot be null");
            throw null;
        }
        this.nativeObject = init(stop, stop2, point);
        this.stop = stop;
        this.stop__is_initialized = true;
        this.stopExit = stop2;
        this.stopExit__is_initialized = true;
        this.exitPoint = point;
        this.exitPoint__is_initialized = true;
    }

    private native Point getExitPoint__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RouteStopMetadata";
    }

    private native Stop getStopExit__Native();

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, Stop stop2, Point point);

    public synchronized Point getExitPoint() {
        try {
            if (!this.exitPoint__is_initialized) {
                this.exitPoint = getExitPoint__Native();
                this.exitPoint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.exitPoint;
    }

    public synchronized Stop getStop() {
        try {
            if (!this.stop__is_initialized) {
                this.stop = getStop__Native();
                this.stop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stop;
    }

    public synchronized Stop getStopExit() {
        try {
            if (!this.stopExit__is_initialized) {
                this.stopExit = getStopExit__Native();
                this.stopExit__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stopExit;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getStop(), false, (Class<Archive>) Stop.class);
            archive.add((Archive) getStopExit(), true, (Class<Archive>) Stop.class);
            archive.add((Archive) getExitPoint(), true, (Class<Archive>) Point.class);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        this.stopExit = (Stop) archive.add((Archive) this.stopExit, true, (Class<Archive>) Stop.class);
        this.stopExit__is_initialized = true;
        Point point = (Point) archive.add((Archive) this.exitPoint, true, (Class<Archive>) Point.class);
        this.exitPoint = point;
        this.exitPoint__is_initialized = true;
        this.nativeObject = init(this.stop, this.stopExit, point);
    }

    public RouteStopMetadata() {
        this.stop__is_initialized = false;
        this.stopExit__is_initialized = false;
        this.exitPoint__is_initialized = false;
    }

    private RouteStopMetadata(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.stopExit__is_initialized = false;
        this.exitPoint__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
