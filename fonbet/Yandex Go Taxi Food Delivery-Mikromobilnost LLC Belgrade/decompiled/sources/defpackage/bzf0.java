package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.a;

/* loaded from: classes8.dex */
public final class bzf0 implements pl5 {
    public static final i3y c;
    public static final i3y d;
    public static final bzf0 e;
    public final long a;
    public final TimeUnit b;

    static {
        i3y a = a.a(new pmf0(20));
        c = a;
        d = a.a(new pmf0(21));
        e = (bzf0) a.getValue();
    }

    public bzf0(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzf0)) {
            return false;
        }
        bzf0 bzf0Var = (bzf0) obj;
        return this.a == bzf0Var.a && this.b == bzf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(50) + ((this.b.hashCode() + qv10.c(Long.hashCode(1L) * 31, 31, this.a)) * 31);
    }

    public final String toString() {
        return "PulseBenchmarkParams(min=1, max=" + this.a + ", timeUnit=" + this.b + ", numBuckets=50)";
    }
}
