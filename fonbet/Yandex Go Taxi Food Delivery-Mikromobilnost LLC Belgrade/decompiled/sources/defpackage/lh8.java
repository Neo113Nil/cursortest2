package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class lh8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh8 b;
    public final /* synthetic */ hg8 c;

    public /* synthetic */ lh8(nh8 nh8Var, hg8 hg8Var, int i) {
        this.a = i;
        this.b = nh8Var;
        this.c = hg8Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hg8 hg8Var = this.c;
        nh8 nh8Var = this.b;
        switch (i) {
            case 0:
                foz0 foz0Var = (foz0) obj;
                ((ymu) nh8Var.b).H(hg8Var.a.a, foz0Var.b);
                yh5 yh5Var = nh8Var.b;
                xg8 xg8Var = hg8Var.a;
                ((ymu) yh5Var).H(xg8Var.b, foz0Var.c);
                jlk jlkVar = nh8Var.k;
                if (jlkVar != null) {
                    ((yzh) jlkVar).n(xg8Var.e);
                    break;
                }
                break;
            default:
                jlk jlkVar2 = nh8Var.k;
                if (jlkVar2 != null) {
                    ((yzh) jlkVar2).n(hg8Var.a.f);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
