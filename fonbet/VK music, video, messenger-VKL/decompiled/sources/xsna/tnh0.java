package xsna;

/* compiled from: SearchColorScheme.kt */
/* loaded from: classes17.dex */
public final class tnh0 {
    public final long a;

    public tnh0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnh0) && l5g.d(this.a, ((tnh0) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("SearchColorScheme(searchFieldBackground="));
    }
}
