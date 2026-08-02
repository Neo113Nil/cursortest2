package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class mij0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ jkj0 c;
    public final /* synthetic */ fgd w;

    public /* synthetic */ mij0(tls tlsVar, jkj0 jkj0Var, fgd fgdVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = jkj0Var;
        this.w = fgdVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        fgd fgdVar = this.w;
        jkj0 jkj0Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                flj0 flj0Var = jkj0Var.d;
                tlsVar.invoke(flj0Var);
                fgdVar.a(flj0Var.b);
                return zy11.a;
            default:
                flj0 flj0Var2 = jkj0Var.d;
                tlsVar.invoke(flj0Var2);
                fgdVar.a(flj0Var2.b);
                return Boolean.TRUE;
        }
    }
}
