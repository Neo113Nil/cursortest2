package com.yandex.mapkit.places.mrc.internal;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ChunkDescriptor implements Serializable {
    private String payload;

    public ChunkDescriptor(String str) {
        this.payload = str;
    }

    public String getPayload() {
        return this.payload;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.payload = archive.add(this.payload, true);
    }

    public ChunkDescriptor() {
    }
}
