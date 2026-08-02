package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import java.util.List;

/* loaded from: classes10.dex */
public final class lum extends r6 {
    public final wls a;
    public final zls b;
    public final tls c;
    public final tls d;

    public lum(wls wlsVar, zls zlsVar, tls tlsVar, tls tlsVar2) {
        this.a = wlsVar;
        this.b = zlsVar;
        this.c = tlsVar;
        this.d = tlsVar2;
    }

    @Override // defpackage.m70
    public final n70 c(ViewGroup viewGroup) {
        n70 n70Var = new n70((zo31) this.a.invoke(this.d.invoke(viewGroup), viewGroup));
        this.c.invoke(n70Var);
        return n70Var;
    }

    @Override // defpackage.m70
    public final void d(x0 x0Var) {
    }

    @Override // defpackage.m70
    public final void e(x0 x0Var) {
        sls slsVar = ((n70) x0Var).S;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.m70
    public final void f(x0 x0Var) {
        sls slsVar = ((n70) x0Var).T;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.m70
    public final void g(x0 x0Var) {
        sls slsVar = ((n70) x0Var).R;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.r6
    public final boolean h(Object obj, int i, List list) {
        return ((Boolean) this.b.invoke(obj, list, Integer.valueOf(i))).booleanValue();
    }

    @Override // defpackage.r6
    public final void i(Object obj, x0 x0Var, List list) {
        n70 n70Var = (n70) x0Var;
        n70Var.O = obj;
        tls tlsVar = n70Var.Q;
        if (tlsVar != null) {
            tlsVar.invoke(list);
        }
    }
}
