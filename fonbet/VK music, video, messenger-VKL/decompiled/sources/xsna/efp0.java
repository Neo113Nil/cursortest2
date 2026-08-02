package xsna;

/* compiled from: TrackColorScheme.kt */
/* loaded from: classes17.dex */
public final class efp0 {
    public final long a;
    public final long b;

    public efp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efp0)) {
            return false;
        }
        efp0 efp0Var = (efp0) obj;
        return l5g.d(this.a, efp0Var.a) && l5g.d(this.b, efp0Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackColorScheme(trackBackground=");
        dn.h(this.a, ", trackBuffer=", sb);
        return pm0.d(')', this.b, sb);
    }
}
