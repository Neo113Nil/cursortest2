package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class cjk0 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ djk0 b;
    public final /* synthetic */ wrs0 c;

    public /* synthetic */ cjk0(djk0 djk0Var, wrs0 wrs0Var, int i) {
        this.a = i;
        this.b = djk0Var;
        this.c = wrs0Var;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        wrs0 wrs0Var = this.c;
        djk0 djk0Var = this.b;
        switch (i) {
            case 0:
                ibk0 a = ijk0.a(nqs0Var);
                if (a != null) {
                    djk0Var.b.a(a, wrs0Var);
                    break;
                }
                break;
            default:
                ibk0 a2 = ijk0.a(nqs0Var);
                if (a2 != null) {
                    djk0Var.b.a(a2, wrs0Var);
                    break;
                }
                break;
        }
    }
}
