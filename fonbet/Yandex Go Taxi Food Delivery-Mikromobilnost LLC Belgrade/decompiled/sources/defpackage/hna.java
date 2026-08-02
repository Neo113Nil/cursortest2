package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class hna implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ cne0 b;

    public /* synthetic */ hna(cne0 cne0Var, int i) {
        this.a = i;
        this.b = cne0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        cne0 cne0Var = this.b;
        tls tlsVar = (tls) obj;
        switch (i) {
            case 0:
                return new ina(cne0Var.o(new dv9(18, tlsVar), "polling_execution_ids"), 0);
            case 1:
                return new ina(cne0Var.o(new adp(7, tlsVar), "launch_actual"), 1);
            default:
                return new ina(cne0Var.o(new uwl0(i2, tlsVar), "polling_execution_ids"), 3);
        }
    }
}
