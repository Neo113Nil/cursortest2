package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class ei3 implements View.OnClickListener {
    public final jg1 a;
    public final hv b;
    public final b20 c;

    public ei3(jg1 jg1Var, hv hvVar, b20 b20Var) {
        this.a = jg1Var;
        this.b = hvVar;
        this.c = b20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jg1 jg1Var;
        b20 b20Var = this.c;
        if (b20Var != null) {
            jg1 jg1Var2 = this.a;
            jg1Var = new jg1(jg1Var2.a, jg1Var2.b, jg1Var2.c, b20Var.f, jg1Var2.e);
        } else {
            jg1Var = this.a;
        }
        jg1 jg1Var3 = jg1Var;
        hv hvVar = this.b;
        m22 m22Var = hvVar.c;
        iv ivVar = m22Var.a;
        oi oiVar = hvVar.a;
        y3 y3Var = hvVar.b;
        lo2 lo2Var = hvVar.d;
        kx0 kx0Var = hvVar.e;
        ivVar.getClass();
        new u02(kx0Var, lo2Var, y3Var, m22Var, oiVar, jg1Var3).onClick(view);
    }
}
