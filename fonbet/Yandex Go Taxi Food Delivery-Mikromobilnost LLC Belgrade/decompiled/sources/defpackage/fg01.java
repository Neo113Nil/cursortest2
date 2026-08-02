package defpackage;

/* loaded from: classes3.dex */
public final class fg01 implements v7p {
    public final /* synthetic */ int a;
    public final eg01 b;

    public /* synthetic */ fg01(eg01 eg01Var, int i) {
        this.a = i;
        this.b = eg01Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        eg01 eg01Var = this.b;
        switch (i) {
            case 0:
                return new c1x0(((h9g) ((tw51) eg01Var.a)).E);
            case 1:
                return new wf01(((h9g) ((tw51) eg01Var.a)).u());
            case 2:
                return ((h9g) ((tw51) eg01Var.a)).y();
            default:
                h9g h9gVar = (h9g) ((tw51) eg01Var.a);
                return new xf01((j3h) h9gVar.E.get(), (np41) h9gVar.M.get());
        }
    }
}
