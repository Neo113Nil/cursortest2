package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class oq5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx40 b;

    public /* synthetic */ oq5(tx40 tx40Var, int i) {
        this.a = i;
        this.b = tx40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        tx40 tx40Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!(tx40Var.getFloatValue() == 0.0f));
            default:
                return Float.valueOf(tx40Var.getFloatValue());
        }
    }
}
