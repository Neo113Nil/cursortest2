package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class c0s implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ t0s c;

    public /* synthetic */ c0s(tls tlsVar, t0s t0sVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = t0sVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        t0s t0sVar = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(t0sVar);
                return zy11.a;
            default:
                tlsVar.invoke(t0sVar);
                return Boolean.TRUE;
        }
    }
}
