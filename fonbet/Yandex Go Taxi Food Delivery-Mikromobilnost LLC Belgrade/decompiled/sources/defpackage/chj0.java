package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class chj0 implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ lhj0 w;

    public /* synthetic */ chj0(tls tlsVar, lhj0 lhj0Var, oz40 oz40Var) {
        this.c = tlsVar;
        this.w = lhj0Var;
        this.b = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        lhj0 lhj0Var = this.w;
        tls tlsVar = this.c;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new ihj0(lhj0Var));
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                break;
            default:
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                tlsVar.invoke(new hhj0(lhj0Var));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ chj0(oz40 oz40Var, tls tlsVar, lhj0 lhj0Var) {
        this.b = oz40Var;
        this.c = tlsVar;
        this.w = lhj0Var;
    }
}
