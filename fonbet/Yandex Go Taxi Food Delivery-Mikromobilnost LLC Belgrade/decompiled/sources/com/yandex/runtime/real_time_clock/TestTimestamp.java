package com.yandex.runtime.real_time_clock;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class TestTimestamp implements Serializable {
    private long ntp;
    private long system;

    public TestTimestamp(long j, long j2) {
        this.system = j;
        this.ntp = j2;
    }

    public long getNtp() {
        return this.ntp;
    }

    public long getSystem() {
        return this.system;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.system = archive.add(this.system);
        this.ntp = archive.add(this.ntp);
    }

    public TestTimestamp() {
    }
}
