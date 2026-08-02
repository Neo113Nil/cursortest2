package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class mzw0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ mzw0(t tVar, int i) {
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
                String str = ((nzw0) ((agd) yfdVar).a).a;
                agd agdVar = (agd) yfdVar;
                nzw0 nzw0Var = (nzw0) agdVar.a;
                agdVar.c = new g92(2, new rzw0(str, nzw0Var.b, nzw0Var.c, nzw0Var.d));
                agdVar.e = new mzw0(tVar, 1);
                zdd.a.getClass();
                agdVar.g = zdd.b;
                return zy11Var;
            default:
                qzw0 qzw0Var = (qzw0) obj;
                int i2 = 9;
                if (jl40.l(qzw0Var, ozw0.a)) {
                    tVar.r(new qu(i2));
                    return zy11Var;
                }
                if (jl40.l(qzw0Var, pzw0.a)) {
                    tVar.r(new qu(i2));
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
