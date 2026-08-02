package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class POIObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private int reserved;
    private boolean reserved__is_initialized;

    public POIObjectMetadata(int i) {
        this.reserved__is_initialized = false;
        this.nativeObject = init(i);
        this.reserved = i;
        this.reserved__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::POIObjectMetadata";
    }

    private native int getReserved__Native();

    private native NativeObject init(int i);

    public synchronized int getReserved() {
        try {
            if (!this.reserved__is_initialized) {
                this.reserved = getReserved__Native();
                this.reserved__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.reserved;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getReserved());
            return;
        }
        int add = archive.add(this.reserved);
        this.reserved = add;
        this.reserved__is_initialized = true;
        this.nativeObject = init(add);
    }

    public POIObjectMetadata() {
        this.reserved__is_initialized = false;
    }

    private POIObjectMetadata(NativeObject nativeObject) {
        this.reserved__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
