package xsna;

import com.vk.toggle.data.RateMode;

/* compiled from: RateLimiterConfig.kt */
/* loaded from: classes6.dex */
public final class zwe0 {
    public final int a;
    public final long b;
    public final RateMode c;

    public zwe0(int i, long j, RateMode rateMode) {
        this.a = i;
        this.b = j;
        this.c = rateMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwe0)) {
            return false;
        }
        zwe0 zwe0Var = (zwe0) obj;
        return this.a == zwe0Var.a && this.b == zwe0Var.b && this.c == zwe0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "RateLimitParams(maxRequests=" + this.a + ", windowMs=" + this.b + ", mode=" + this.c + ')';
    }
}
