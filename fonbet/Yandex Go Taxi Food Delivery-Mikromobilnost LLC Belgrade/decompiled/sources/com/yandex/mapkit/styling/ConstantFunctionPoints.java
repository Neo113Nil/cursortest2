package com.yandex.mapkit.styling;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ConstantFunctionPoints implements Serializable {
    private NativeObject nativeObject;
    private float value;
    private boolean value__is_initialized;

    public ConstantFunctionPoints(float f) {
        this.value__is_initialized = false;
        this.nativeObject = init(f);
        this.value = f;
        this.value__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::styling::ConstantFunctionPoints";
    }

    private native float getValue__Native();

    private native NativeObject init(float f);

    public synchronized float getValue() {
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
        float add = archive.add(this.value);
        this.value = add;
        this.value__is_initialized = true;
        this.nativeObject = init(add);
    }

    public ConstantFunctionPoints() {
        this.value__is_initialized = false;
    }

    private ConstantFunctionPoints(NativeObject nativeObject) {
        this.value__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
