package com.yandex.mapkit.places.photos;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Image implements Serializable {
    private int height;
    private boolean height__is_initialized;
    private String imageId;
    private boolean imageId__is_initialized;
    private NativeObject nativeObject;
    private String size;
    private boolean size__is_initialized;
    private int width;
    private boolean width__is_initialized;

    public Image(String str, String str2, int i, int i2) {
        this.imageId__is_initialized = false;
        this.size__is_initialized = false;
        this.width__is_initialized = false;
        this.height__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"imageId\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"size\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, i, i2);
        this.imageId = str;
        this.imageId__is_initialized = true;
        this.size = str2;
        this.size__is_initialized = true;
        this.width = i;
        this.width__is_initialized = true;
        this.height = i2;
        this.height__is_initialized = true;
    }

    private native int getHeight__Native();

    private native String getImageId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::photos::Image";
    }

    private native String getSize__Native();

    private native int getWidth__Native();

    private native NativeObject init(String str, String str2, int i, int i2);

    public synchronized int getHeight() {
        try {
            if (!this.height__is_initialized) {
                this.height = getHeight__Native();
                this.height__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.height;
    }

    public synchronized String getImageId() {
        try {
            if (!this.imageId__is_initialized) {
                this.imageId = getImageId__Native();
                this.imageId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.imageId;
    }

    public synchronized String getSize() {
        try {
            if (!this.size__is_initialized) {
                this.size = getSize__Native();
                this.size__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.size;
    }

    public synchronized int getWidth() {
        try {
            if (!this.width__is_initialized) {
                this.width = getWidth__Native();
                this.width__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getImageId(), false);
            archive.add(getSize(), false);
            archive.add(getWidth());
            archive.add(getHeight());
            return;
        }
        this.imageId = archive.add(this.imageId, false);
        this.imageId__is_initialized = true;
        this.size = archive.add(this.size, false);
        this.size__is_initialized = true;
        this.width = archive.add(this.width);
        this.width__is_initialized = true;
        int add = archive.add(this.height);
        this.height = add;
        this.height__is_initialized = true;
        this.nativeObject = init(this.imageId, this.size, this.width, add);
    }

    public Image() {
        this.imageId__is_initialized = false;
        this.size__is_initialized = false;
        this.width__is_initialized = false;
        this.height__is_initialized = false;
    }

    private Image(NativeObject nativeObject) {
        this.imageId__is_initialized = false;
        this.size__is_initialized = false;
        this.width__is_initialized = false;
        this.height__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
