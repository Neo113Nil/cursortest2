package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ColorGradient implements Serializable {
    private int beginColor;
    private boolean beginColor__is_initialized;
    private int endColor;
    private boolean endColor__is_initialized;
    private float length;
    private boolean length__is_initialized;
    private NativeObject nativeObject;

    public ColorGradient(int i, int i2, float f) {
        this.beginColor__is_initialized = false;
        this.endColor__is_initialized = false;
        this.length__is_initialized = false;
        this.nativeObject = init(i, i2, f);
        this.beginColor = i;
        this.beginColor__is_initialized = true;
        this.endColor = i2;
        this.endColor__is_initialized = true;
        this.length = f;
        this.length__is_initialized = true;
    }

    private native int getBeginColor__Native();

    private native int getEndColor__Native();

    private native float getLength__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::ColorGradient";
    }

    private native NativeObject init(int i, int i2, float f);

    public synchronized int getBeginColor() {
        try {
            if (!this.beginColor__is_initialized) {
                this.beginColor = getBeginColor__Native();
                this.beginColor__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.beginColor;
    }

    public synchronized int getEndColor() {
        try {
            if (!this.endColor__is_initialized) {
                this.endColor = getEndColor__Native();
                this.endColor__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.endColor;
    }

    public synchronized float getLength() {
        try {
            if (!this.length__is_initialized) {
                this.length = getLength__Native();
                this.length__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.length;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getBeginColor());
            archive.add(getEndColor());
            archive.add(getLength());
            return;
        }
        this.beginColor = archive.add(this.beginColor);
        this.beginColor__is_initialized = true;
        this.endColor = archive.add(this.endColor);
        this.endColor__is_initialized = true;
        float add = archive.add(this.length);
        this.length = add;
        this.length__is_initialized = true;
        this.nativeObject = init(this.beginColor, this.endColor, add);
    }

    public ColorGradient() {
        this.beginColor__is_initialized = false;
        this.endColor__is_initialized = false;
        this.length__is_initialized = false;
    }

    private ColorGradient(NativeObject nativeObject) {
        this.beginColor__is_initialized = false;
        this.endColor__is_initialized = false;
        this.length__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
