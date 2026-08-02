package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: Measurement.kt */
/* loaded from: classes.dex */
public final class mp10 implements Comparable<mp10> {
    public final String b;
    public final long c;
    public final TimeUnit d;

    public mp10(String str, long j, TimeUnit timeUnit) {
        this.b = str;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Comparable
    public final int compareTo(mp10 mp10Var) {
        mp10 mp10Var2 = mp10Var;
        int h = epx.h(this.d.toNanos(this.c), mp10Var2.d.toNanos(mp10Var2.c));
        Integer valueOf = Integer.valueOf(h);
        if (h == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.b.compareTo(mp10Var2.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp10)) {
            return false;
        }
        mp10 mp10Var = (mp10) obj;
        return epx.f(this.b, mp10Var.b) && this.c == mp10Var.c && this.d == mp10Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "Measurement(taskName=" + this.b + ", duration=" + this.c + ", unit=" + this.d + ')';
    }
}
