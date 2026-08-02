package xsna;

/* compiled from: Border.kt */
/* loaded from: classes11.dex */
public final class v18 extends d730<u18> {
    public final float a;
    public final yk8 b;
    public final r5j0 c;

    public v18(float f, yk8 yk8Var, r5j0 r5j0Var) {
        this.a = f;
        this.b = yk8Var;
        this.c = r5j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v18)) {
            return false;
        }
        v18 v18Var = (v18) obj;
        return pco.b(this.a, v18Var.a) && epx.f(this.b, v18Var.b) && epx.f(this.c, v18Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    @Override // xsna.d730
    public final u18 r() {
        return new u18(this.a, this.b, this.c);
    }

    @Override // xsna.d730
    public final void s(u18 u18Var) {
        u18 u18Var2 = u18Var;
        float f = u18Var2.s;
        hw8 hw8Var = u18Var2.v;
        float f2 = this.a;
        if (!pco.b(f, f2)) {
            u18Var2.s = f2;
            hw8Var.A0();
        }
        yk8 yk8Var = u18Var2.t;
        yk8 yk8Var2 = this.b;
        if (!epx.f(yk8Var, yk8Var2)) {
            u18Var2.t = yk8Var2;
            hw8Var.A0();
        }
        r5j0 r5j0Var = u18Var2.u;
        r5j0 r5j0Var2 = this.c;
        if (epx.f(r5j0Var, r5j0Var2)) {
            return;
        }
        u18Var2.u = r5j0Var2;
        hw8Var.A0();
        itl.f(u18Var2).R();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        oq.f(this.a, ", brush=", sb);
        sb.append(this.b);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
