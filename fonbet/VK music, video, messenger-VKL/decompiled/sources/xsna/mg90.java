package xsna;

/* compiled from: PainterModifier.kt */
/* loaded from: classes11.dex */
final class mg90 extends d730<og90> {
    public final lg90 a;
    public final boolean b = true;
    public final dt1 c;
    public final wkj d;
    public final float e;
    public final d6g f;

    public mg90(lg90 lg90Var, dt1 dt1Var, wkj wkjVar, float f, d6g d6gVar) {
        this.a = lg90Var;
        this.c = dt1Var;
        this.d = wkjVar;
        this.e = f;
        this.f = d6gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg90)) {
            return false;
        }
        mg90 mg90Var = (mg90) obj;
        return epx.f(this.a, mg90Var.a) && this.b == mg90Var.b && epx.f(this.c, mg90Var.c) && epx.f(this.d, mg90Var.d) && Float.compare(this.e, mg90Var.e) == 0 && epx.f(this.f, mg90Var.f);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31);
        d6g d6gVar = this.f;
        return a + (d6gVar == null ? 0 : d6gVar.hashCode());
    }

    @Override // xsna.d730
    public final og90 r() {
        og90 og90Var = new og90();
        og90Var.p = this.a;
        og90Var.q = this.b;
        og90Var.r = this.c;
        og90Var.s = this.d;
        og90Var.t = this.e;
        og90Var.u = this.f;
        return og90Var;
    }

    @Override // xsna.d730
    public final void s(og90 og90Var) {
        og90 og90Var2 = og90Var;
        boolean z = og90Var2.q;
        lg90 lg90Var = this.a;
        boolean z2 = this.b;
        boolean z3 = z != z2 || (z2 && !mxj0.b(og90Var2.p.i(), lg90Var.i()));
        og90Var2.p = lg90Var;
        og90Var2.q = z2;
        og90Var2.r = this.c;
        og90Var2.s = this.d;
        og90Var2.t = this.e;
        og90Var2.u = this.f;
        if (z3) {
            itl.f(og90Var2).Q();
        }
        mio.a(og90Var2);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }
}
