package xsna;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import xsna.uic;

/* compiled from: MviStoreDispatcher.kt */
/* loaded from: classes3.dex */
public final class ytj0 implements nm50 {
    public static final bpn0 e = new bpn0(new l63(29));
    public final bpn0 b = new bpn0(new jkg0(2));
    public final bpn0 c = new bpn0(new jw30(this, 26));
    public final bpn0 d = new bpn0(new c2c0(10));

    /* compiled from: MviStoreDispatcher.kt */
    public static final class a implements uic, Future<Object> {
        public final Future<Object> b;

        public a(Future<Object> future) {
            this.b = future;
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return this.b.cancel(z);
        }

        @Override // xsna.uic
        public final void clear() {
            cancel(false);
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.b.isDone();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.b.get(j, timeUnit);
        }
    }

    /* compiled from: MviStoreDispatcher.kt */
    public static final class b {
    }

    @Override // xsna.nm50
    public final uic C(gzs<s3q0> gzsVar) {
        if (!(Thread.currentThread() instanceof tn50)) {
            return new a(((ExecutorService) e.getValue()).submit(new dlc0(gzsVar, 1)));
        }
        gzsVar.invoke();
        return uic.a.a;
    }

    @Override // xsna.uic
    public final void clear() {
        zvj.c((yvj) this.c.getValue(), null);
        zvj.c((yvj) this.d.getValue(), null);
    }
}
