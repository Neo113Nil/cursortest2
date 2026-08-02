package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mhj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf4 b;

    public /* synthetic */ mhj(nf4 nf4Var, int i) {
        this.a = i;
        this.b = nf4Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        nf4 nf4Var = this.b;
        switch (i) {
            case 0:
                return nf4Var.b();
            case 1:
                return nf4Var.b();
            default:
                return nf4Var.a();
        }
    }
}
