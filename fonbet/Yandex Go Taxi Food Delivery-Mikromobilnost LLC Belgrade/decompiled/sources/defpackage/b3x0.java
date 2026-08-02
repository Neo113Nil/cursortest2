package defpackage;

/* loaded from: classes.dex */
public final class b3x0 {
    public final String a;
    public final int b;
    public final int c;

    public b3x0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3x0)) {
            return false;
        }
        b3x0 b3x0Var = (b3x0) obj;
        return jl40.l(this.a, b3x0Var.a) && this.b == b3x0Var.b && this.c == b3x0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return oyr.s(sb, this.c, ')');
    }
}
