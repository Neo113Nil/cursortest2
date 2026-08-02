package xsna;

/* compiled from: OtelChainCall.kt */
/* loaded from: classes15.dex */
public final class vz80<T> extends ara<T> {
    public final wdp0 b;
    public final String c;
    public final String d;
    public final ara<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public vz80(wdp0 wdp0Var, l7r0 l7r0Var, String str, String str2, ara<? extends T> araVar) {
        super(l7r0Var);
        this.b = wdp0Var;
        this.c = str;
        this.d = str2;
        this.e = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        Object i;
        String concat = "ChainCall ".concat(this.c);
        i = vhk0.i(this.b, concat, (r5 & 2) == 0, new xdf(2), new p83(this, concat, zqaVar, 5));
        return (T) i;
    }
}
