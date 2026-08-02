package defpackage;

/* loaded from: classes8.dex */
public final /* synthetic */ class e15 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f15 b;

    public /* synthetic */ e15(f15 f15Var, int i) {
        this.a = i;
        this.b = f15Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        f15 f15Var = this.b;
        switch (i) {
            case 0:
                return new dro(new e15(f15Var, 2));
            case 1:
                return new v0e(new e15(f15Var, 3));
            case 2:
                return f15Var.d;
            default:
                return f15Var.e;
        }
    }
}
