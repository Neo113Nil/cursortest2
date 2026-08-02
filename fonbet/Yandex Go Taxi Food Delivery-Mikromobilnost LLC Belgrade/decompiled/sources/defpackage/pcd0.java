package defpackage;

/* loaded from: classes2.dex */
public final class pcd0 {
    public final qcd0 a;
    public final String b;
    public final int c;

    public pcd0(qcd0 qcd0Var, String str, int i) {
        this.a = qcd0Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcd0)) {
            return false;
        }
        pcd0 pcd0Var = (pcd0) obj;
        return this.a.equals(pcd0Var.a) && jl40.l(this.b, pcd0Var.b) && this.c == pcd0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payment(price=");
        sb.append(this.a);
        sb.append(", period=");
        sb.append(this.b);
        sb.append(", repetitionCount=");
        return oyr.s(sb, this.c, ')');
    }
}
