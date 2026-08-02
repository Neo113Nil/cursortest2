package com.yandex.mapkit.location;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Range implements Serializable {
    private double from;
    private boolean from__is_initialized;
    private NativeObject nativeObject;
    private double to;
    private boolean to__is_initialized;

    public Range(double d, double d2) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = init(d, d2);
        this.from = d;
        this.from__is_initialized = true;
        this.to = d2;
        this.to__is_initialized = true;
    }

    private native double getFrom__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::Range";
    }

    private native double getTo__Native();

    private native NativeObject init(double d, double d2);

    public synchronized double getFrom() {
        try {
            if (!this.from__is_initialized) {
                this.from = getFrom__Native();
                this.from__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.from;
    }

    public synchronized double getTo() {
        try {
            if (!this.to__is_initialized) {
                this.to = getTo__Native();
                this.to__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.to;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFrom());
            archive.add(getTo());
            return;
        }
        this.from = archive.add(this.from);
        this.from__is_initialized = true;
        double add = archive.add(this.to);
        this.to = add;
        this.to__is_initialized = true;
        this.nativeObject = init(this.from, add);
    }

    public Range() {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
    }

    private Range(NativeObject nativeObject) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
