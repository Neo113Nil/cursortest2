package xsna;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: RateLimitInterceptor.kt */
/* loaded from: classes2.dex */
public final class t1p0 {
    public final int a;
    public final long b;
    public final gzs<Long> c;
    public final double d;
    public final ReentrantLock e = new ReentrantLock();
    public final double f;
    public double g;
    public long h;

    public t1p0(int i, long j, dgc0 dgc0Var) {
        this.a = i;
        this.b = j;
        this.c = dgc0Var;
        double d = j;
        this.d = d;
        this.f = i > 0 ? d / i : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.g = d;
        this.h = ((Number) dgc0Var.invoke()).longValue();
    }
}
