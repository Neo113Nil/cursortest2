package xsna;

/* compiled from: HeaderColorScheme.kt */
/* loaded from: classes17.dex */
public final class jwu {
    public final long a;

    public jwu(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwu) && l5g.d(this.a, ((jwu) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("HeaderColorScheme(headerBackground="));
    }
}
