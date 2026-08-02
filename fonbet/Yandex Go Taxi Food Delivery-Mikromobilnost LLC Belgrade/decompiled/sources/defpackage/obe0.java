package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class obe0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss9 b;

    public /* synthetic */ obe0(ss9 ss9Var, int i) {
        this.a = i;
        this.b = ss9Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        sls slsVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ss9 ss9Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                lbe0 lbe0Var = (lbe0) ss9Var.K;
                mbe0 mbe0Var = (mbe0) ((agd) yfdVar).a;
                kjz kjzVar = lbe0Var.a;
                zuj0 zuj0Var = (zuj0) ((xvf0) kjzVar.b).get();
                cu1 cu1Var = (cu1) ((qy0) kjzVar.c).get();
                String str = mbe0Var.a;
                avj0 avj0Var = (avj0) zuj0Var;
                String h = avj0Var.h(kyh0.summary_porchnumber_input_hint);
                String h2 = avj0Var.h(kyh0.common_done);
                if (str == null) {
                    str = "";
                }
                agd agdVar = (agd) yfdVar;
                agdVar.c = new g92(2, new kbe0(h, h2, str, ((Boolean) cu1Var.a.b()).booleanValue()));
                agdVar.e = new obe0(ss9Var, 1);
                agdVar.f = xpb1.x;
                lad.a.getClass();
                agdVar.g = lad.b;
                return zy11Var;
            default:
                gbe0 gbe0Var = (gbe0) obj;
                hbe0 hbe0Var = (hbe0) ss9Var.J;
                v5c0 v5c0Var = (v5c0) ss9Var.L;
                hbe0Var.getClass();
                if (gbe0Var instanceof dbe0) {
                    ((ss9) v5c0Var.b).r(new qu(9));
                    return zy11Var;
                }
                if (gbe0Var instanceof ebe0) {
                    ((ss9) v5c0Var.b).r(new dcc0(((ebe0) gbe0Var).a, 6));
                    return zy11Var;
                }
                if (!(gbe0Var instanceof fbe0)) {
                    w511.b();
                    return null;
                }
                mbe0 mbe0Var2 = (mbe0) ((ss9) v5c0Var.b).x;
                if (mbe0Var2 == null || (slsVar = mbe0Var2.c) == null) {
                    return zy11Var;
                }
                slsVar.invoke();
                return zy11Var;
        }
    }
}
