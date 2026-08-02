package xsna;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SuperAppQueueManagerImpl.kt */
/* loaded from: classes5.dex */
public final class uan0 implements tan0 {
    public final e0a c;
    public boolean d;
    public Future<?> g;
    public xan0<?> i;
    public final Object b = new Object();
    public final laq e = new laq(16, TimeUnit.SECONDS.toMillis(2), 2.0f, TimeUnit.MINUTES.toMillis(10));
    public final bpn0 f = new bpn0(new vo50(16));
    public final AtomicLong h = new AtomicLong(0);

    /* compiled from: SuperAppQueueManagerImpl.kt */
    public static final class a implements r7n0 {
        public final uan0 b;
        public final xan0<?> c;
        public CountDownLatch d;

        public a(uan0 uan0Var, xan0<?> xan0Var) {
            this.b = uan0Var;
            this.c = xan0Var;
        }

        @Override // xsna.r7n0
        public final synchronized CountDownLatch cancel() {
            CountDownLatch a;
            try {
                if (this.d == null) {
                    uan0 uan0Var = this.b;
                    xan0<?> xan0Var = this.c;
                    synchronized (uan0Var.b) {
                        a = uan0Var.a(null, xan0Var);
                    }
                    this.d = a;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.d;
        }
    }

    public uan0(c2c0 c2c0Var) {
        this.c = new e0a(c2c0Var);
        new CountDownLatch(1);
    }

    public final CountDownLatch a(xan0<?> xan0Var, xan0<?> xan0Var2) {
        if (xan0Var == null && xan0Var2 == null) {
            return new CountDownLatch(0);
        }
        Future<?> future = this.g;
        if (future != null) {
            future.cancel(true);
        }
        this.e.c();
        bpn0 bpn0Var = this.f;
        ((ExecutorService) bpn0Var.getValue()).submit(new sc2(xan0Var2, 9));
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ExecutorService) bpn0Var.getValue()).submit(new nzc0(countDownLatch, 1));
        this.i = xan0Var;
        this.g = ((ExecutorService) bpn0Var.getValue()).submit(new wq8(7, this, new zan0(this.c, xan0Var, xan0Var, this.e, new sxl0(this, 4), this.d)));
        return countDownLatch;
    }

    @Override // xsna.tan0
    public final void b() {
        synchronized (this.b) {
            xan0<?> xan0Var = this.i;
            synchronized (this.b) {
                a(null, xan0Var);
            }
        }
    }

    @Override // xsna.tan0
    public final r7n0 e(qen0 qen0Var, qan0 qan0Var, dpx0 dpx0Var, uww0 uww0Var, com.vk.movika.sdk.base.flow.binding.l lVar, yde ydeVar, boolean z) {
        xan0<?> xan0Var;
        this.d = z;
        synchronized (this.b) {
            xan0Var = new xan0<>(qen0Var, qan0Var, new ejf0(dpx0Var, 8), new ujm0(uww0Var, 2), new xvc0(5), new jz70(lVar, 26), new z77(ydeVar, 13));
            a(xan0Var, null);
        }
        return new a(this, xan0Var);
    }
}
