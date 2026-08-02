package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.eyx;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes11.dex */
public final class zvj {
    public static final hpj a(kotlin.coroutines.d dVar) {
        if (dVar.get(eyx.a.b) == null) {
            dVar = dVar.plus(iyx.a());
        }
        return new hpj(dVar);
    }

    public static final hpj b() {
        vhn0 a = whn0.a();
        bdn bdnVar = bdn.a;
        return new hpj(d.a.a(a, ie00.a));
    }

    public static final void c(yvj yvjVar, CancellationException cancellationException) {
        eyx eyxVar = (eyx) yvjVar.getCoroutineContext().get(eyx.a.b);
        if (eyxVar != null) {
            eyxVar.b(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + yvjVar).toString());
        }
    }

    public static final <R> Object d(wzs<? super yvj, ? super spj<? super R>, ? extends Object> wzsVar, spj<? super R> spjVar) {
        z9h0 z9h0Var = new z9h0(spjVar, spjVar.getContext());
        Object c = e2l.c(z9h0Var, true, z9h0Var, wzsVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return c;
    }

    public static final void e(yvj yvjVar) {
        iyx.e(yvjVar.getCoroutineContext());
    }

    public static final boolean f(yvj yvjVar) {
        eyx eyxVar = (eyx) yvjVar.getCoroutineContext().get(eyx.a.b);
        if (eyxVar != null) {
            return eyxVar.isActive();
        }
        return true;
    }

    public static final hpj g(yvj yvjVar, kotlin.coroutines.d dVar) {
        return new hpj(yvjVar.getCoroutineContext().plus(dVar));
    }
}
