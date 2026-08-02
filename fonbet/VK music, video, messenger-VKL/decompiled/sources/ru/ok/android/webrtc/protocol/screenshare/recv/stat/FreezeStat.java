package ru.ok.android.webrtc.protocol.screenshare.recv.stat;

import xsna.jr;

/* loaded from: classes9.dex */
public final class FreezeStat {
    public final int a;
    public final long b;

    public FreezeStat(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static /* synthetic */ FreezeStat copy$default(FreezeStat freezeStat, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = freezeStat.a;
        }
        if ((i2 & 2) != 0) {
            j = freezeStat.b;
        }
        return freezeStat.copy(i, j);
    }

    public final int component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    public final FreezeStat copy(int i, long j) {
        return new FreezeStat(i, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreezeStat)) {
            return false;
        }
        FreezeStat freezeStat = (FreezeStat) obj;
        return this.a == freezeStat.a && this.b == freezeStat.b;
    }

    public final int getFreezeCount() {
        return this.a;
    }

    public final long getTotalFreezeDuration() {
        return this.b;
    }

    public int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder b = jr.b(this.a, "FreezeStat(freezeCount=", ", totalFreezeDuration=", this.b);
        b.append(")");
        return b.toString();
    }
}
