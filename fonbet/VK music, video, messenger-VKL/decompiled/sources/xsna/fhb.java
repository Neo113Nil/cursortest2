package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fhb implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ hhb c;

    public /* synthetic */ fhb(long j, hhb hhbVar) {
        this.b = j;
        this.c = hhbVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        xgl0 xgl0Var = (xgl0) obj;
        xgl0 I0 = this.c.a.I0();
        uib a = I0.a();
        long j = this.b;
        int r = ad0.B(a.B(j)) ? I0.system().r(j) : I0.system().j();
        Integer p = xgl0Var.a().p(j);
        return Boolean.valueOf(p != null && p.intValue() == r);
    }
}
