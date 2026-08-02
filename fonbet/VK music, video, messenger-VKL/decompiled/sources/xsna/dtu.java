package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: SelectionHandles.kt */
/* loaded from: classes11.dex */
public final class dtu implements fxb0 {
    public final dt1 b;
    public final wv70 c;
    public long d = 0;

    public dtu(dt1 dt1Var, wv70 wv70Var) {
        this.b = dt1Var;
        this.c = wv70Var;
    }

    @Override // xsna.fxb0
    public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        long a = this.c.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.d;
        }
        this.d = a;
        return h9x.d(h9x.d(l9xVar.c(), n34.A(a)), this.b.a(j2, 0L, layoutDirection));
    }
}
