package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class ji40 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ na11 c;

    public /* synthetic */ ji40(tls tlsVar, na11 na11Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = na11Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        na11 na11Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new li40(na11Var));
                break;
            default:
                tlsVar.invoke(new ni40(na11Var));
                break;
        }
        return zy11Var;
    }
}
