package xsna;

import io.reactivex.rxjava3.core.w;
import java.util.concurrent.TimeUnit;

/* compiled from: IdleScheduler.kt */
/* loaded from: classes.dex */
public final class uvv extends io.reactivex.rxjava3.core.w {

    /* compiled from: IdleScheduler.kt */
    public static final class a extends w.c {
        public final rvv b = new rvv(400);
        public volatile boolean c;

        /* compiled from: IdleScheduler.kt */
        /* renamed from: xsna.uvv$a$a, reason: collision with other inner class name */
        public static final class C3838a implements io.reactivex.rxjava3.disposables.c {
            public volatile boolean b;
            public final /* synthetic */ Runnable d;

            public C3838a(Runnable runnable) {
                this.d = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final void dispose() {
                rvv rvvVar = a.this.b;
                Runnable runnable = this.d;
                rvvVar.d.remove(runnable);
                rvvVar.c.removeCallbacksAndMessages(runnable);
                this.b = true;
            }

            @Override // io.reactivex.rxjava3.disposables.c
            public final boolean h() {
                return this.b;
            }
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            this.b.b(timeUnit.toMillis(j), runnable);
            return new C3838a(runnable);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final synchronized void dispose() {
            this.b.a();
            this.c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final synchronized boolean h() {
            return this.c;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new a();
    }
}
