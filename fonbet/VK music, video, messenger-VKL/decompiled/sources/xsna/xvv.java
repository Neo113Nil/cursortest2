package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: TaskSchedulers.kt */
/* loaded from: classes12.dex */
public final class xvv implements a7o0 {
    public static final xvv a = new xvv();
    public static final long b = TimeUnit.SECONDS.toMillis(15);

    @Override // xsna.a7o0
    public final void a(long j, Runnable runnable) {
        wvv.b(wvv.a, runnable, j, b, 8);
    }

    @Override // xsna.a7o0
    public final void b(Runnable runnable) {
        wvv wvvVar = wvv.a;
        wvv.a(runnable);
    }
}
