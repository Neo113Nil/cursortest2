package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SpatialConnection implements Serializable {
    private Type connectionType;
    private String photoId;
    private GeoPhoto.ShootingPoint shootingPoint;

    public enum Type {
        UNKNOWN,
        UTURN,
        BACKWARD,
        FORWARD
    }

    public SpatialConnection(String str, GeoPhoto.ShootingPoint shootingPoint, Type type) {
        if (str == null) {
            ny61.g("Required field \"photoId\" cannot be null");
            throw null;
        }
        this.photoId = str;
        this.shootingPoint = shootingPoint;
        this.connectionType = type;
    }

    public Type getConnectionType() {
        return this.connectionType;
    }

    public String getPhotoId() {
        return this.photoId;
    }

    public GeoPhoto.ShootingPoint getShootingPoint() {
        return this.shootingPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.photoId = archive.add(this.photoId, false);
        this.shootingPoint = (GeoPhoto.ShootingPoint) archive.add((Archive) this.shootingPoint, true, (Class<Archive>) GeoPhoto.ShootingPoint.class);
        this.connectionType = (Type) archive.add((Archive) this.connectionType, true, (Class<Archive>) Type.class);
    }

    public SpatialConnection() {
    }
}
