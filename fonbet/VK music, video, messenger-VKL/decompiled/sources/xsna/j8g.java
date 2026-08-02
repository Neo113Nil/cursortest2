package xsna;

/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes11.dex */
public final class j8g implements vho0 {
    public final long a;

    public j8g(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        vzw.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // xsna.vho0
    public final float a() {
        return l5g.e(this.a);
    }

    @Override // xsna.vho0
    public final long c() {
        return this.a;
    }

    @Override // xsna.vho0
    public final yk8 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8g) && l5g.d(this.a, ((j8g) obj).a);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pm0.d(')', this.a, new StringBuilder("ColorStyle(value="));
    }
}
