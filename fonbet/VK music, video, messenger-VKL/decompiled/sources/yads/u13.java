package yads;

import android.view.View;
import android.view.ViewGroup;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class u13 implements zf0, c2 {
    public final j7 a;
    public final b2 b;
    public final d02 c;
    public final j13 d;
    public ue0 e;

    public u13(j7 j7Var, b2 b2Var, d02 d02Var, j13 j13Var) {
        this.a = j7Var;
        this.b = b2Var;
        this.c = d02Var;
        this.d = j13Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        k7 k7Var;
        View b = this.c.b(viewGroup);
        if (b != null) {
            this.b.b.add(this);
            j13 j13Var = this.d;
            j7 j7Var = this.a;
            Long valueOf = (j7Var == null || (k7Var = j7Var.b) == null) ? null : Long.valueOf(k7Var.c);
            long longValue = valueOf != null ? valueOf.longValue() : 0L;
            ad2 a = cd2.a();
            ue0 ue0Var = new ue0(b, j13Var, longValue, a);
            this.e = ue0Var;
            mn2 mn2Var = ue0Var.b;
            qcy qcyVar = ue0.c[0];
            View view = (View) mn2Var.a.get();
            if (view != null) {
                te0 te0Var = new te0(view, j13Var);
                if (longValue == 0) {
                    j13Var.b(view);
                } else {
                    a.a(longValue, te0Var);
                }
            }
            if (b.getTag() == null) {
                b.setTag("skip_button");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ue0 ue0Var = this.e;
        if (ue0Var != null) {
            ((ad2) ue0Var.a).b();
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.b.b.remove(this);
        ue0 ue0Var = this.e;
        if (ue0Var != null) {
            ((ad2) ue0Var.a).a();
        }
    }

    @Override // yads.c2
    public final void a() {
        ue0 ue0Var = this.e;
        if (ue0Var != null) {
            ((ad2) ue0Var.a).d();
        }
    }
}
