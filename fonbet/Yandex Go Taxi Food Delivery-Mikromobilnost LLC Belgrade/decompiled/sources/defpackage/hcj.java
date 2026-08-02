package defpackage;

/* loaded from: classes8.dex */
public final /* synthetic */ class hcj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt90 b;

    public /* synthetic */ hcj(bt90 bt90Var, icj icjVar) {
        this.a = 1;
        this.b = bt90Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        bt90 bt90Var = this.b;
        switch (i) {
            case 0:
                return new yqx0(bt90Var);
            case 1:
                return new uqx0(bt90Var, sbx.d);
            case 2:
                return new y1v0(bt90Var);
            default:
                return new sr50(bt90Var);
        }
    }

    public /* synthetic */ hcj(bt90 bt90Var, int i) {
        this.a = i;
        this.b = bt90Var;
    }
}
