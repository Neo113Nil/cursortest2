package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class pfj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ kfj c;

    public /* synthetic */ pfj(tls tlsVar, kfj kfjVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = kfjVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        kfj kfjVar = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(kfjVar.d);
                return zy11.a;
            default:
                tlsVar.invoke(kfjVar.d);
                return Boolean.TRUE;
        }
    }
}
