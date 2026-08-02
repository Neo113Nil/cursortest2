package defpackage;

/* loaded from: classes10.dex */
public final class fnc implements zkn {
    public final kk2 a;
    public final int b;

    public fnc(String str, int i) {
        this(new kk2(str), i);
    }

    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        boolean k = zi6Var.k();
        kk2 kk2Var = this.a;
        if (k) {
            zi6Var.l(zi6Var.w, zi6Var.x, kk2Var.b);
        } else {
            zi6Var.l(zi6Var.b, zi6Var.c, kk2Var.b);
        }
        int j = zi6Var.j();
        int i = this.b;
        int d = y6i0.d(i > 0 ? (j + i) - 1 : (j + i) - kk2Var.b.length(), 0, ((yi6) zi6Var.y).h());
        zi6Var.p(d, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnc)) {
            return false;
        }
        fnc fncVar = (fnc) obj;
        return jl40.l(this.a.b, fncVar.a.b) && this.b == fncVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return oyr.s(sb, this.b, ')');
    }

    public fnc(kk2 kk2Var, int i) {
        this.a = kk2Var;
        this.b = i;
    }
}
