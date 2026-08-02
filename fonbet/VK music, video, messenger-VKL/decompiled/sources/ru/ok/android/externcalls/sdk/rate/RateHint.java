package ru.ok.android.externcalls.sdk.rate;

import xsna.epx;
import xsna.zr;

/* compiled from: RateHint.kt */
/* loaded from: classes9.dex */
public final class RateHint {
    private final String reason;

    public RateHint(String str) {
        this.reason = str;
    }

    public static /* synthetic */ RateHint copy$default(RateHint rateHint, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rateHint.reason;
        }
        return rateHint.copy(str);
    }

    public final String component1() {
        return this.reason;
    }

    public final RateHint copy(String str) {
        return new RateHint(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RateHint) && epx.f(this.reason, ((RateHint) obj).reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        return zr.a("RateHint(reason=", this.reason, ")");
    }
}
