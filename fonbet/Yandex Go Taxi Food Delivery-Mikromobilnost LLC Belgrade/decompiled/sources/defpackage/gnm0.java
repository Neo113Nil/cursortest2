package defpackage;

/* loaded from: classes6.dex */
public final class gnm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ bb01 c;

    public /* synthetic */ gnm0(tls tlsVar, bb01 bb01Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = bb01Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bb01 bb01Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new gb01(bb01Var));
                break;
            default:
                tlsVar.invoke(new fb01(bb01Var));
                break;
        }
        return zy11Var;
    }
}
