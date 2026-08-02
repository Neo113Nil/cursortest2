package defpackage;

/* loaded from: classes4.dex */
public final class cyy0 implements ese {
    public final ThreadLocal a;

    public cyy0(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyy0) && jl40.l(this.a, ((cyy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
