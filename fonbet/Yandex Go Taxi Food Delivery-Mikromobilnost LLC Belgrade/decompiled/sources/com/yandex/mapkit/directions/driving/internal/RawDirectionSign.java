package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.DirectionSignDirection;
import com.yandex.mapkit.directions.driving.DirectionSignItem;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawDirectionSign implements Serializable {
    private DirectionSignDirection direction;
    private boolean direction__is_initialized;
    private List<DirectionSignItem> items;
    private boolean items__is_initialized;
    private NativeObject nativeObject;
    private int position;
    private boolean position__is_initialized;

    public RawDirectionSign(int i, DirectionSignDirection directionSignDirection, List<DirectionSignItem> list) {
        this.position__is_initialized = false;
        this.direction__is_initialized = false;
        this.items__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"items\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, directionSignDirection, list);
        this.position = i;
        this.position__is_initialized = true;
        this.direction = directionSignDirection;
        this.direction__is_initialized = true;
        this.items = list;
        this.items__is_initialized = true;
    }

    private native DirectionSignDirection getDirection__Native();

    private native List<DirectionSignItem> getItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawDirectionSign";
    }

    private native int getPosition__Native();

    private native NativeObject init(int i, DirectionSignDirection directionSignDirection, List<DirectionSignItem> list);

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

    public synchronized int getPosition() {
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
            archive.add(getPosition());
            archive.add((Archive) getDirection(), true, (Class<Archive>) DirectionSignDirection.class);
            nzs.m(DirectionSignItem.class, archive, getItems(), false);
            return;
        }
        this.position = archive.add(this.position);
        this.position__is_initialized = true;
        this.direction = (DirectionSignDirection) archive.add((Archive) this.direction, true, (Class<Archive>) DirectionSignDirection.class);
        this.direction__is_initialized = true;
        List<DirectionSignItem> e = nzs.e(DirectionSignItem.class, archive, this.items, false);
        this.items = e;
        this.items__is_initialized = true;
        this.nativeObject = init(this.position, this.direction, e);
    }

    public RawDirectionSign() {
        this.position__is_initialized = false;
        this.direction__is_initialized = false;
        this.items__is_initialized = false;
    }

    private RawDirectionSign(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.direction__is_initialized = false;
        this.items__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
