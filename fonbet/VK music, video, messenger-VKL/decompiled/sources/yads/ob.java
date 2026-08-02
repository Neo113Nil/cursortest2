package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class ob implements ol3 {
    public final m22 a;
    public final gv b;

    public ob(m22 m22Var, gv gvVar) {
        this.a = m22Var;
        this.b = gvVar;
    }

    @Override // yads.ol3
    public final void a(View view, oi oiVar) {
    }

    @Override // yads.ol3
    public final void a(oi oiVar, fv fvVar) {
        jg1 jg1Var = oiVar.d;
        gv gvVar = this.b;
        m22 m22Var = this.a;
        gvVar.getClass();
        if (!oiVar.e || jg1Var == null) {
            return;
        }
        fvVar.a(jg1Var, new hv(oiVar, gvVar.a, m22Var, gvVar.b, gvVar.c));
    }
}
