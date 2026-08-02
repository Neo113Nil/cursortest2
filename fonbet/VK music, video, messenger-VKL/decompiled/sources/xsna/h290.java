package xsna;

/* compiled from: OverlayColorScheme.kt */
/* loaded from: classes17.dex */
public final class h290 {
    public final long a;
    public final long b;

    public h290(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h290)) {
            return false;
        }
        h290 h290Var = (h290) obj;
        return l5g.d(this.a, h290Var.a) && l5g.d(this.b, h290Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayColorScheme(overlayPrimary=");
        dn.h(this.a, ", overlaySecondary=", sb);
        return pm0.d(')', this.b, sb);
    }
}
