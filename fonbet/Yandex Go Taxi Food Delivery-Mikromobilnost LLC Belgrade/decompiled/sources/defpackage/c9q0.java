package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class c9q0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jls b;

    public /* synthetic */ c9q0(jls jlsVar, int i) {
        this.a = i;
        this.b = jlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jls jlsVar = this.b;
        switch (i) {
            case 0:
                jlsVar.f.invoke();
                break;
            default:
                sls slsVar = jlsVar.d;
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
