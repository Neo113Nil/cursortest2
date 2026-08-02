package xsna;

/* compiled from: SkeletonColorScheme.kt */
/* loaded from: classes17.dex */
public final class eyj0 {
    public final long a;
    public final long b;

    public eyj0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyj0)) {
            return false;
        }
        eyj0 eyj0Var = (eyj0) obj;
        return l5g.d(this.a, eyj0Var.a) && l5g.d(this.b, eyj0Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkeletonColorScheme(skeletonFrom=");
        dn.h(this.a, ", skeletonTo=", sb);
        return pm0.d(')', this.b, sb);
    }
}
