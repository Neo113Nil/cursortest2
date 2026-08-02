package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Chance implements Serializable {
    private NativeObject nativeObject;
    private Integer priority;
    private boolean priority__is_initialized;
    private Float value;
    private boolean value__is_initialized;

    public Chance(Integer num, Float f) {
        this.priority__is_initialized = false;
        this.value__is_initialized = false;
        this.nativeObject = init(num, f);
        this.priority = num;
        this.priority__is_initialized = true;
        this.value = f;
        this.value__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Chance";
    }

    private native Integer getPriority__Native();

    private native Float getValue__Native();

    private native NativeObject init(Integer num, Float f);

    public synchronized Integer getPriority() {
        try {
            if (!this.priority__is_initialized) {
                this.priority = getPriority__Native();
                this.priority__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.priority;
    }

    public synchronized Float getValue() {
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
            archive.add(getPriority(), true);
            archive.add(getValue(), true);
            return;
        }
        this.priority = archive.add(this.priority, true);
        this.priority__is_initialized = true;
        Float add = archive.add(this.value, true);
        this.value = add;
        this.value__is_initialized = true;
        this.nativeObject = init(this.priority, add);
    }

    public Chance() {
        this.priority__is_initialized = false;
        this.value__is_initialized = false;
    }

    private Chance(NativeObject nativeObject) {
        this.priority__is_initialized = false;
        this.value__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
