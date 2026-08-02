package xsna;

/* compiled from: Dispatcher.kt */
/* loaded from: classes11.dex */
public final class n4q0 extends ovj {
    public static final n4q0 c = new n4q0();

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        xll.d.c.n(runnable, true, false);
    }

    @Override // xsna.ovj
    public final void Q(kotlin.coroutines.d dVar, Runnable runnable) {
        xll.d.c.n(runnable, true, true);
    }

    @Override // xsna.ovj
    public final ovj T(int i) {
        p7i.c(i);
        return i >= k7o0.d ? this : super.T(i);
    }

    @Override // xsna.ovj
    public final String toString() {
        return "Dispatchers.IO";
    }
}
