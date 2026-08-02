package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class muv implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ixq0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ muv(ixq0 ixq0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = ixq0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        ixq0 ixq0Var = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new tuv(ixq0Var.c));
                tlsVar.invoke(new suv(ixq0Var.b));
                break;
            default:
                tlsVar.invoke(new tuv(ixq0Var.c));
                tlsVar.invoke(new suv(ixq0Var.b));
                break;
        }
        return zy11Var;
    }
}
