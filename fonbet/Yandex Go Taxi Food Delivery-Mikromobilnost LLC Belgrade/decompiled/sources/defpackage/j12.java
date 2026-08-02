package defpackage;

/* loaded from: classes10.dex */
public final class j12 {
    public final String a;
    public final int b;

    public j12(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j12)) {
            return false;
        }
        j12 j12Var = (j12) obj;
        return jl40.l(this.a, j12Var.a) && this.b == j12Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultColumn(name=");
        sb.append(this.a);
        sb.append(", index=");
        return oyr.s(sb, this.b, ')');
    }
}
