package defpackage;

/* loaded from: classes13.dex */
public final class ol4 {
    public final String a;
    public final int b;
    public final long c;

    public ol4(String str, int i, long j, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? 0 : i;
        j = (i2 & 4) != 0 ? 0L : j;
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol4)) {
            return false;
        }
        ol4 ol4Var = (ol4) obj;
        return jl40.l(this.a, ol4Var.a) && this.b == ol4Var.b && this.c == ol4Var.c;
    }

    public final int hashCode() {
        return qv10.c(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return oyr.n(this.c, ", isVisible=null)", b64.u(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", ", expirationTimeMs="));
    }

    public ol4() {
        this(null, 0, 0L, 15);
    }
}
