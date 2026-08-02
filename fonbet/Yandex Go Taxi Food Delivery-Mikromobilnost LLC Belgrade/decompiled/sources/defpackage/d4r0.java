package defpackage;

/* loaded from: classes10.dex */
public final class d4r0 implements zkn {
    public final int a;
    public final int b;

    public d4r0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        int d = y6i0.d(this.a, 0, ((yi6) zi6Var.y).h());
        int d2 = y6i0.d(this.b, 0, ((yi6) zi6Var.y).h());
        if (d < d2) {
            zi6Var.p(d, d2);
        } else {
            zi6Var.p(d2, d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4r0)) {
            return false;
        }
        d4r0 d4r0Var = (d4r0) obj;
        return this.a == d4r0Var.a && this.b == d4r0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return oyr.s(sb, this.b, ')');
    }
}
