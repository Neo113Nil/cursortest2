package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class mg6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ og6 b;

    public /* synthetic */ mg6(og6 og6Var, int i) {
        this.a = i;
        this.b = og6Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        og6 og6Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(og6Var.j);
            default:
                c06 c06Var = og6Var.k;
                sls slsVar = (p61) c06Var.b;
                if (slsVar == null) {
                    slsVar = (l95) c06Var.a;
                }
                c06Var.b = null;
                slsVar.invoke();
                return zy11.a;
        }
    }
}
