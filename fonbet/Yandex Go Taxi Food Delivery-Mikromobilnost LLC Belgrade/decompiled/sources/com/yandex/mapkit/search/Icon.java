package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Icon implements Serializable {
    private ImagePoint anchor;
    private boolean anchor__is_initialized;
    private Image image;
    private boolean image__is_initialized;
    private NativeObject nativeObject;

    public Icon(Image image, ImagePoint imagePoint) {
        this.image__is_initialized = false;
        this.anchor__is_initialized = false;
        if (image == null) {
            ny61.g("Required field \"image\" cannot be null");
            throw null;
        }
        this.nativeObject = init(image, imagePoint);
        this.image = image;
        this.image__is_initialized = true;
        this.anchor = imagePoint;
        this.anchor__is_initialized = true;
    }

    private native ImagePoint getAnchor__Native();

    private native Image getImage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Icon";
    }

    private native NativeObject init(Image image, ImagePoint imagePoint);

    public synchronized ImagePoint getAnchor() {
        try {
            if (!this.anchor__is_initialized) {
                this.anchor = getAnchor__Native();
                this.anchor__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.anchor;
    }

    public synchronized Image getImage() {
        try {
            if (!this.image__is_initialized) {
                this.image = getImage__Native();
                this.image__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.image;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getImage(), false, (Class<Archive>) Image.class);
            archive.add((Archive) getAnchor(), true, (Class<Archive>) ImagePoint.class);
            return;
        }
        this.image = (Image) archive.add((Archive) this.image, false, (Class<Archive>) Image.class);
        this.image__is_initialized = true;
        ImagePoint imagePoint = (ImagePoint) archive.add((Archive) this.anchor, true, (Class<Archive>) ImagePoint.class);
        this.anchor = imagePoint;
        this.anchor__is_initialized = true;
        this.nativeObject = init(this.image, imagePoint);
    }

    public Icon() {
        this.image__is_initialized = false;
        this.anchor__is_initialized = false;
    }

    private Icon(NativeObject nativeObject) {
        this.image__is_initialized = false;
        this.anchor__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
