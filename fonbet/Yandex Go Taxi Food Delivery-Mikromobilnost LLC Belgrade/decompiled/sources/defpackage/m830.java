package defpackage;

/* loaded from: classes12.dex */
public final class m830 {
    public final lv90 a;
    public final lv90 b;

    public m830(lv90 lv90Var, lv90 lv90Var2) {
        this.a = lv90Var;
        this.b = lv90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m830)) {
            return false;
        }
        m830 m830Var = (m830) obj;
        return jl40.l(this.a, m830Var.a) && jl40.l(this.b, m830Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lv90 lv90Var = this.b;
        return hashCode + (lv90Var == null ? 0 : lv90Var.hashCode());
    }
}
