package xsna;

import kotlin.coroutines.d;

/* compiled from: ThreadContext.kt */
/* loaded from: classes8.dex */
public final class dro0 implements d.c<aro0<?>> {
    public final ThreadLocal<?> b;

    public dro0(ThreadLocal<?> threadLocal) {
        this.b = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dro0) && epx.f(this.b, ((dro0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.b + ')';
    }
}
