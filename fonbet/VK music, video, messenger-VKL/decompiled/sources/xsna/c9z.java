package xsna;

/* compiled from: LinkColorScheme.kt */
/* loaded from: classes17.dex */
public final class c9z {
    public final long a;

    public c9z(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9z) && l5g.d(this.a, ((c9z) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("LinkColorScheme(linkContrast="));
    }
}
