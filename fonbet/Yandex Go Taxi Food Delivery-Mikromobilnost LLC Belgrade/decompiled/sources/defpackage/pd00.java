package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class pd00 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd00 b;

    public /* synthetic */ pd00(rd00 rd00Var, int i) {
        this.a = i;
        this.b = rd00Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        rd00 rd00Var = this.b;
        switch (i) {
            case 0:
                return (nvy0) rd00Var.b.B.invoke(rd00Var.a.requireActivity());
            default:
                heb hebVar = rd00Var.F;
                if (hebVar != null) {
                    hebVar.j(deb.b);
                    bw41 bw41Var = hebVar.Q;
                    bw41Var.b();
                    bw41Var.d.postDelayed(new zv41(bw41Var, 0), 500L);
                }
                return zy11.a;
        }
    }
}
