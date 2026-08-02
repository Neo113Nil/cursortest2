package defpackage;

/* loaded from: classes.dex */
public final class n951 {
    public final String a;
    public final int b;

    public n951(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n951)) {
            return false;
        }
        n951 n951Var = (n951) obj;
        return jl40.l(this.a, n951Var.a) && this.b == n951Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return oyr.s(sb, this.b, ')');
    }
}
