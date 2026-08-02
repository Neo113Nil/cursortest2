package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class k1k implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1k b;

    public /* synthetic */ k1k(e1k e1kVar, int i) {
        this.a = i;
        this.b = e1kVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e1k e1kVar = this.b;
        switch (i) {
            case 0:
                e1kVar.close();
                break;
            default:
                if (e1kVar != null) {
                    e1kVar.close();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
