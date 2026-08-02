package xsna;

/* compiled from: CoreTextFieldSemanticsModifier.kt */
/* loaded from: classes11.dex */
public final class muj extends d730<puj> {
    public final klp0 a;
    public final tho0 b;
    public final j1z c;
    public final boolean d;
    public final boolean e;
    public final uv70 f;
    public final gho0 g;
    public final rnw h;
    public final rwr i;

    public muj(klp0 klp0Var, tho0 tho0Var, j1z j1zVar, boolean z, boolean z2, uv70 uv70Var, gho0 gho0Var, rnw rnwVar, rwr rwrVar) {
        this.a = klp0Var;
        this.b = tho0Var;
        this.c = j1zVar;
        this.d = z;
        this.e = z2;
        this.f = uv70Var;
        this.g = gho0Var;
        this.h = rnwVar;
        this.i = rwrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muj)) {
            return false;
        }
        muj mujVar = (muj) obj;
        return epx.f(this.a, mujVar.a) && epx.f(this.b, mujVar.b) && epx.f(this.c, mujVar.c) && this.d == mujVar.d && this.e == mujVar.e && epx.f(this.f, mujVar.f) && epx.f(this.g, mujVar.g) && epx.f(this.h, mujVar.h) && epx.f(this.i, mujVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, false)) * 31)) * 31)) * 31);
    }

    @Override // xsna.d730
    public final puj r() {
        puj pujVar = new puj();
        pujVar.r = this.a;
        pujVar.s = this.b;
        pujVar.t = this.c;
        pujVar.u = this.d;
        pujVar.v = this.e;
        pujVar.w = this.f;
        gho0 gho0Var = this.g;
        pujVar.x = gho0Var;
        pujVar.y = this.h;
        pujVar.z = this.i;
        gho0Var.g = new b1j(pujVar, 2);
        return pujVar;
    }

    @Override // xsna.d730
    public final void s(puj pujVar) {
        puj pujVar2 = pujVar;
        boolean z = pujVar2.v;
        boolean z2 = false;
        boolean z3 = z && !pujVar2.u;
        rnw rnwVar = pujVar2.y;
        gho0 gho0Var = pujVar2.x;
        boolean z4 = this.d;
        boolean z5 = this.e;
        if (z5 && !z4) {
            z2 = true;
        }
        pujVar2.r = this.a;
        tho0 tho0Var = this.b;
        pujVar2.s = tho0Var;
        pujVar2.t = this.c;
        pujVar2.u = z4;
        pujVar2.v = z5;
        pujVar2.w = this.f;
        gho0 gho0Var2 = this.g;
        pujVar2.x = gho0Var2;
        rnw rnwVar2 = this.h;
        pujVar2.y = rnwVar2;
        pujVar2.z = this.i;
        if (z5 != z || z2 != z3 || !epx.f(rnwVar2, rnwVar) || !qko0.c(tho0Var.b)) {
            itl.f(pujVar2).R();
        }
        if (epx.f(gho0Var2, gho0Var)) {
            return;
        }
        gho0Var2.g = new z3i(pujVar2, 2);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.d + ", enabled=" + this.e + ", isPassword=false, offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
