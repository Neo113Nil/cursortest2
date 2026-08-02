package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class fm5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ oz40 w;

    public /* synthetic */ fm5(tls tlsVar, oz40 oz40Var, oz40 oz40Var2, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = oz40Var;
        this.w = oz40Var2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.w;
        oz40 oz40Var2 = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    tlsVar.invoke(new nm5((String) oz40Var2.getValue()));
                    break;
                }
                break;
            case 1:
                oz40Var2.setValue(Boolean.TRUE);
                tlsVar.invoke(new im5((String) oz40Var.getValue()));
                break;
            default:
                tlsVar.invoke(new zzl0((String) oz40Var2.getValue()));
                if (evu0.k0((String) oz40Var2.getValue()).toString().length() == 0) {
                    oz40Var.setValue(Boolean.TRUE);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
