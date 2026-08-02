package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class nq5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ sls c;

    public /* synthetic */ nq5(sls slsVar, oz40 oz40Var) {
        this.a = 2;
        this.c = slsVar;
        this.b = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 1:
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 2:
                oz40Var.setValue(Boolean.FALSE);
                slsVar.invoke();
                break;
            default:
                oz40Var.setValue(Boolean.TRUE);
                slsVar.invoke();
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ nq5(int i, sls slsVar, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
        this.c = slsVar;
    }
}
