package xsna;

import android.view.ViewConfiguration;

/* compiled from: ReactionsPopupTouchHandler.kt */
/* loaded from: classes18.dex */
public final class z5f0 {
    public final m3r a;
    public final k6f0 b;
    public final x2f0 c;
    public final hxb0 f;
    public final jj5 g;
    public Long i;
    public Float j;
    public Float k;
    public Float l;
    public boolean m;
    public boolean o;
    public final long d = ViewConfiguration.getLongPressTimeout();
    public final ugh0 e = new ugh0();
    public int h = -1;
    public boolean n = true;

    public z5f0(m3r m3rVar, k6f0 k6f0Var, x2f0 x2f0Var, x7d x7dVar, a6f0 a6f0Var) {
        this.a = m3rVar;
        this.b = k6f0Var;
        this.c = x2f0Var;
        this.f = new hxb0(m3rVar, x7dVar, this, a6f0Var);
        this.g = new jj5(m3rVar, k6f0Var);
    }

    public final void a() {
        this.j = null;
        ugh0 ugh0Var = this.e;
        ugh0Var.b = null;
        ugh0Var.c = null;
        this.m = false;
        this.i = null;
    }

    public final void b() {
        Long l = this.i;
        if (l != null) {
            if (System.currentTimeMillis() - l.longValue() < this.d) {
                this.a.c();
                this.o = true;
            }
            a();
            this.f.b();
        }
    }
}
