package defpackage;

/* loaded from: classes4.dex */
public final class q2 extends b3 {
    public static final p1 b = new p1(12, q2.class);
    public final vpf a;

    public q2(vpf vpfVar) {
        this.a = vpfVar;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return ~rza1.e(this.a.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof q2) {
            return this.a.m(((q2) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(7, z);
        ryhVar.I(25, this.a.a, false);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return this.a.p(z);
    }

    @Override // defpackage.b3
    public final b3 s() {
        this.a.getClass();
        return this;
    }

    @Override // defpackage.b3
    public final b3 t() {
        this.a.getClass();
        return this;
    }
}
