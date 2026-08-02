package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class DirectionSign implements Serializable {
    private DirectionSignDirection direction;
    private boolean direction__is_initialized;
    private List<DirectionSignItem> items;
    private boolean items__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;

    public DirectionSign(PolylinePosition polylinePosition, DirectionSignDirection directionSignDirection, List<DirectionSignItem> list) {
        this.position__is_initialized = false;
        this.direction__is_initialized = false;
        this.items__is_initialized = false;
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"items\" cannot be null");
            throw null;
        }
        this.nativeObject = init(polylinePosition, directionSignDirection, list);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.direction = directionSignDirection;
        this.direction__is_initialized = true;
        this.items = list;
        this.items__is_initialized = true;
    }

    private native DirectionSignDirection getDirection__Native();

    private native List<DirectionSignItem> getItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::DirectionSign";
    }

    private native PolylinePosition getPosition__Native();

    private native NativeObject init(PolylinePosition polylinePosition, DirectionSignDirection directionSignDirection, List<DirectionSignItem> list);

    public synchronized DirectionSignDirection getDirection() {
        try {
            if (!this.direction__is_initialized) {
                this.direction = getDirection__Native();
                this.direction__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.direction;
    }

    public synchronized List<DirectionSignItem> getItems() {
        try {
            if (!this.items__is_initialized) {
                this.items = getItems__Native();
                this.items__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.items;
    }

    public synchronized PolylinePosition getPosition() {
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
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            archive.add((Archive) getDirection(), true, (Class<Archive>) DirectionSignDirection.class);
            nzs.m(DirectionSignItem.class, archive, getItems(), false);
            return;
        }
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position__is_initialized = true;
        this.direction = (DirectionSignDirection) archive.add((Archive) this.direction, true, (Class<Archive>) DirectionSignDirection.class);
        this.direction__is_initialized = true;
        List<DirectionSignItem> e = nzs.e(DirectionSignItem.class, archive, this.items, false);
        this.items = e;
        this.items__is_initialized = true;
        this.nativeObject = init(this.position, this.direction, e);
    }

    public DirectionSign() {
        this.position__is_initialized = false;
        this.direction__is_initialized = false;
        this.items__is_initialized = false;
    }

    private DirectionSign(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.direction__is_initialized = false;
        this.items__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
