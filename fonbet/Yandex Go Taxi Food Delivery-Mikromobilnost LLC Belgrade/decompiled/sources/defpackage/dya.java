package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class dya implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tls b;
    public final /* synthetic */ wwa c;

    public /* synthetic */ dya(wwa wwaVar, tls tlsVar) {
        this.c = wwaVar;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wwa wwaVar = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                vwa vwaVar = wwaVar.f;
                if (vwaVar != null) {
                    tlsVar.invoke(vwaVar);
                    break;
                }
                break;
            default:
                Object obj = wwaVar.e;
                if (obj == null) {
                    obj = tj9.a;
                }
                tlsVar.invoke(obj);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ dya(tls tlsVar, wwa wwaVar) {
        this.b = tlsVar;
        this.c = wwaVar;
    }
}
