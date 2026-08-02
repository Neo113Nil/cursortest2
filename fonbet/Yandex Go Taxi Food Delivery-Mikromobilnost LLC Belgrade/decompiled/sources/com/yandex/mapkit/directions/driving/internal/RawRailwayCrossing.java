package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.RailwayCrossingType;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RawRailwayCrossing implements Serializable {
    private NativeObject nativeObject;
    private int position;
    private boolean position__is_initialized;
    private RailwayCrossingType type;
    private boolean type__is_initialized;

    public RawRailwayCrossing(int i, RailwayCrossingType railwayCrossingType) {
        this.position__is_initialized = false;
        this.type__is_initialized = false;
        if (railwayCrossingType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, railwayCrossingType);
        this.position = i;
        this.position__is_initialized = true;
        this.type = railwayCrossingType;
        this.type__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawRailwayCrossing";
    }

    private native int getPosition__Native();

    private native RailwayCrossingType getType__Native();

    private native NativeObject init(int i, RailwayCrossingType railwayCrossingType);

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

    public synchronized RailwayCrossingType getType() {
        try {
            if (!this.type__is_initialized) {
                this.type = getType__Native();
                this.type__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPosition());
            archive.add((Archive) getType(), false, (Class<Archive>) RailwayCrossingType.class);
            return;
        }
        this.position = archive.add(this.position);
        this.position__is_initialized = true;
        RailwayCrossingType railwayCrossingType = (RailwayCrossingType) archive.add((Archive) this.type, false, (Class<Archive>) RailwayCrossingType.class);
        this.type = railwayCrossingType;
        this.type__is_initialized = true;
        this.nativeObject = init(this.position, railwayCrossingType);
    }

    public RawRailwayCrossing() {
        this.position__is_initialized = false;
        this.type__is_initialized = false;
    }

    private RawRailwayCrossing(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.type__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
