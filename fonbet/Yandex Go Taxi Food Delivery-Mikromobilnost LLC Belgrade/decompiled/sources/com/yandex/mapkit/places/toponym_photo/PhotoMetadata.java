package com.yandex.mapkit.places.toponym_photo;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class PhotoMetadata implements Serializable {
    private Long modificationTime;
    private Point shootingPoint;
    private Long shootingTime;
    private Point targetPoint;
    private String uri;

    public PhotoMetadata(Long l, Long l2, Point point, Point point2, String str) {
        this.modificationTime = l;
        this.shootingTime = l2;
        this.shootingPoint = point;
        this.targetPoint = point2;
        this.uri = str;
    }

    public Long getModificationTime() {
        return this.modificationTime;
    }

    public Point getShootingPoint() {
        return this.shootingPoint;
    }

    public Long getShootingTime() {
        return this.shootingTime;
    }

    public Point getTargetPoint() {
        return this.targetPoint;
    }

    public String getUri() {
        return this.uri;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.modificationTime = archive.add(this.modificationTime, true);
        this.shootingTime = archive.add(this.shootingTime, true);
        this.shootingPoint = (Point) archive.add((Archive) this.shootingPoint, true, (Class<Archive>) Point.class);
        this.targetPoint = (Point) archive.add((Archive) this.targetPoint, true, (Class<Archive>) Point.class);
        this.uri = archive.add(this.uri, true);
    }

    public PhotoMetadata() {
    }
}
