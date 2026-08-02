package xsna;

import xsna.xup;

/* compiled from: HlsPlayListStuckErrorScenario.kt */
/* loaded from: classes8.dex */
public final class n9v implements m5h0<ggk0> {
    public final int a;
    public final long b;
    public int c;

    public n9v(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // xsna.m5h0
    public final xup a(ggk0 ggk0Var, sht0 sht0Var) {
        int i = this.c;
        if (i >= this.a) {
            return new xup.i();
        }
        this.c = i + 1;
        return new xup.g(this.b);
    }
}
