package xsna;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.eyx;

/* loaded from: classes11.dex */
public final class iyx {
    public static gyx a() {
        return new gyx(null);
    }

    public static final void b(kotlin.coroutines.d dVar, CancellationException cancellationException) {
        eyx eyxVar = (eyx) dVar.get(eyx.a.b);
        if (eyxVar != null) {
            eyxVar.b(cancellationException);
        }
    }

    public static final Object c(eyx eyxVar, SuspendLambda suspendLambda) {
        eyxVar.b(null);
        Object y = eyxVar.y(suspendLambda);
        return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : s3q0.a;
    }

    public static void d(kotlin.coroutines.d dVar) {
        eyx eyxVar = (eyx) dVar.get(eyx.a.b);
        if (eyxVar != null) {
            Iterator<eyx> it = eyxVar.n().iterator();
            while (it.hasNext()) {
                it.next().b(null);
            }
        }
    }

    public static final void e(kotlin.coroutines.d dVar) {
        eyx eyxVar = (eyx) dVar.get(eyx.a.b);
        if (eyxVar != null && !eyxVar.isActive()) {
            throw eyxVar.I();
        }
    }

    public static final eyx f(kotlin.coroutines.d dVar) {
        eyx eyxVar = (eyx) dVar.get(eyx.a.b);
        if (eyxVar != null) {
            return eyxVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }

    public static ogn g(eyx eyxVar, jyx jyxVar) {
        return eyxVar instanceof pyx ? ((pyx) eyxVar).g0(true, jyxVar) : eyxVar.c(jyxVar.h(), true, new ic1(jyxVar));
    }

    public static final boolean h(kotlin.coroutines.d dVar) {
        eyx eyxVar = (eyx) dVar.get(eyx.a.b);
        if (eyxVar != null) {
            return eyxVar.isActive();
        }
        return true;
    }

    public static final ara i(ara araVar, wdp0 wdp0Var, String str, String str2) {
        return wdp0Var == null ? araVar : !(araVar instanceof vz80) ? araVar instanceof wz80 ? araVar : new vz80(wdp0Var, araVar.a, str, str2, araVar) : araVar;
    }
}
