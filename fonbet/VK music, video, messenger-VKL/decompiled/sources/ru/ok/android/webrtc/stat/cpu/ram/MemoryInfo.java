package ru.ok.android.webrtc.stat.cpu.ram;

import xsna.epx;

/* loaded from: classes9.dex */
public final class MemoryInfo {
    public final Long a;
    public final Long b;

    public MemoryInfo(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public static /* synthetic */ MemoryInfo copy$default(MemoryInfo memoryInfo, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = memoryInfo.a;
        }
        if ((i & 2) != 0) {
            l2 = memoryInfo.b;
        }
        return memoryInfo.copy(l, l2);
    }

    public final Long component1() {
        return this.a;
    }

    public final Long component2() {
        return this.b;
    }

    public final MemoryInfo copy(Long l, Long l2) {
        return new MemoryInfo(l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryInfo)) {
            return false;
        }
        MemoryInfo memoryInfo = (MemoryInfo) obj;
        return epx.f(this.a, memoryInfo.a) && epx.f(this.b, memoryInfo.b);
    }

    public final Long getMemoryUsageKbAvg() {
        return this.b;
    }

    public final Long getMemoryUsageKbMax() {
        return this.a;
    }

    public int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "MemoryInfo(memoryUsageKbMax=" + this.a + ", memoryUsageKbAvg=" + this.b + ")";
    }
}
