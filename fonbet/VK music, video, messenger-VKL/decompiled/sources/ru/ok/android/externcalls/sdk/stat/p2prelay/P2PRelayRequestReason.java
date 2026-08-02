package ru.ok.android.externcalls.sdk.stat.p2prelay;

import com.huawei.hms.framework.common.BundleUtil;
import xsna.bh10;
import xsna.epx;
import xsna.rqi;

/* compiled from: P2PRelayRequestReason.kt */
/* loaded from: classes9.dex */
public final class P2PRelayRequestReason {
    private final long threshold;
    private final String trigger;
    private final int violationsCount;

    public P2PRelayRequestReason(String str, long j, int i) {
        this.trigger = str;
        this.threshold = j;
        this.violationsCount = i;
    }

    public static /* synthetic */ P2PRelayRequestReason copy$default(P2PRelayRequestReason p2PRelayRequestReason, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = p2PRelayRequestReason.trigger;
        }
        if ((i2 & 2) != 0) {
            j = p2PRelayRequestReason.threshold;
        }
        if ((i2 & 4) != 0) {
            i = p2PRelayRequestReason.violationsCount;
        }
        return p2PRelayRequestReason.copy(str, j, i);
    }

    public final String asStatString() {
        return this.trigger + BundleUtil.UNDERLINE_TAG + this.threshold + BundleUtil.UNDERLINE_TAG + this.violationsCount;
    }

    public final String component1() {
        return this.trigger;
    }

    public final long component2() {
        return this.threshold;
    }

    public final int component3() {
        return this.violationsCount;
    }

    public final P2PRelayRequestReason copy(String str, long j, int i) {
        return new P2PRelayRequestReason(str, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PRelayRequestReason)) {
            return false;
        }
        P2PRelayRequestReason p2PRelayRequestReason = (P2PRelayRequestReason) obj;
        return epx.f(this.trigger, p2PRelayRequestReason.trigger) && this.threshold == p2PRelayRequestReason.threshold && this.violationsCount == p2PRelayRequestReason.violationsCount;
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public final int getViolationsCount() {
        return this.violationsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.violationsCount) + bh10.a(this.trigger.hashCode() * 31, 31, this.threshold);
    }

    public String toString() {
        String str = this.trigger;
        long j = this.threshold;
        int i = this.violationsCount;
        StringBuilder d = rqi.d(j, "P2PRelayRequestReason(trigger=", str, ", threshold=");
        d.append(", violationsCount=");
        d.append(i);
        d.append(")");
        return d.toString();
    }
}
