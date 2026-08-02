package androidx.lifecycle;

import defpackage.au50;
import defpackage.cvw;
import defpackage.jl40;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {
    public static final p a(Lifecycle lifecycle) {
        au50 au50Var = lifecycle.a;
        while (true) {
            p pVar = (p) ((AtomicReference) au50Var.b).get();
            if (pVar != null) {
                return pVar;
            }
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            p pVar2 = new p(lifecycle, cvw.U(a, o400.a.x));
            AtomicReference atomicReference = (AtomicReference) au50Var.b;
            while (!atomicReference.compareAndSet(null, pVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            sjh sjhVar2 = uyj.a;
            tje.N(pVar2, o400.a.x, null, new LifecycleCoroutineScopeImpl$register$1(pVar2, null), 2);
            return pVar2;
        }
    }

    public static final tpr b(Lifecycle lifecycle) {
        kotlinx.coroutines.flow.b g = kotlinx.coroutines.flow.e.g(new LifecycleKt$eventFlow$1(lifecycle, null));
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(g, o400.a.x);
    }
}
