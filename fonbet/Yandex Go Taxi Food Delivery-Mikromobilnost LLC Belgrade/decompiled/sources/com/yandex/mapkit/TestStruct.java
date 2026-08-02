package com.yandex.mapkit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TestStruct implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private int value;
    private boolean value__is_initialized;

    public TestStruct(int i) {
        this.value__is_initialized = false;
        this.nativeObject = init(i);
        this.value = i;
        this.value__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::TestStruct";
    }

    private native int getValue__Native();

    private native NativeObject init(int i);

    public synchronized int getValue() {
        try {
            if (!this.value__is_initialized) {
                this.value = getValue__Native();
                this.value__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getValue());
            return;
        }
        int add = archive.add(this.value);
        this.value = add;
        this.value__is_initialized = true;
        this.nativeObject = init(add);
    }

    public TestStruct() {
        this.value__is_initialized = false;
    }

    private TestStruct(NativeObject nativeObject) {
        this.value__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
