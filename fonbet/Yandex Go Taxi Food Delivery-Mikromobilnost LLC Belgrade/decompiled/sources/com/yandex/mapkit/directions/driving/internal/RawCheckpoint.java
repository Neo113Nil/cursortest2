package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RawCheckpoint implements Serializable {
    private NativeObject nativeObject;
    private int position;
    private boolean position__is_initialized;

    public RawCheckpoint(int i) {
        this.position__is_initialized = false;
        this.nativeObject = init(i);
        this.position = i;
        this.position__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawCheckpoint";
    }

    private native int getPosition__Native();

    private native NativeObject init(int i);

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
            return;
        }
        int add = archive.add(this.position);
        this.position = add;
        this.position__is_initialized = true;
        this.nativeObject = init(add);
    }

    public RawCheckpoint() {
        this.position__is_initialized = false;
    }

    private RawCheckpoint(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
