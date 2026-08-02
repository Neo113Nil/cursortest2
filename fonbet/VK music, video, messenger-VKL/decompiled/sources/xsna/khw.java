package xsna;

/* compiled from: ImageColorScheme.kt */
/* loaded from: classes17.dex */
public final class khw {
    public final long a;
    public final long b;
    public final long c;

    public khw(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khw)) {
            return false;
        }
        khw khwVar = (khw) obj;
        return l5g.d(this.a, khwVar.a) && l5g.d(this.b, khwVar.b) && l5g.d(this.c, khwVar.c);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageColorScheme(imageBorderAlpha=");
        dn.h(this.a, ", imagePlaceholder=", sb);
        dn.h(this.b, ", imagePlaceholderAlpha=", sb);
        return pm0.d(')', this.c, sb);
    }
}
