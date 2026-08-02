package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class hk3 {
    public final kj3 a;
    public final r0 b;
    public final gci0 c;
    public final r0 d;
    public final gci0 e;

    public hk3(kj3 kj3Var, ryh ryhVar) {
        ek ekVar;
        this.a = kj3Var;
        r0 c = bvf0.c(tk3.a);
        this.b = c;
        this.c = e.d(c);
        Object value = c.getValue();
        Long l = null;
        qk3 qk3Var = value instanceof qk3 ? (qk3) value : null;
        if (qk3Var != null && (ekVar = qk3Var.a) != null) {
            l = Long.valueOf(ekVar.b);
        }
        r0 c2 = bvf0.c(l);
        this.d = c2;
        this.e = e.d(c2);
    }

    public final void a(xk3 xk3Var) {
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, xk3Var);
        boolean z = xk3Var instanceof qk3;
        r0 r0Var2 = this.d;
        if (!z) {
            r0Var2.l(null);
            return;
        }
        Long valueOf = Long.valueOf(((qk3) xk3Var).a.b);
        r0Var2.getClass();
        r0Var2.m(null, valueOf);
        this.a.getClass();
    }
}
