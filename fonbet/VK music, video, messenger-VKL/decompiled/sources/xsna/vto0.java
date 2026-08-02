package xsna;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TimeMarkMicroseconds.kt */
/* loaded from: classes.dex */
public final class vto0 implements Comparable<vto0> {
    public final AtomicLong b = new AtomicLong(0);
    public final boolean c;

    public vto0() {
        this.c = a() != null;
    }

    public final Long a() {
        Long valueOf = Long.valueOf(this.b.get());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    public final boolean c() {
        if (this.c) {
            return false;
        }
        return this.b.compareAndSet(0L, TimeUnit.NANOSECONDS.toMicros(System.nanoTime()));
    }

    @Override // java.lang.Comparable
    public final int compareTo(vto0 vto0Var) {
        return epx.h(this.b.get(), vto0Var.b.get());
    }

    public final Long d(vto0 vto0Var) {
        Long a = vto0Var != null ? vto0Var.a() : null;
        Long a2 = a();
        if (a == null || a2 == null) {
            return null;
        }
        return Long.valueOf(a2.longValue() - a.longValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return vto0.class.equals(obj != null ? obj.getClass() : null) && this.b.get() == ((vto0) obj).b.get();
    }

    public final int hashCode() {
        return Long.hashCode(this.b.get());
    }
}
