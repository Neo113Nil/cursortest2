package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Position implements Serializable {
    private double altitude;
    private Point point;

    public Position(Point point, double d) {
        if (point == null) {
            ny61.g("Required field \"point\" cannot be null");
            throw null;
        }
        this.point = point;
        this.altitude = d;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public Point getPoint() {
        return this.point;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
        this.altitude = archive.add(this.altitude);
    }

    public Position() {
    }
}
