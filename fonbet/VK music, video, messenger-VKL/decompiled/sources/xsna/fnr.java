package xsna;

import java.util.function.BiFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class fnr implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        a9g0 a9g0Var = (a9g0) obj;
        q94 q94Var = (q94) obj2;
        synchronized (a9g0Var) {
            q94 q94Var2 = a9g0Var.b;
            if (q94Var2 == null) {
                return null;
            }
            em5 em5Var = new em5(a9g0.a(q94Var2, q94Var), a9g0Var.d, a9g0Var.c, a9g0Var.f);
            a9g0Var.c();
            return em5Var;
        }
    }
}
