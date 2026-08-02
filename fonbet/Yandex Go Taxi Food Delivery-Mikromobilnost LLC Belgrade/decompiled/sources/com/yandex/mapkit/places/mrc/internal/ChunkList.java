package com.yandex.mapkit.places.mrc.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class ChunkList implements Serializable {
    private List<Chunk> chunks;
    private boolean chunks__is_initialized;
    private NativeObject nativeObject;

    public ChunkList(List<Chunk> list) {
        this.chunks__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"chunks\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.chunks = list;
        this.chunks__is_initialized = true;
    }

    private native List<Chunk> getChunks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::mrc::internal::ChunkList";
    }

    private native NativeObject init(List<Chunk> list);

    public synchronized List<Chunk> getChunks() {
        try {
            if (!this.chunks__is_initialized) {
                this.chunks = getChunks__Native();
                this.chunks__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.chunks;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Chunk.class, archive, getChunks(), false);
            return;
        }
        List<Chunk> e = nzs.e(Chunk.class, archive, this.chunks, false);
        this.chunks = e;
        this.chunks__is_initialized = true;
        this.nativeObject = init(e);
    }

    public ChunkList() {
        this.chunks__is_initialized = false;
    }

    private ChunkList(NativeObject nativeObject) {
        this.chunks__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
