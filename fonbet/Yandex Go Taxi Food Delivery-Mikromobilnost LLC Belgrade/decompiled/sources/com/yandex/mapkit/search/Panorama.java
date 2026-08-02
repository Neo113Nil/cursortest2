package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Span;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Panorama implements Serializable {
    private Direction direction;
    private String id;
    private Point point;
    private Span span;

    public Panorama(String str, Direction direction, Span span, Point point) {
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (direction == null) {
            ny61.g("Required field \"direction\" cannot be null");
            throw null;
        }
        if (span == null) {
            ny61.g("Required field \"span\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"point\" cannot be null");
            throw null;
        }
        this.id = str;
        this.direction = direction;
        this.span = span;
        this.point = point;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public String getId() {
        return this.id;
    }

    public Point getPoint() {
        return this.point;
    }

    public Span getSpan() {
        return this.span;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.id = archive.add(this.id, false);
        this.direction = (Direction) archive.add((Archive) this.direction, false, (Class<Archive>) Direction.class);
        this.span = (Span) archive.add((Archive) this.span, false, (Class<Archive>) Span.class);
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
    }

    public Panorama() {
    }
}
