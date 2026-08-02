package xsna;

import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: Dispatcher.kt */
/* loaded from: classes11.dex */
public final class xll extends e8h0 {
    public static final xll d;

    static {
        int i = k7o0.c;
        int i2 = k7o0.d;
        long j = k7o0.e;
        String str = k7o0.a;
        xll xllVar = new xll();
        xllVar.c = new CoroutineScheduler(i, j, i2, str);
        d = xllVar;
    }

    @Override // xsna.ovj
    public final ovj T(int i) {
        p7i.c(i);
        return i >= k7o0.c ? this : super.T(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // xsna.ovj
    public final String toString() {
        return "Dispatchers.Default";
    }
}
