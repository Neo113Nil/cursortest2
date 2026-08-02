package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes8.dex */
public class BoundingBox implements Serializable {
    private Point northEast;
    private Point southWest;

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            ny61.g("Required field \"southWest\" cannot be null");
            throw null;
        }
        if (point2 == null) {
            ny61.g("Required field \"northEast\" cannot be null");
            throw null;
        }
        this.southWest = point;
        this.northEast = point2;
    }

    public Point getNorthEast() {
        return this.northEast;
    }

    public Point getSouthWest() {
        return this.southWest;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.southWest = (Point) archive.add((Archive) this.southWest, false, (Class<Archive>) Point.class);
        this.northEast = (Point) archive.add((Archive) this.northEast, false, (Class<Archive>) Point.class);
    }

    public BoundingBox() {
    }
}
