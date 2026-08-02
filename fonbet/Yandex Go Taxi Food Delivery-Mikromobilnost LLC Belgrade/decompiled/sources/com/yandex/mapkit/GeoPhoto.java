package com.yandex.mapkit;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class GeoPhoto implements Serializable {
    private Attribution attribution;
    private boolean attribution__is_initialized;
    private Image image;
    private boolean image__is_initialized;
    private NativeObject nativeObject;
    private ShootingPoint shootingPoint;
    private boolean shootingPoint__is_initialized;
    private Long takenAt;
    private boolean takenAt__is_initialized;

    public GeoPhoto(Image image, ShootingPoint shootingPoint, Long l, Attribution attribution) {
        this.image__is_initialized = false;
        this.shootingPoint__is_initialized = false;
        this.takenAt__is_initialized = false;
        this.attribution__is_initialized = false;
        if (image == null) {
            ny61.g("Required field \"image\" cannot be null");
            throw null;
        }
        this.nativeObject = init(image, shootingPoint, l, attribution);
        this.image = image;
        this.image__is_initialized = true;
        this.shootingPoint = shootingPoint;
        this.shootingPoint__is_initialized = true;
        this.takenAt = l;
        this.takenAt__is_initialized = true;
        this.attribution = attribution;
        this.attribution__is_initialized = true;
    }

    private native Attribution getAttribution__Native();

    private native Image getImage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::GeoPhoto";
    }

    private native ShootingPoint getShootingPoint__Native();

    private native Long getTakenAt__Native();

    private native NativeObject init(Image image, ShootingPoint shootingPoint, Long l, Attribution attribution);

    public synchronized Attribution getAttribution() {
        try {
            if (!this.attribution__is_initialized) {
                this.attribution = getAttribution__Native();
                this.attribution__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.attribution;
    }

    public synchronized Image getImage() {
        try {
            if (!this.image__is_initialized) {
                this.image = getImage__Native();
                this.image__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.image;
    }

    public synchronized ShootingPoint getShootingPoint() {
        try {
            if (!this.shootingPoint__is_initialized) {
                this.shootingPoint = getShootingPoint__Native();
                this.shootingPoint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.shootingPoint;
    }

    public synchronized Long getTakenAt() {
        try {
            if (!this.takenAt__is_initialized) {
                this.takenAt = getTakenAt__Native();
                this.takenAt__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.takenAt;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getImage(), false, (Class<Archive>) Image.class);
            archive.add((Archive) getShootingPoint(), true, (Class<Archive>) ShootingPoint.class);
            archive.add(getTakenAt(), true);
            archive.add((Archive) getAttribution(), true, (Class<Archive>) Attribution.class);
            return;
        }
        this.image = (Image) archive.add((Archive) this.image, false, (Class<Archive>) Image.class);
        this.image__is_initialized = true;
        this.shootingPoint = (ShootingPoint) archive.add((Archive) this.shootingPoint, true, (Class<Archive>) ShootingPoint.class);
        this.shootingPoint__is_initialized = true;
        this.takenAt = archive.add(this.takenAt, true);
        this.takenAt__is_initialized = true;
        Attribution attribution = (Attribution) archive.add((Archive) this.attribution, true, (Class<Archive>) Attribution.class);
        this.attribution = attribution;
        this.attribution__is_initialized = true;
        this.nativeObject = init(this.image, this.shootingPoint, this.takenAt, attribution);
    }

    public static class Point3D implements Serializable {
        private Double altitude;
        private Point point;

        public Point3D(Point point, Double d) {
            if (point == null) {
                ny61.g("Required field \"point\" cannot be null");
                throw null;
            }
            this.point = point;
            this.altitude = d;
        }

        public Double getAltitude() {
            return this.altitude;
        }

        public Point getPoint() {
            return this.point;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
            this.altitude = archive.add(this.altitude, true);
        }

        public Point3D() {
        }
    }

    public static class ShootingPoint implements Serializable {
        private Direction direction;
        private Point3D point;

        public ShootingPoint(Point3D point3D, Direction direction) {
            if (point3D == null) {
                ny61.g("Required field \"point\" cannot be null");
                throw null;
            }
            this.point = point3D;
            this.direction = direction;
        }

        public Direction getDirection() {
            return this.direction;
        }

        public Point3D getPoint() {
            return this.point;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.point = (Point3D) archive.add((Archive) this.point, false, (Class<Archive>) Point3D.class);
            this.direction = (Direction) archive.add((Archive) this.direction, true, (Class<Archive>) Direction.class);
        }

        public ShootingPoint() {
        }
    }

    public GeoPhoto() {
        this.image__is_initialized = false;
        this.shootingPoint__is_initialized = false;
        this.takenAt__is_initialized = false;
        this.attribution__is_initialized = false;
    }

    private GeoPhoto(NativeObject nativeObject) {
        this.image__is_initialized = false;
        this.shootingPoint__is_initialized = false;
        this.takenAt__is_initialized = false;
        this.attribution__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
