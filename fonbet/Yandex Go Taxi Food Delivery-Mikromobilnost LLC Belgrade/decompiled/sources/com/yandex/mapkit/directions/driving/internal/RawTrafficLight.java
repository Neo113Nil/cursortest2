package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RawTrafficLight implements Serializable {
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private int position;
    private boolean position__is_initialized;

    public RawTrafficLight(int i, String str) {
        this.position__is_initialized = false;
        this.id__is_initialized = false;
        this.nativeObject = init(i, str);
        this.position = i;
        this.position__is_initialized = true;
        this.id = str;
        this.id__is_initialized = true;
    }

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawTrafficLight";
    }

    private native int getPosition__Native();

    private native NativeObject init(int i, String str);

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
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
            archive.add(getId(), true);
            return;
        }
        this.position = archive.add(this.position);
        this.position__is_initialized = true;
        String add = archive.add(this.id, true);
        this.id = add;
        this.id__is_initialized = true;
        this.nativeObject = init(this.position, add);
    }

    public RawTrafficLight() {
        this.position__is_initialized = false;
        this.id__is_initialized = false;
    }

    private RawTrafficLight(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.id__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
