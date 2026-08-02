package defpackage;

/* loaded from: classes3.dex */
public final class dsl implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final br00 c;

    public /* synthetic */ dsl(xvf0 xvf0Var, br00 br00Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = br00Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        br00 br00Var = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new csl((jsl) xvf0Var.get(), br00Var.a);
            case 1:
                return new kbo((xcp0) xvf0Var.get(), br00Var.a);
            case 2:
                return new gly((zcp0) xvf0Var.get(), br00Var.a);
            case 3:
                return new p400((pc00) xvf0Var.get(), br00Var.a);
            case 4:
                return new aab0((ocb0) xvf0Var.get(), br00Var.a);
            case 5:
                return new hhm0((jhm0) xvf0Var.get(), br00Var.a);
            case 6:
                return new gtt0((sut0) xvf0Var.get(), br00Var.a);
            default:
                return new b9u0((e9u0) xvf0Var.get(), br00Var.a);
        }
    }
}
