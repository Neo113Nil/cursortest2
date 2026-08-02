package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerScheduler.java */
/* loaded from: classes11.dex */
public final class b extends w {
    public final Handler b;
    public final boolean c = true;

    /* compiled from: HandlerScheduler.java */
    public static final class a extends w.c {
        public final Handler b;
        public final boolean c;
        public volatile boolean d;

        public a(boolean z, Handler handler) {
            this.b = handler;
            this.c = z;
        }

        @Override // io.reactivex.rxjava3.core.w.c
        @SuppressLint({"NewApi"})
        public final c b(Runnable runnable, long j, TimeUnit timeUnit) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.d) {
                return EmptyDisposable.INSTANCE;
            }
            Handler handler = this.b;
            RunnableC2115b runnableC2115b = new RunnableC2115b(handler, runnable);
            Message obtain = Message.obtain(handler, runnableC2115b);
            obtain.obj = this;
            if (this.c) {
                obtain.setAsynchronous(true);
            }
            this.b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.d) {
                return runnableC2115b;
            }
            this.b.removeCallbacks(runnableC2115b);
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d = true;
            this.b.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d;
        }
    }

    /* compiled from: HandlerScheduler.java */
    /* renamed from: io.reactivex.rxjava3.android.schedulers.b$b, reason: collision with other inner class name */
    public static final class RunnableC2115b implements Runnable, c {
        public final Handler b;
        public final Runnable c;
        public volatile boolean d;

        public RunnableC2115b(Handler handler, Runnable runnable) {
            this.b = handler;
            this.c = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.b.removeCallbacks(this);
            this.d = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }
    }

    public b(Handler handler) {
        this.b = handler;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new a(this.c, this.b);
    }

    @Override // io.reactivex.rxjava3.core.w
    @SuppressLint({"NewApi"})
    public final c d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.b;
        RunnableC2115b runnableC2115b = new RunnableC2115b(handler, runnable);
        Message obtain = Message.obtain(handler, runnableC2115b);
        if (this.c) {
            obtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        return runnableC2115b;
    }
}
