package xsna;

import android.os.SystemClock;
import com.vk.log.L;
import io.reactivex.rxjava3.core.w;
import java.util.concurrent.TimeUnit;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: PerfScheduler.kt */
/* loaded from: classes17.dex */
public final class yv90 extends io.reactivex.rxjava3.core.w {
    public final io.reactivex.rxjava3.core.w b;
    public final Throwable c;
    public final long d = 100;

    /* compiled from: PerfScheduler.kt */
    public static final class a extends w.c {
        public final Throwable b;
        public final long c;
        public final w.c d;

        /* compiled from: PerfScheduler.kt */
        /* renamed from: xsna.yv90$a$a, reason: collision with other inner class name */
        public static final class RunnableC4140a implements Runnable {
            public final Throwable b;
            public final long c;
            public final Runnable d;

            public RunnableC4140a(Throwable th, long j, Runnable runnable) {
                this.b = th;
                this.c = j;
                this.d = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j = this.c;
                if (elapsedRealtime2 > j) {
                    StringBuilder sb = new StringBuilder("ran for ");
                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    sb.append("ms, which exceeds threshold of ");
                    L.E(new Throwable(efz.b(j, UcumUtils.UCUM_MILLISECODS, sb), this.b), new Object[0]);
                }
            }
        }

        public a(Throwable th, long j, w.c cVar) {
            this.b = th;
            this.c = j;
            this.d = cVar;
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.d.b(new RunnableC4140a(this.b, this.c, runnable), j, timeUnit);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }
    }

    public yv90(io.reactivex.rxjava3.core.w wVar, Throwable th) {
        this.b = wVar;
        this.c = th;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new a(this.c, this.d, this.b.a());
    }

    @Override // io.reactivex.rxjava3.core.w
    public final void f() {
        this.b.f();
    }
}
