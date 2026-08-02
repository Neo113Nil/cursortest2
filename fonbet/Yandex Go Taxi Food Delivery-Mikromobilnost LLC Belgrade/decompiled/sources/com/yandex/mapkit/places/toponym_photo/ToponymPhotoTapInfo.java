package com.yandex.mapkit.places.toponym_photo;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ToponymPhotoTapInfo implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private String photoId;
    private boolean photoId__is_initialized;

    public ToponymPhotoTapInfo(String str) {
        this.photoId__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"photoId\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str);
        this.photoId = str;
        this.photoId__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::toponym_photo::ToponymPhotoTapInfo";
    }

    private native String getPhotoId__Native();

    private native NativeObject init(String str);

    public synchronized String getPhotoId() {
        try {
            if (!this.photoId__is_initialized) {
                this.photoId = getPhotoId__Native();
                this.photoId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.photoId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPhotoId(), false);
            return;
        }
        String add = archive.add(this.photoId, false);
        this.photoId = add;
        this.photoId__is_initialized = true;
        this.nativeObject = init(add);
    }

    public ToponymPhotoTapInfo() {
        this.photoId__is_initialized = false;
    }

    private ToponymPhotoTapInfo(NativeObject nativeObject) {
        this.photoId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
