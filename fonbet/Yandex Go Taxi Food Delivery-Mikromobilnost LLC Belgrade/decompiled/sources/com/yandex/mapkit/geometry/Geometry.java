package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Geometry implements Serializable {
    private BoundingBox boundingBox;
    private Circle circle;
    private MultiPolygon multiPolygon;
    private Point point;
    private Polygon polygon;
    private Polyline polyline;

    public static Geometry fromBoundingBox(BoundingBox boundingBox) {
        if (boundingBox == null) {
            ny61.g("Variant value \"boundingBox\" cannot be null");
            return null;
        }
        Geometry geometry = new Geometry();
        geometry.boundingBox = boundingBox;
        return geometry;
    }

    public static Geometry fromCircle(Circle circle) {
        if (circle == null) {
            ny61.g("Variant value \"circle\" cannot be null");
            return null;
        }
        Geometry geometry = new Geometry();
        geometry.circle = circle;
        return geometry;
    }

    public static Geometry fromMultiPolygon(MultiPolygon multiPolygon) {
        if (multiPolygon == null) {
            ny61.g("Variant value \"multiPolygon\" cannot be null");
            return null;
        }
        Geometry geometry = new Geometry();
        geometry.multiPolygon = multiPolygon;
        return geometry;
    }

    public static Geometry fromPoint(Point point) {
        if (point == null) {
            ny61.g("Variant value \"point\" cannot be null");
            return null;
        }
        Geometry geometry = new Geometry();
        geometry.point = point;
        return geometry;
    }

    public static Geometry fromPolygon(Polygon polygon) {
        if (polygon == null) {
            ny61.g("Variant value \"polygon\" cannot be null");
            return null;
        }
        Geometry geometry = new Geometry();
        geometry.polygon = polygon;
        return geometry;
    }

    public static Geometry fromPolyline(Polyline polyline) {
        if (polyline == null) {
            ny61.g("Variant value \"polyline\" cannot be null");
            return null;
        }
        Geometry geometry = new Geometry();
        geometry.polyline = polyline;
        return geometry;
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Circle getCircle() {
        return this.circle;
    }

    public MultiPolygon getMultiPolygon() {
        return this.multiPolygon;
    }

    public Point getPoint() {
        return this.point;
    }

    public Polygon getPolygon() {
        return this.polygon;
    }

    public Polyline getPolyline() {
        return this.polyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.point = (Point) archive.add((Archive) this.point, true, (Class<Archive>) Point.class);
        this.polyline = (Polyline) archive.add((Archive) this.polyline, true, (Class<Archive>) Polyline.class);
        this.polygon = (Polygon) archive.add((Archive) this.polygon, true, (Class<Archive>) Polygon.class);
        this.multiPolygon = (MultiPolygon) archive.add((Archive) this.multiPolygon, true, (Class<Archive>) MultiPolygon.class);
        this.boundingBox = (BoundingBox) archive.add((Archive) this.boundingBox, true, (Class<Archive>) BoundingBox.class);
        this.circle = (Circle) archive.add((Archive) this.circle, true, (Class<Archive>) Circle.class);
    }
}
