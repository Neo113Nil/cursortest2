package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class vb implements ol3 {
    public final m22 a;
    public final gv b;
    public final jg1 c;
    public final lm3 d;

    public vb(m22 m22Var, gv gvVar, jg1 jg1Var, lm3 lm3Var) {
        this.a = m22Var;
        this.b = gvVar;
        this.c = jg1Var;
        this.d = lm3Var;
    }

    @Override // yads.ol3
    public final void a(oi oiVar, fv fvVar) {
        jg1 jg1Var = oiVar.d;
        if (jg1Var == null) {
            jg1Var = this.c;
        }
        gv gvVar = this.b;
        m22 m22Var = this.a;
        gvVar.getClass();
        if (!oiVar.e || jg1Var == null) {
            return;
        }
        fvVar.a(jg1Var, new hv(oiVar, gvVar.a, m22Var, gvVar.b, gvVar.c));
    }

    @Override // yads.ol3
    public final void a(View view, oi oiVar) {
        if (view.getTag() == null) {
            lm3 lm3Var = this.d;
            String str = oiVar.a;
            lm3Var.getClass();
            view.setTag(lm3.a(str));
        }
    }
}
