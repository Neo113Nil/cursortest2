package xsna;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicLong;
import one.video.streaming.tools.TimeMachine;

/* compiled from: IntervalTimer.kt */
/* loaded from: classes8.dex */
public final class qox {
    public static final AtomicLong h = new AtomicLong(0);
    public final Handler a;
    public final TimeMachine b;
    public final izs<qox, s3q0> c;
    public final long d;
    public final long e;
    public final long f;
    public volatile qc9 g;

    /* JADX WARN: Multi-variable type inference failed */
    public qox(Handler handler, long j, long j2, TimeMachine timeMachine, izs<? super qox, s3q0> izsVar) {
        this.a = handler;
        this.b = timeMachine;
        this.c = izsVar;
        h.getAndIncrement();
        this.d = j <= 0 ? 0L : j;
        this.e = j2 <= 0 ? 100L : j2;
        this.f = timeMachine.currentTimeMillis();
        this.g = new qc9(this, 2);
        a();
    }

    public final synchronized void a() {
        qc9 qc9Var = this.g;
        if (qc9Var != null) {
            long currentTimeMillis = this.b.currentTimeMillis();
            long j = this.e;
            this.a.postDelayed(qc9Var, ((j - ((currentTimeMillis - (this.f + this.d)) % j)) + currentTimeMillis) - currentTimeMillis);
        }
    }

    public final synchronized void b() {
        qc9 qc9Var = this.g;
        if (qc9Var != null) {
            this.a.removeCallbacks(qc9Var);
            this.g = null;
        }
    }
}
