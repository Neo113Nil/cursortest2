package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.pyx.d;

/* compiled from: JobSupport.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class qyx extends FunctionReferenceImpl implements yzs<pyx, x8i0<?>, Object, s3q0> {
    public static final qyx b = new qyx(3, pyx.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // xsna.yzs
    public final s3q0 invoke(pyx pyxVar, x8i0<?> x8i0Var, Object obj) {
        pyx pyxVar2 = pyxVar;
        x8i0<?> x8i0Var2 = x8i0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyx.b;
        pyxVar2.getClass();
        while (true) {
            Object obj2 = pyx.b.get(pyxVar2);
            if (!(obj2 instanceof atw)) {
                if (!(obj2 instanceof d8i)) {
                    obj2 = tyx.d(obj2);
                }
                x8i0Var2.c(obj2);
            } else if (pyxVar2.q0(obj2) >= 0) {
                x8i0Var2.b(iyx.g(pyxVar2, pyxVar2.new d(x8i0Var2)));
                break;
            }
        }
        return s3q0.a;
    }
}
