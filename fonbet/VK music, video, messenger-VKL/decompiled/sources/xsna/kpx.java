package xsna;

import xsna.xup;

/* compiled from: InvalidHttpCodeErrorScenario.kt */
/* loaded from: classes8.dex */
public final class kpx implements m5h0<hgk0> {
    public final xds0 a;

    public kpx(xds0 xds0Var) {
        this.a = xds0Var;
    }

    @Override // xsna.m5h0
    public final xup a(hgk0 hgk0Var, sht0 sht0Var) {
        String str;
        if (hgk0Var.b) {
            return new xup.f();
        }
        xup.a aVar = null;
        if (sht0Var != null && (str = this.a.b) != null && !epx.f(sht0Var.b.getHost(), str)) {
            aVar = new xup.a(str, sht0Var.d(str));
        }
        return aVar != null ? aVar : new xup.i();
    }
}
