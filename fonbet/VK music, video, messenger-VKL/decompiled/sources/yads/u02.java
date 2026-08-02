package yads;

import android.os.SystemClock;
import android.view.View;
import xsna.myc0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class u02 implements View.OnClickListener {
    public final oi a;
    public final y3 b;
    public final m22 c;
    public final lo2 d;
    public final jg1 e;
    public final kx0 f;
    public final yvj g;

    public u02(kx0 kx0Var, lo2 lo2Var, y3 y3Var, m22 m22Var, oi oiVar, jg1 jg1Var) {
        yvj b;
        this.a = oiVar;
        this.b = y3Var;
        this.c = m22Var;
        this.d = lo2Var;
        this.e = jg1Var;
        this.f = kx0Var;
        b = z10.b(null);
        this.g = b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        Long l = this.d.a;
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = 0;
        }
        jg1 jg1Var = this.e;
        if (jg1Var == null || j < jg1Var.e || !this.a.e) {
            return;
        }
        myc0.h(this.g, null, null, new t02(this, view, null), 3);
    }
}
