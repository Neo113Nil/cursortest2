package ru.ok.android.externcalls.sdk.p2prelay;

import xsna.epx;

/* compiled from: P2PRelaySwitchConfig.kt */
/* loaded from: classes9.dex */
public final class P2PRelaySwitchConfig {
    private final Long rttMs;
    private final int rttViolationCount;

    public P2PRelaySwitchConfig(Long l, int i) {
        this.rttMs = l;
        this.rttViolationCount = i;
    }

    public static /* synthetic */ P2PRelaySwitchConfig copy$default(P2PRelaySwitchConfig p2PRelaySwitchConfig, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = p2PRelaySwitchConfig.rttMs;
        }
        if ((i2 & 2) != 0) {
            i = p2PRelaySwitchConfig.rttViolationCount;
        }
        return p2PRelaySwitchConfig.copy(l, i);
    }

    public final Long component1() {
        return this.rttMs;
    }

    public final int component2() {
        return this.rttViolationCount;
    }

    public final P2PRelaySwitchConfig copy(Long l, int i) {
        return new P2PRelaySwitchConfig(l, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PRelaySwitchConfig)) {
            return false;
        }
        P2PRelaySwitchConfig p2PRelaySwitchConfig = (P2PRelaySwitchConfig) obj;
        return epx.f(this.rttMs, p2PRelaySwitchConfig.rttMs) && this.rttViolationCount == p2PRelaySwitchConfig.rttViolationCount;
    }

    public final Long getRttMs() {
        return this.rttMs;
    }

    public final int getRttViolationCount() {
        return this.rttViolationCount;
    }

    public int hashCode() {
        Long l = this.rttMs;
        return Integer.hashCode(this.rttViolationCount) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public String toString() {
        return "P2PRelaySwitchConfig(rttMs=" + this.rttMs + ", rttViolationCount=" + this.rttViolationCount + ")";
    }
}
