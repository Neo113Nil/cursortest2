package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;

/* compiled from: LifecycleOwner.kt */
/* loaded from: classes.dex */
public class g5z {
    public static final androidx.lifecycle.j a(f5z f5zVar) {
        Lifecycle lifecycle = f5zVar.getLifecycle();
        while (true) {
            androidx.lifecycle.j jVar = (androidx.lifecycle.j) lifecycle.getInternalScopeRef().a.get();
            if (jVar != null) {
                return jVar;
            }
            vhn0 a = whn0.a();
            bdn bdnVar = bdn.a;
            androidx.lifecycle.j jVar2 = new androidx.lifecycle.j(lifecycle, d.a.a(a, ie00.a.U()));
            AtomicReference<Object> atomicReference = lifecycle.getInternalScopeRef().a;
            while (!atomicReference.compareAndSet(null, jVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            bdn bdnVar2 = bdn.a;
            myc0.h(jVar2, ie00.a.U(), null, new androidx.lifecycle.i(jVar2, null), 2);
            return jVar2;
        }
    }

    public static vki0 b(wzs wzsVar) {
        vki0 vki0Var = new vki0();
        vki0Var.d(s7s0.a(vki0Var, vki0Var, wzsVar));
        return vki0Var;
    }
}
