package xsna;

import xsna.zjv;

/* compiled from: OtelHttpInterceptor.kt */
/* loaded from: classes2.dex */
public final class lz80 implements ojv {
    public final wdp0 a;
    public final String b;
    public final ojv c;

    public lz80(wdp0 wdp0Var, String str, ojv ojvVar) {
        this.a = wdp0Var;
        this.b = str;
        this.c = ojvVar;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        Object i;
        String str = this.b;
        if (str == null) {
            str = this.c.getClass().getSimpleName();
        }
        i = vhk0.i(this.a, "HTTP Interceptor ".concat(str), (r5 & 2) == 0, new xdf(2), new qb6(21, this, aVar));
        return (mkv) i;
    }
}
