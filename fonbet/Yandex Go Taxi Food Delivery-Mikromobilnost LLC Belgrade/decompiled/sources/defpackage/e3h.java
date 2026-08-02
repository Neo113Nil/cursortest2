package defpackage;

/* loaded from: classes12.dex */
public final class e3h implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ e3h(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                zsa zsaVar = (zsa) h55Var;
                zsaVar.r(new qu(9));
                ((ybf) zsaVar.F).invoke();
                break;
            default:
                ((y4c0) h55Var).r(new qu(9));
                break;
        }
    }

    public final void n1(pv0 pv0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                zsa zsaVar = (zsa) h55Var;
                zsaVar.r(new qu(9));
                ((dye) zsaVar.G).invoke(pv0Var);
                break;
            default:
                ((y4c0) h55Var).r(new t71(pv0Var, 15));
                break;
        }
    }
}
