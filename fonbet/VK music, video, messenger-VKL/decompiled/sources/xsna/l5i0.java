package xsna;

/* compiled from: SegmentedColorScheme.kt */
/* loaded from: classes17.dex */
public final class l5i0 {
    public final long a;
    public final long b;

    public l5i0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5i0)) {
            return false;
        }
        l5i0 l5i0Var = (l5i0) obj;
        return l5g.d(this.a, l5i0Var.a) && l5g.d(this.b, l5i0Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentedColorScheme(segmentedControl=");
        dn.h(this.a, ", segmentedControlActive=", sb);
        return pm0.d(')', this.b, sb);
    }
}
