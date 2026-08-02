package defpackage;

/* loaded from: classes12.dex */
public final class iow implements v7p {
    public final /* synthetic */ int a;
    public final nt0 b;

    public /* synthetic */ iow(nt0 nt0Var, int i) {
        this.a = i;
        this.b = nt0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        nt0 nt0Var = this.b;
        switch (i) {
            case 0:
                return new how(nt0Var, 0);
            case 1:
                return new how(nt0Var, 1);
            case 2:
                return new how(nt0Var, 2);
            case 3:
                return new how(nt0Var, 3);
            default:
                return new how(nt0Var, 4);
        }
    }
}
