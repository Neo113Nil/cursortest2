package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicJobConfig.kt */
/* loaded from: classes.dex */
public final class lx90 {
    public final long a;
    public final TimeUnit b;
    public final usl c;

    public lx90(long j, TimeUnit timeUnit, usl uslVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = uslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx90)) {
            return false;
        }
        lx90 lx90Var = (lx90) obj;
        return this.a == lx90Var.a && this.b == lx90Var.b && epx.f(this.c, lx90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "PeriodicJobConfig(interval=" + this.a + ", intervalTimeUnit=" + this.b + ", baseConfig=" + this.c + ')';
    }
}
