package com.yandex.mapkit.places.mrc.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TrackPreview implements Serializable {
    private ChunkList chunkList;
    private boolean chunkList__is_initialized;
    private NativeObject nativeObject;
    private PhotoStream preview;
    private boolean preview__is_initialized;

    public TrackPreview(PhotoStream photoStream, ChunkList chunkList) {
        this.preview__is_initialized = false;
        this.chunkList__is_initialized = false;
        this.nativeObject = init(photoStream, chunkList);
        this.preview = photoStream;
        this.preview__is_initialized = true;
        this.chunkList = chunkList;
        this.chunkList__is_initialized = true;
    }

    private native ChunkList getChunkList__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::mrc::internal::TrackPreview";
    }

    private native PhotoStream getPreview__Native();

    private native NativeObject init(PhotoStream photoStream, ChunkList chunkList);

    public synchronized ChunkList getChunkList() {
        try {
            if (!this.chunkList__is_initialized) {
                this.chunkList = getChunkList__Native();
                this.chunkList__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.chunkList;
    }

    public synchronized PhotoStream getPreview() {
        try {
            if (!this.preview__is_initialized) {
                this.preview = getPreview__Native();
                this.preview__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.preview;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPreview(), true, (Class<Archive>) PhotoStream.class);
            archive.add((Archive) getChunkList(), true, (Class<Archive>) ChunkList.class);
            return;
        }
        this.preview = (PhotoStream) archive.add((Archive) this.preview, true, (Class<Archive>) PhotoStream.class);
        this.preview__is_initialized = true;
        ChunkList chunkList = (ChunkList) archive.add((Archive) this.chunkList, true, (Class<Archive>) ChunkList.class);
        this.chunkList = chunkList;
        this.chunkList__is_initialized = true;
        this.nativeObject = init(this.preview, chunkList);
    }

    public TrackPreview() {
        this.preview__is_initialized = false;
        this.chunkList__is_initialized = false;
    }

    private TrackPreview(NativeObject nativeObject) {
        this.preview__is_initialized = false;
        this.chunkList__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
