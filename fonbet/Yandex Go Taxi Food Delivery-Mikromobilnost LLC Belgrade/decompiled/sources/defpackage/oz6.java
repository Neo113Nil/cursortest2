package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class oz6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ int c;

    public /* synthetic */ oz6(int i, int i2, tls tlsVar) {
        this.a = i2;
        this.b = tlsVar;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(Integer.valueOf(i2 - 1));
                break;
            case 1:
                tlsVar.invoke(Integer.valueOf(i2 + 1));
                break;
            case 2:
                tlsVar.invoke(new f3l0(i2));
                break;
            default:
                tlsVar.invoke(new d3l0(i2));
                break;
        }
        return zy11Var;
    }
}
