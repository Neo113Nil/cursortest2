package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class dn30 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ dn30(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = new g92(2, zy11Var);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new dn30(tVar, 1);
                c9d.a.getClass();
                agdVar.g = c9d.b;
                break;
            default:
                if (jl40.l((cn30) obj, cn30.a)) {
                    tVar.r(new qu(9));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
