package xsna;

import io.jsonwebtoken.JwtParser;

/* compiled from: VkExecutorsWatchdogConfig.kt */
/* loaded from: classes.dex */
public final class dsu0 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public dsu0(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        if (1000 > j) {
            throw new IllegalArgumentException(q9k.d("Minimum allowable executors watchdog threshold is 1000. You try ", j, JwtParser.SEPARATOR_CHAR).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsu0)) {
            return false;
        }
        dsu0 dsu0Var = (dsu0) obj;
        return this.a == dsu0Var.a && this.b == dsu0Var.b && this.c == dsu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkExecutorsWatchdogConfig(fallbackThreshold=");
        sb.append(this.a);
        sb.append(", isExperimentalThreadPoolConfigEnabled=");
        sb.append(this.b);
        sb.append(", isTaskWaitTimeInPoolMetricsEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
