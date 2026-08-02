package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class d4b0 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w7b0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ d4b0(tls tlsVar, w7b0 w7b0Var) {
        this.c = tlsVar;
        this.b = w7b0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        w7b0 w7b0Var = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(w7b0Var.h);
                break;
            default:
                if (w7b0Var != null) {
                    tlsVar.invoke(new o4b0(w7b0Var));
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ d4b0(w7b0 w7b0Var, tls tlsVar) {
        this.b = w7b0Var;
        this.c = tlsVar;
    }
}
