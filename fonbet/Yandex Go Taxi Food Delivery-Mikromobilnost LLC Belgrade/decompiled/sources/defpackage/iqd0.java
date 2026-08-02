package defpackage;

/* loaded from: classes2.dex */
public final class iqd0 extends jqd0 {
    public final String a;
    public final String b;

    public iqd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqd0)) {
            return false;
        }
        iqd0 iqd0Var = (iqd0) obj;
        return jl40.l(this.a, iqd0Var.a) && jl40.l(this.b, iqd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(jsonResponse=");
        sb.append(this.a);
        sb.append(", traceId=");
        return b64.p(sb, this.b, ')');
    }
}
