package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PerformanceInfo implements Serializable {
    private CoroutinesUsage coroutinesUsage;

    public PerformanceInfo(CoroutinesUsage coroutinesUsage) {
        if (coroutinesUsage != null) {
            this.coroutinesUsage = coroutinesUsage;
        } else {
            ny61.g("Required field \"coroutinesUsage\" cannot be null");
            throw null;
        }
    }

    public CoroutinesUsage getCoroutinesUsage() {
        return this.coroutinesUsage;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.coroutinesUsage = (CoroutinesUsage) archive.add((Archive) this.coroutinesUsage, false, (Class<Archive>) CoroutinesUsage.class);
    }

    public PerformanceInfo() {
    }
}
