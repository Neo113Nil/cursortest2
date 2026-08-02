package ru.ok.android.externcalls.sdk.rate.rtt;

import xsna.epx;
import xsna.zcl;

/* compiled from: RttRateHintConfig.kt */
/* loaded from: classes9.dex */
public final class RttRateHintConfig {
    public static final Companion Companion = new Companion(null);
    public static final String RTT = "rtt";
    private final int highRttCount;
    private final Long rttMs;

    /* compiled from: RttRateHintConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RttRateHintConfig() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RttRateHintConfig copy$default(RttRateHintConfig rttRateHintConfig, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = rttRateHintConfig.rttMs;
        }
        if ((i2 & 2) != 0) {
            i = rttRateHintConfig.highRttCount;
        }
        return rttRateHintConfig.copy(l, i);
    }

    public final Long component1() {
        return this.rttMs;
    }

    public final int component2() {
        return this.highRttCount;
    }

    public final RttRateHintConfig copy(Long l, int i) {
        return new RttRateHintConfig(l, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RttRateHintConfig)) {
            return false;
        }
        RttRateHintConfig rttRateHintConfig = (RttRateHintConfig) obj;
        return epx.f(this.rttMs, rttRateHintConfig.rttMs) && this.highRttCount == rttRateHintConfig.highRttCount;
    }

    public final int getHighRttCount() {
        return this.highRttCount;
    }

    public final Long getRttMs() {
        return this.rttMs;
    }

    public int hashCode() {
        Long l = this.rttMs;
        return Integer.hashCode(this.highRttCount) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final boolean isNotEmpty() {
        return this.rttMs != null;
    }

    public String toString() {
        return "RttRateHintConfig(rttMs=" + this.rttMs + ", highRttCount=" + this.highRttCount + ")";
    }

    public RttRateHintConfig(Long l, int i) {
        this.rttMs = l;
        this.highRttCount = i;
    }

    public /* synthetic */ RttRateHintConfig(Long l, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? 1 : i);
    }
}
