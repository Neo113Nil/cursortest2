package xsna;

/* compiled from: Reorderable.kt */
/* loaded from: classes17.dex */
public final class cqk0 {
    public final long a;

    public cqk0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqk0) && wlb0.g(this.a, ((cqk0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "StartDrag(id=" + ((Object) wlb0.u(this.a)) + ", offset=null)";
    }
}
