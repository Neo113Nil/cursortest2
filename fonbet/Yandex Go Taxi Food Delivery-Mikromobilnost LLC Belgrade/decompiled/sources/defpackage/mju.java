package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class mju implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oju b;

    public /* synthetic */ mju(oju ojuVar, int i) {
        this.a = i;
        this.b = ojuVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oju ojuVar = this.b;
        switch (i) {
            case 0:
                ojuVar.l0.useDefaultIcon();
                break;
            default:
                qke.v(ojuVar.a.getContext());
                ojuVar.n0.b();
                break;
        }
        return zy11Var;
    }
}
