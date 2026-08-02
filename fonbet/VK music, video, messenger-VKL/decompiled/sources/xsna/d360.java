package xsna;

import xsna.xup;

/* compiled from: NetworkErrorScenario.kt */
/* loaded from: classes8.dex */
public final class d360 implements m5h0<igk0> {
    public final xds0 a;
    public final int b;
    public int c;

    public d360(xds0 xds0Var, int i) {
        this.a = xds0Var;
        this.b = i;
    }

    @Override // xsna.m5h0
    public final xup a(igk0 igk0Var, sht0 sht0Var) {
        String str;
        int i = this.c;
        if (i < this.b) {
            this.c = i + 1;
            return new xup.g();
        }
        xup.a aVar = null;
        if (sht0Var != null && (str = this.a.b) != null && !epx.f(sht0Var.b.getHost(), str)) {
            aVar = new xup.a(str, sht0Var.d(str));
        }
        return aVar != null ? aVar : new xup.i();
    }
}
