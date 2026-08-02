package defpackage;

/* loaded from: classes12.dex */
public final class m3a implements g60 {
    public final /* synthetic */ int a = 1;
    public final pep0 b;
    public final yvf0 c;

    public m3a(yvf0 yvf0Var, pep0 pep0Var) {
        this.c = yvf0Var;
        this.b = pep0Var;
    }

    @Override // defpackage.g60
    public final void a(m950 m950Var, Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yvf0 yvf0Var = this.c;
        pep0 pep0Var = this.b;
        switch (i) {
            case 0:
                pep0Var.c((qa00) yvf0Var.get(), zy11Var, new l3a(m950Var, obj, 0));
                break;
            default:
                if (!(m950Var instanceof lwk0)) {
                    b();
                    pep0Var.g(m950Var, obj, sy60.Q2, hxx.a);
                    break;
                } else {
                    pep0Var.c((qa00) yvf0Var.get(), zy11Var, new l3a(m950Var, obj, 6));
                    break;
                }
        }
    }

    @Override // defpackage.g60
    public final void b() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yvf0 yvf0Var = this.c;
        pep0 pep0Var = this.b;
        switch (i) {
            case 0:
                pep0Var.e((qa00) yvf0Var.get(), zy11Var);
                break;
            default:
                pep0Var.e((qa00) yvf0Var.get(), zy11Var);
                break;
        }
    }

    public m3a(pep0 pep0Var, yvf0 yvf0Var) {
        this.b = pep0Var;
        this.c = yvf0Var;
    }
}
