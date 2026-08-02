package xsna;

/* compiled from: Unconfined.kt */
/* loaded from: classes11.dex */
public final class u2q0 extends ovj {
    public static final u2q0 c = new u2q0();

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        m5y0 m5y0Var = (m5y0) dVar.get(m5y0.c);
        if (m5y0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        m5y0Var.b = true;
    }

    @Override // xsna.ovj
    public final ovj T(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // xsna.ovj
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
