package xsna;

/* compiled from: PanelColorScheme.kt */
/* loaded from: classes17.dex */
public final class xg90 {
    public final long a;

    public xg90(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg90) && l5g.d(this.a, ((xg90) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("PanelColorScheme(panelHeaderIcon="));
    }
}
