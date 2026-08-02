package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RawSpeedLimit implements Serializable {
    private int count;
    private boolean count__is_initialized;
    private NativeObject nativeObject;
    private Float speed;
    private boolean speed__is_initialized;

    public RawSpeedLimit(int i, Float f) {
        this.count__is_initialized = false;
        this.speed__is_initialized = false;
        this.nativeObject = init(i, f);
        this.count = i;
        this.count__is_initialized = true;
        this.speed = f;
        this.speed__is_initialized = true;
    }

    private native int getCount__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawSpeedLimit";
    }

    private native Float getSpeed__Native();

    private native NativeObject init(int i, Float f);

    public synchronized int getCount() {
        try {
            if (!this.count__is_initialized) {
                this.count = getCount__Native();
                this.count__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.count;
    }

    public synchronized Float getSpeed() {
        try {
            if (!this.speed__is_initialized) {
                this.speed = getSpeed__Native();
                this.speed__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCount());
            archive.add(getSpeed(), true);
            return;
        }
        this.count = archive.add(this.count);
        this.count__is_initialized = true;
        Float add = archive.add(this.speed, true);
        this.speed = add;
        this.speed__is_initialized = true;
        this.nativeObject = init(this.count, add);
    }

    public RawSpeedLimit() {
        this.count__is_initialized = false;
        this.speed__is_initialized = false;
    }

    private RawSpeedLimit(NativeObject nativeObject) {
        this.count__is_initialized = false;
        this.speed__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
