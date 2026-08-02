package defpackage;

/* loaded from: classes10.dex */
public final class n2r0 implements zkn {
    public final kk2 a;
    public final int b;

    public n2r0(String str, int i) {
        this.a = new kk2(str);
        this.b = i;
    }

    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        boolean k = zi6Var.k();
        kk2 kk2Var = this.a;
        if (k) {
            int i = zi6Var.w;
            int i2 = zi6Var.x;
            String str = kk2Var.b;
            String str2 = kk2Var.b;
            zi6Var.l(i, i2, str);
            if (str2.length() > 0) {
                zi6Var.n(i, str2.length() + i);
            }
        } else {
            int i3 = zi6Var.b;
            int i4 = zi6Var.c;
            String str3 = kk2Var.b;
            String str4 = kk2Var.b;
            zi6Var.l(i3, i4, str3);
            if (str4.length() > 0) {
                zi6Var.n(i3, str4.length() + i3);
            }
        }
        int j = zi6Var.j();
        int i5 = this.b;
        int d = y6i0.d(i5 > 0 ? (j + i5) - 1 : (j + i5) - kk2Var.b.length(), 0, ((yi6) zi6Var.y).h());
        zi6Var.p(d, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2r0)) {
            return false;
        }
        n2r0 n2r0Var = (n2r0) obj;
        return jl40.l(this.a.b, n2r0Var.a.b) && this.b == n2r0Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return oyr.s(sb, this.b, ')');
    }
}
