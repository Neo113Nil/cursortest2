package defpackage;

/* loaded from: classes10.dex */
public final class m2r0 implements zkn {
    public final int a;
    public final int b;

    public m2r0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        boolean k = zi6Var.k();
        yi6 yi6Var = (yi6) zi6Var.y;
        if (k) {
            zi6Var.w = -1;
            zi6Var.x = -1;
        }
        int d = y6i0.d(this.a, 0, yi6Var.h());
        int d2 = y6i0.d(this.b, 0, yi6Var.h());
        if (d != d2) {
            if (d < d2) {
                zi6Var.n(d, d2);
            } else {
                zi6Var.n(d2, d);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2r0)) {
            return false;
        }
        m2r0 m2r0Var = (m2r0) obj;
        return this.a == m2r0Var.a && this.b == m2r0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return oyr.s(sb, this.b, ')');
    }
}
