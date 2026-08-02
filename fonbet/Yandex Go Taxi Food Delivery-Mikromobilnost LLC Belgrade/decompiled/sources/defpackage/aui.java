package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class aui implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf41 b;

    public /* synthetic */ aui(gf41 gf41Var, int i) {
        this.a = i;
        this.b = gf41Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        gf41 gf41Var = this.b;
        switch (i) {
            case 0:
                return gf41Var.a().b();
            default:
                return gf41Var.a();
        }
    }
}
