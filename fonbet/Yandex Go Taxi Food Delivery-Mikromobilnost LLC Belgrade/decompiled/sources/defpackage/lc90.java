package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class lc90 extends d6z {
    public final Method f;
    public final int g;
    public final zme h;

    public lc90(Method method, int i, zme zmeVar) {
        this.f = method;
        this.g = i;
        this.h = zmeVar;
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        int i = this.g;
        Method method = this.f;
        if (obj == null) {
            throw udq0.J(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            q5j0Var.k = (m5j0) this.h.l(obj);
        } catch (IOException e) {
            throw udq0.K(method, e, i, qv10.p("Unable to convert ", " to RequestBody", obj), new Object[0]);
        }
    }
}
