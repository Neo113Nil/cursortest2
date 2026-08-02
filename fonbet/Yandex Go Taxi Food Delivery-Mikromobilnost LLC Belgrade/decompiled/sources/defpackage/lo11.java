package defpackage;

/* loaded from: classes5.dex */
public final class lo11 implements zid0 {
    public final jo11 a;
    public final /* synthetic */ oo11 b;

    public lo11(oo11 oo11Var, jo11 jo11Var) {
        this.b = oo11Var;
        this.a = jo11Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        jo11 jo11Var = this.a;
        int i = ko11.a[jo11Var.a.ordinal()];
        oo11 oo11Var = this.b;
        if (i == 1) {
            oo11Var.Q(jo11Var);
        } else if (i == 2) {
            oo11Var.P(jo11Var);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.zid0
    public final void t0(boolean z) {
        jo11 jo11Var = this.a;
        int i = ko11.a[jo11Var.a.ordinal()];
        oo11 oo11Var = this.b;
        if (i == 1) {
            oo11Var.Q(jo11Var);
        } else if (i == 2) {
            oo11Var.P(jo11Var);
        } else {
            w511.b();
        }
    }
}
