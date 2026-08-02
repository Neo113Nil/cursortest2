package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class m841 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n841 b;

    public /* synthetic */ m841(n841 n841Var, int i) {
        this.a = i;
        this.b = n841Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        n841 n841Var = this.b;
        switch (i) {
            case 0:
                return n841Var.getLifecycle().w;
            default:
                n841Var.r(new qu(9));
                return zy11.a;
        }
    }
}
