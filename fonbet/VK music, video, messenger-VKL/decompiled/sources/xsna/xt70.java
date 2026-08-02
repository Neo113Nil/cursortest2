package xsna;

import xsna.xup;

/* compiled from: OfflineErrorScenario.kt */
/* loaded from: classes8.dex */
public final class xt70 implements m5h0<yt70> {
    public final int a;
    public int b;
    public long c;

    public xt70(int i, long j) {
        this.a = i;
        this.c = j;
    }

    @Override // xsna.m5h0
    public final xup a(yt70 yt70Var, sht0 sht0Var) {
        int i = this.b;
        if (i >= this.a) {
            return new xup.i();
        }
        this.b = i + 1;
        long j = this.c;
        this.c = 2 * j;
        return new xup.h(j);
    }
}
