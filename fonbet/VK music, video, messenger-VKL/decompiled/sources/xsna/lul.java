package xsna;

/* compiled from: VKRipple.kt */
/* loaded from: classes17.dex */
public final class lul implements o7g {
    public final /* synthetic */ oul b;

    public lul(oul oulVar) {
        this.b = oulVar;
    }

    @Override // xsna.o7g
    public final long a() {
        iyk0 iyk0Var = qer0.a;
        oul oulVar = this.b;
        if (((Boolean) ovi.a(oulVar, iyk0Var)).booleanValue()) {
            return l5g.k;
        }
        long a = oulVar.u.a();
        if (a != 16) {
            return a;
        }
        clg0 clg0Var = (clg0) ovi.a(oulVar, jlg0.a);
        if (clg0Var != null) {
            long j = clg0Var.a;
            if (j != 16) {
                return j;
            }
        }
        long j2 = ((l5g) ovi.a(oulVar, yfj.a)).a;
        return (((ylu0) ovi.a(oulVar, rrv0.a)).s() || ((double) (l5g.e(j2) * f870.E(j2))) >= 0.25d) ? l5g.b : l5g.d;
    }
}
