package defpackage;

/* loaded from: classes10.dex */
public final class hb30 {
    public final long a;
    public final long b;
    public final boolean c;

    public hb30(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final hb30 a(hb30 hb30Var) {
        return new hb30(wu60.f(this.a, hb30Var.a), Math.max(this.b, hb30Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb30)) {
            return false;
        }
        hb30 hb30Var = (hb30) obj;
        return wu60.c(this.a, hb30Var.a) && this.b == hb30Var.b && this.c == hb30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) wu60.h(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return unr0.u(sb, this.c, ')');
    }
}
