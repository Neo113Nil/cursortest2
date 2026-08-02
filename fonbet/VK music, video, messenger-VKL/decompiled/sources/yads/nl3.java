package yads;

import android.content.Context;
import android.view.View;

/* loaded from: classes10.dex */
public final class nl3 implements fv {
    public final View a;

    public nl3(View view) {
        this.a = view;
    }

    @Override // yads.fv
    public final void a(jg1 jg1Var, hv hvVar) {
        Context context = this.a.getContext();
        m22 m22Var = hvVar.c;
        iv ivVar = m22Var.a;
        oi oiVar = hvVar.a;
        y3 y3Var = hvVar.b;
        lo2 lo2Var = hvVar.d;
        kx0 kx0Var = hvVar.e;
        ivVar.getClass();
        k22 k22Var = new k22(new ou(context, new u02(kx0Var, lo2Var, y3Var, m22Var, oiVar, jg1Var)), d12.a());
        this.a.setOnTouchListener(k22Var);
        this.a.setOnClickListener(k22Var);
    }
}
