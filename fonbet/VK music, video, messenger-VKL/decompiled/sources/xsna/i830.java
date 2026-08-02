package xsna;

import xsna.g830;

/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes11.dex */
public final class i830 {
    public static final g830 a(kotlin.coroutines.d dVar) {
        g830 g830Var = (g830) dVar.get(g830.a.b);
        if (g830Var != null) {
            return g830Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
