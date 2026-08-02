package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class ef implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dne0 b;

    public /* synthetic */ ef(dne0 dne0Var, int i) {
        this.a = i;
        this.b = dne0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        dne0 dne0Var = this.b;
        switch (i) {
            case 0:
                return dne0Var.a("acceptance_payment_storage");
            default:
                return dne0Var.a("summary.requirements.list.repository.SpecialNeedsConfigRepository");
        }
    }
}
