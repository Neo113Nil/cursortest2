package defpackage;

/* loaded from: classes2.dex */
public final class b4v0 {
    public final String a;
    public final long b;
    public final long c;

    public b4v0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4v0)) {
            return false;
        }
        b4v0 b4v0Var = (b4v0) obj;
        return jl40.l(this.a, b4v0Var.a) && this.b == b4v0Var.b && this.c == b4v0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessWebConfiguration(url=");
        sb.append(this.a);
        sb.append(", loadMessageTimeoutMillis=");
        sb.append(this.b);
        sb.append(", startMessageTimeoutMillis=");
        return b64.o(sb, this.c, ')');
    }
}
