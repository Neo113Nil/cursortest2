package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class lk30 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ ll30 c;

    public /* synthetic */ lk30(tls tlsVar, ll30 ll30Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = ll30Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ll30 ll30Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new gl30(ll30Var));
                break;
            case 1:
                tlsVar.invoke(new dl30(ll30Var));
                break;
            case 2:
                tlsVar.invoke(new dl30(ll30Var));
                break;
            default:
                tlsVar.invoke(new dl30(ll30Var));
                break;
        }
        return zy11Var;
    }
}
