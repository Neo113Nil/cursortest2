package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OnTimeout.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class hc80 extends FunctionReferenceImpl implements yzs<ic80, x8i0<?>, Object, s3q0> {
    public static final hc80 b = new hc80(3, ic80.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // xsna.yzs
    public final s3q0 invoke(ic80 ic80Var, x8i0<?> x8i0Var, Object obj) {
        ic80 ic80Var2 = ic80Var;
        x8i0<?> x8i0Var2 = x8i0Var;
        long j = ic80Var2.a;
        if (j <= 0) {
            x8i0Var2.c(s3q0.a);
        } else {
            e50 e50Var = new e50(5, x8i0Var2, ic80Var2);
            v8i0 v8i0Var = (v8i0) x8i0Var2;
            kotlin.coroutines.d dVar = v8i0Var.b;
            v8i0Var.d = qsl.d(dVar).J(j, e50Var, dVar);
        }
        return s3q0.a;
    }
}
