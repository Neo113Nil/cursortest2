package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RawVertexZLevel implements Serializable {
    private NativeObject nativeObject;
    private int position;
    private boolean position__is_initialized;
    private int zlevel;
    private boolean zlevel__is_initialized;

    public RawVertexZLevel(int i, int i2) {
        this.position__is_initialized = false;
        this.zlevel__is_initialized = false;
        this.nativeObject = init(i, i2);
        this.position = i;
        this.position__is_initialized = true;
        this.zlevel = i2;
        this.zlevel__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawVertexZLevel";
    }

    private native int getPosition__Native();

    private native int getZlevel__Native();

    private native NativeObject init(int i, int i2);

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

    public synchronized int getZlevel() {
        try {
            if (!this.zlevel__is_initialized) {
                this.zlevel = getZlevel__Native();
                this.zlevel__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zlevel;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPosition());
            archive.add(getZlevel());
            return;
        }
        this.position = archive.add(this.position);
        this.position__is_initialized = true;
        int add = archive.add(this.zlevel);
        this.zlevel = add;
        this.zlevel__is_initialized = true;
        this.nativeObject = init(this.position, add);
    }

    public RawVertexZLevel() {
        this.position__is_initialized = false;
        this.zlevel__is_initialized = false;
    }

    private RawVertexZLevel(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.zlevel__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
