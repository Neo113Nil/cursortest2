package defpackage;

/* loaded from: classes2.dex */
public final class lyz0 implements nyz0 {
    public final String a;
    public final long b;
    public final long c;

    public lyz0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyz0)) {
            return false;
        }
        lyz0 lyz0Var = (lyz0) obj;
        return jl40.l(this.a, lyz0Var.a) && this.b == lyz0Var.b && this.c == lyz0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(webPageUrl=");
        sb.append(this.a);
        sb.append(", startedTimeoutMillis=");
        sb.append(this.b);
        sb.append(", loadedTimeoutMillis=");
        return b64.o(sb, this.c, ')');
    }
}
