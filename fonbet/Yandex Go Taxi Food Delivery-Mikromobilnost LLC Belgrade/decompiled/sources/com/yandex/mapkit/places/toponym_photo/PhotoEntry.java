package com.yandex.mapkit.places.toponym_photo;

import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class PhotoEntry implements Serializable {
    private Image image;
    private boolean image__is_initialized;
    private NativeObject nativeObject;

    public PhotoEntry(Image image) {
        this.image__is_initialized = false;
        this.nativeObject = init(image);
        this.image = image;
        this.image__is_initialized = true;
    }

    private native Image getImage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::toponym_photo::PhotoEntry";
    }

    private native NativeObject init(Image image);

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
            archive.add((Archive) getImage(), true, (Class<Archive>) Image.class);
            return;
        }
        Image image = (Image) archive.add((Archive) this.image, true, (Class<Archive>) Image.class);
        this.image = image;
        this.image__is_initialized = true;
        this.nativeObject = init(image);
    }

    public PhotoEntry() {
        this.image__is_initialized = false;
    }

    private PhotoEntry(NativeObject nativeObject) {
        this.image__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
