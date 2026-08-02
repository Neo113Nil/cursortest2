package defpackage;

/* loaded from: classes12.dex */
public final class izw implements v7p {
    public final /* synthetic */ int a;
    public final nb11 b;

    public /* synthetic */ izw(nb11 nb11Var, int i) {
        this.a = i;
        this.b = nb11Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        nb11 nb11Var = this.b;
        switch (i) {
            case 0:
                return new hzw((dz31) nb11Var.get());
            default:
                return new my31((dz31) nb11Var.get());
        }
    }
}
