package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class CoroutinesUsage implements Serializable {
    private long count;
    private long stackSize;

    public CoroutinesUsage(long j, long j2) {
        this.count = j;
        this.stackSize = j2;
    }

    public long getCount() {
        return this.count;
    }

    public long getStackSize() {
        return this.stackSize;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.count = archive.add(this.count);
        this.stackSize = archive.add(this.stackSize);
    }

    public CoroutinesUsage() {
    }
}
