package xsna;

/* compiled from: HttpUrlChainCall.kt */
/* loaded from: classes15.dex */
public final class ukv<T> extends ara<T> {
    public final mkx b;
    public final tkv c;
    public final k7r0<T> d;
    public final long e;

    public ukv(wy2 wy2Var, mkx mkxVar, tkv tkvVar, k7r0 k7r0Var, long j) {
        super(wy2Var);
        this.b = mkxVar;
        this.c = tkvVar;
        this.d = k7r0Var;
        this.e = j;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        wx0 wx0Var = new wx0(10, this, zqaVar);
        String str = "http_url";
        boolean z = false;
        int[] iArr = null;
        per0 e = this.d.e(new qrj0(new wg9(new hn9(13, this, zqaVar), 4), new iej(5), new jom0(str, z, iArr)), new qrj0(new yg9(wx0Var, 8), new kom0(str, z, iArr), new prj0()));
        if (e != null) {
            return (T) e.a();
        }
        return null;
    }
}
