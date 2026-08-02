package defpackage;

/* loaded from: classes.dex */
public final class hvj0 {
    public final int a;
    public final Object b;

    public hvj0(Throwable th, int i, int i2) {
        i = (i2 & 1) != 0 ? -1 : i;
        th = (i2 & 2) != 0 ? null : th;
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvj0)) {
            return false;
        }
        hvj0 hvj0Var = (hvj0) obj;
        return this.a == hvj0Var.a && jl40.l(this.b, hvj0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(httpCode=");
        sb.append(this.a);
        sb.append(", error=");
        return qv10.r(sb, this.b, ')');
    }

    public hvj0() {
        this(null, 0, 3);
    }
}
