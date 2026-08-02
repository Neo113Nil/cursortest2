package xsna;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RegisteredReader.java */
/* loaded from: classes8.dex */
public final class lqf0 {
    public static final AtomicInteger e = new AtomicInteger(1);
    public final int a = e.incrementAndGet();
    public final dl20 b;
    public final k0u0 c;
    public volatile long d;

    public lqf0(dl20 dl20Var, k0u0 k0u0Var) {
        this.b = dl20Var;
        this.c = k0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lqf0) {
            return this.a == ((lqf0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return h5s.c(this.a, "}", new StringBuilder("RegisteredReader{"));
    }
}
