package xsna;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MviTaskId.kt */
/* loaded from: classes3.dex */
public final class qn50 implements on50 {
    public static final AtomicLong b = new AtomicLong();
    public final long a;

    public qn50() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn50) && this.a == ((qn50) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("MviTaskRandomId(id="));
    }

    public qn50(int i) {
        AtomicLong atomicLong = b;
        atomicLong.compareAndSet(Long.MAX_VALUE, 0L);
        this.a = atomicLong.incrementAndGet();
    }
}
