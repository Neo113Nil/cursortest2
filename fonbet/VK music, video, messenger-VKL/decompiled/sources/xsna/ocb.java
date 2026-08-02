package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ocb implements u080 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ocb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = qcb.h1;
                ((View) obj).requestLayout();
                return iut0.c(view, bqx0Var);
            case 1:
                int i3 = nxb.k1;
                ((View) obj).requestLayout();
                return iut0.c(view, bqx0Var);
            default:
                m3a0 m3a0Var = (m3a0) obj;
                int a = wqx0.a(bqx0Var);
                m3a0Var.k = a;
                f4m.t(iah0.a(41) + a, m3a0Var.j);
                f4m.t(a, m3a0Var.d);
                m3a0Var.i.setMinimumHeight(iah0.a(256) + a);
                m3a0Var.m.c(m3a0Var.k, m3a0Var.c);
                return bqx0.b;
        }
    }
}
