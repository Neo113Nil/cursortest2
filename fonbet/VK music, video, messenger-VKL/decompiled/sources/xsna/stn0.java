package xsna;

/* compiled from: TabbarColorScheme.kt */
/* loaded from: classes17.dex */
public final class stn0 {
    public final long a;

    public stn0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stn0) && l5g.d(this.a, ((stn0) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("TabbarColorScheme(tabbarTextInactive="));
    }
}
