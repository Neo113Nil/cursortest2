package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class p2t0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ tls c;

    public /* synthetic */ p2t0(tls tlsVar, tls tlsVar2, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = tlsVar2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        tls tlsVar2 = this.b;
        switch (i) {
            case 0:
                tlsVar2.invoke(obj);
                tlsVar.invoke(obj);
                break;
            default:
                tlsVar2.invoke(obj);
                tlsVar.invoke(obj);
                break;
        }
        return zy11Var;
    }
}
