package defpackage;

/* loaded from: classes11.dex */
public final class clu0 extends vgb1 {
    public final String a;
    public final double b;

    public clu0(String str, double d) {
        this.a = str;
        this.b = d;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clu0)) {
            return false;
        }
        clu0 clu0Var = (clu0) obj;
        return jl40.l(this.a, clu0Var.a) && Double.compare(this.b, clu0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleStoredValue(name=");
        sb.append(this.a);
        sb.append(", value=");
        return unr0.q(sb, this.b, ')');
    }
}
