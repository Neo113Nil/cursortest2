package xsna;

/* compiled from: ActionColorScheme.kt */
/* loaded from: classes17.dex */
public final class wy {
    public final long a;

    public wy(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy) && l5g.d(this.a, ((wy) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("ActionColorScheme(actionSheetText="));
    }
}
