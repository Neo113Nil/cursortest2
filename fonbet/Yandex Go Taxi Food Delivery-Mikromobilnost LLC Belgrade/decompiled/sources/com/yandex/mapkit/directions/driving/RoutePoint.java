package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RoutePoint implements Serializable {
    private String drivingArrivalPointId;
    private boolean drivingArrivalPointId__is_initialized;
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private Point selectedArrivalPoint;
    private boolean selectedArrivalPoint__is_initialized;

    public RoutePoint(Point point, Point point2, String str) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.drivingArrivalPointId__is_initialized = false;
        if (point == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(point, point2, str);
        this.position = point;
        this.position__is_initialized = true;
        this.selectedArrivalPoint = point2;
        this.selectedArrivalPoint__is_initialized = true;
        this.drivingArrivalPointId = str;
        this.drivingArrivalPointId__is_initialized = true;
    }

    private native String getDrivingArrivalPointId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::RoutePoint";
    }

    private native Point getPosition__Native();

    private native Point getSelectedArrivalPoint__Native();

    private native NativeObject init(Point point, Point point2, String str);

    private native NativeObject initPublic(Point point, Point point2);

    public synchronized String getDrivingArrivalPointId() {
        try {
            if (!this.drivingArrivalPointId__is_initialized) {
                this.drivingArrivalPointId = getDrivingArrivalPointId__Native();
                this.drivingArrivalPointId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.drivingArrivalPointId;
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

    public synchronized Point getSelectedArrivalPoint() {
        try {
            if (!this.selectedArrivalPoint__is_initialized) {
                this.selectedArrivalPoint = getSelectedArrivalPoint__Native();
                this.selectedArrivalPoint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.selectedArrivalPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getSelectedArrivalPoint(), true, (Class<Archive>) Point.class);
            archive.add(getDrivingArrivalPointId(), true);
            return;
        }
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position__is_initialized = true;
        this.selectedArrivalPoint = (Point) archive.add((Archive) this.selectedArrivalPoint, true, (Class<Archive>) Point.class);
        this.selectedArrivalPoint__is_initialized = true;
        String add = archive.add(this.drivingArrivalPointId, true);
        this.drivingArrivalPointId = add;
        this.drivingArrivalPointId__is_initialized = true;
        this.nativeObject = init(this.position, this.selectedArrivalPoint, add);
    }

    public RoutePoint() {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.drivingArrivalPointId__is_initialized = false;
    }

    private RoutePoint(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.drivingArrivalPointId__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public RoutePoint(Point point, Point point2) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.drivingArrivalPointId__is_initialized = false;
        if (point != null) {
            this.nativeObject = initPublic(point, point2);
            this.position = point;
            this.position__is_initialized = true;
            this.selectedArrivalPoint = point2;
            this.selectedArrivalPoint__is_initialized = true;
            return;
        }
        ny61.g("Required field \"position\" cannot be null");
        throw null;
    }
}
