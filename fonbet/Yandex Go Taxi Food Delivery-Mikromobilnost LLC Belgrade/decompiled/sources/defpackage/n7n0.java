package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class n7n0 implements bvo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7n0 b;

    public /* synthetic */ n7n0(o7n0 o7n0Var, int i) {
        this.a = i;
        this.b = o7n0Var;
    }

    @Override // defpackage.bvo0
    public final void a(boolean z) {
        int i = this.a;
        o7n0 o7n0Var = this.b;
        switch (i) {
            case 0:
                o7n0Var.d = z;
                o7n0Var.a();
                break;
            default:
                o7n0Var.c = z;
                o7n0Var.a();
                break;
        }
    }
}
