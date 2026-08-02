package xsna;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public final class mul implements o7g {
    public final /* synthetic */ pul b;

    public mul(pul pulVar) {
        this.b = pulVar;
    }

    @Override // xsna.o7g
    public final long a() {
        pul pulVar = this.b;
        long a = pulVar.u.a();
        if (a != 16) {
            return a;
        }
        clg0 clg0Var = (clg0) ovi.a(pulVar, jlg0.a);
        if (clg0Var != null) {
            long j = clg0Var.a;
            if (j != 16) {
                return j;
            }
        }
        long j2 = ((l5g) ovi.a(pulVar, yfj.a)).a;
        return (((k9g) ovi.a(pulVar, l9g.a)).d() || ((double) f870.E(j2)) >= 0.5d) ? j2 : l5g.d;
    }
}
