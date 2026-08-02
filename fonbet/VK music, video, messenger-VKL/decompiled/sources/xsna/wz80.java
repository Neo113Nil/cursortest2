package xsna;

/* compiled from: OtelChainCall.kt */
/* loaded from: classes15.dex */
public final class wz80<T> extends bkv<T> {
    public final wdp0 f;
    public final skx g;

    public wz80(wdp0 wdp0Var, skx skxVar) {
        super(skxVar.a, skxVar.b, skxVar.c, skxVar.d, skxVar.e);
        this.f = wdp0Var;
        this.g = skxVar;
    }

    @Override // xsna.bkv, xsna.ara
    public final T a(zqa zqaVar) {
        Object i;
        i = vhk0.i(this.f, "ChainCall ".concat("HttpPost"), (r5 & 2) == 0, new xdf(2), new a5(16, this, zqaVar));
        return (T) i;
    }
}
