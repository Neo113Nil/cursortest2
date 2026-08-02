package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.pyx.e;

/* compiled from: JobSupport.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class syx extends FunctionReferenceImpl implements yzs<pyx, x8i0<?>, Object, s3q0> {
    public static final syx b = new syx(3, pyx.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // xsna.yzs
    public final s3q0 invoke(pyx pyxVar, x8i0<?> x8i0Var, Object obj) {
        pyx pyxVar2 = pyxVar;
        x8i0<?> x8i0Var2 = x8i0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyx.b;
        pyxVar2.getClass();
        while (true) {
            Object obj2 = pyx.b.get(pyxVar2);
            if (!(obj2 instanceof atw)) {
                x8i0Var2.c(s3q0.a);
                break;
            }
            if (pyxVar2.q0(obj2) >= 0) {
                x8i0Var2.b(iyx.g(pyxVar2, pyxVar2.new e(x8i0Var2)));
                break;
            }
        }
        return s3q0.a;
    }
}
