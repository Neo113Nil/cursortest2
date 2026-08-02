package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class neb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ at2 b;

    public /* synthetic */ neb(at2 at2Var, int i) {
        this.a = i;
        this.b = at2Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        at2 at2Var = this.b;
        switch (i) {
            case 0:
                return at2Var.b();
            case 1:
                return at2Var.Y();
            default:
                return at2Var.n();
        }
    }
}
