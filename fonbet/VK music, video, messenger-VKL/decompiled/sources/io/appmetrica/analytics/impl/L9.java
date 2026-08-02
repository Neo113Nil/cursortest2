package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import xsna.ho8;

/* loaded from: classes8.dex */
public final class L9 implements IHandlerExecutor {
    public final Looper a;
    public final Handler b;
    public final HandlerThreadC5063ob c;

    public L9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC5063ob a(String str) {
        StringBuilder b = ho8.b(str, "-");
        b.append(Kd.a.incrementAndGet());
        HandlerThreadC5063ob handlerThreadC5063ob = new HandlerThreadC5063ob(b.toString());
        handlerThreadC5063ob.start();
        return handlerThreadC5063ob;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j) {
        this.b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC5063ob handlerThreadC5063ob = this.c;
        synchronized (handlerThreadC5063ob) {
            z = handlerThreadC5063ob.a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC5063ob handlerThreadC5063ob = this.c;
        synchronized (handlerThreadC5063ob) {
            handlerThreadC5063ob.a = false;
            handlerThreadC5063ob.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.b.post(futureTask);
        return futureTask;
    }

    public L9(HandlerThreadC5063ob handlerThreadC5063ob) {
        this(handlerThreadC5063ob, handlerThreadC5063ob.getLooper(), new Handler(handlerThreadC5063ob.getLooper()));
    }

    public L9(@NonNull HandlerThreadC5063ob handlerThreadC5063ob, @NonNull Looper looper, @NonNull Handler handler) {
        this.c = handlerThreadC5063ob;
        this.a = looper;
        this.b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
