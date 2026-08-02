package xsna;

import android.graphics.Shader;

/* compiled from: Brush.kt */
/* loaded from: classes11.dex */
public abstract class n4j0 extends yk8 {
    public hkp b;
    public long c = 9205357640488583168L;

    @Override // xsna.yk8
    public final void a(float f, long j, fg90 fg90Var) {
        hkp hkpVar = this.b;
        if (hkpVar == null || !mxj0.b(this.c, j)) {
            if (mxj0.d(j)) {
                this.b = null;
                this.c = 9205357640488583168L;
                hkpVar = null;
            } else {
                hkpVar = this.b;
                if (hkpVar == null) {
                    hkpVar = new hkp();
                    this.b = hkpVar;
                }
                hkpVar.b = c(j);
                this.b = hkpVar;
                this.c = j;
            }
        }
        long c = fg90Var.c();
        long j2 = l5g.b;
        if (!l5g.d(c, j2)) {
            fg90Var.d(j2);
        }
        if (!epx.f(fg90Var.e(), hkpVar != null ? (Shader) hkpVar.b : null)) {
            fg90Var.f(hkpVar != null ? (Shader) hkpVar.b : null);
        }
        if (fg90Var.a() == f) {
            return;
        }
        fg90Var.b(f);
    }

    public abstract Shader c(long j);
}
