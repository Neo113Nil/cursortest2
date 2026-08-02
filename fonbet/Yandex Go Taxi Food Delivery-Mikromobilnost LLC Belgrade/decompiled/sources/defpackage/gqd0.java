package defpackage;

/* loaded from: classes2.dex */
public final class gqd0 {
    public final Throwable a;
    public final String b;

    public gqd0(Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqd0)) {
            return false;
        }
        gqd0 gqd0Var = (gqd0) obj;
        return jl40.l(this.a, gqd0Var.a) && jl40.l(this.b, gqd0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attempt(throwable=");
        sb.append(this.a);
        sb.append(", traceId=");
        return b64.p(sb, this.b, ')');
    }
}
