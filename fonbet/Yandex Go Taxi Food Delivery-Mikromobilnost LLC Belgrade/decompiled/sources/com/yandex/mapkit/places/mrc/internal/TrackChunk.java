package com.yandex.mapkit.places.mrc.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TrackChunk implements Serializable {
    private NativeObject nativeObject;
    private PhotoStream photos;
    private boolean photos__is_initialized;

    public TrackChunk(PhotoStream photoStream) {
        this.photos__is_initialized = false;
        this.nativeObject = init(photoStream);
        this.photos = photoStream;
        this.photos__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::mrc::internal::TrackChunk";
    }

    private native PhotoStream getPhotos__Native();

    private native NativeObject init(PhotoStream photoStream);

    public synchronized PhotoStream getPhotos() {
        try {
            if (!this.photos__is_initialized) {
                this.photos = getPhotos__Native();
                this.photos__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.photos;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPhotos(), true, (Class<Archive>) PhotoStream.class);
            return;
        }
        PhotoStream photoStream = (PhotoStream) archive.add((Archive) this.photos, true, (Class<Archive>) PhotoStream.class);
        this.photos = photoStream;
        this.photos__is_initialized = true;
        this.nativeObject = init(photoStream);
    }

    public TrackChunk() {
        this.photos__is_initialized = false;
    }

    private TrackChunk(NativeObject nativeObject) {
        this.photos__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
