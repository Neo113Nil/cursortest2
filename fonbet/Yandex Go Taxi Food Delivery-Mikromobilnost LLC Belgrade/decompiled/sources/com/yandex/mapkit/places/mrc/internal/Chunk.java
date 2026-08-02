package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Chunk implements Serializable {
    private ChunkDescriptor chunkDescriptor;
    private Subpolyline subpolyline;

    public Chunk(Subpolyline subpolyline, ChunkDescriptor chunkDescriptor) {
        if (subpolyline == null) {
            ny61.g("Required field \"subpolyline\" cannot be null");
            throw null;
        }
        this.subpolyline = subpolyline;
        this.chunkDescriptor = chunkDescriptor;
    }

    public ChunkDescriptor getChunkDescriptor() {
        return this.chunkDescriptor;
    }

    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
        this.chunkDescriptor = (ChunkDescriptor) archive.add((Archive) this.chunkDescriptor, true, (Class<Archive>) ChunkDescriptor.class);
    }

    public Chunk() {
    }
}
