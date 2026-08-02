package xsna;

import com.vk.reefton.literx.DisposableContainer;
import com.vk.reefton.literx.observable.ObservableBuffer;
import com.vk.reefton.literx.schedulers.ExecutorScheduler;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler.kt */
/* loaded from: classes5.dex */
public abstract class b8h0 {

    /* compiled from: Scheduler.kt */
    public final class a implements Runnable {
        public final ObservableBuffer.BufferObserver b;
        public final DisposableContainer c;
        public final long d;
        public final TimeUnit e;

        public a(ObservableBuffer.BufferObserver bufferObserver, DisposableContainer disposableContainer, long j, TimeUnit timeUnit) {
            this.b = bufferObserver;
            this.c = disposableContainer;
            this.d = j;
            this.e = timeUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DisposableContainer disposableContainer = this.c;
            if (disposableContainer.h()) {
                return;
            }
            this.b.d();
            if (disposableContainer.h()) {
                return;
            }
            disposableContainer.set(b8h0.this.a(this, this.d, this.e));
        }
    }

    public abstract ExecutorScheduler.DelayedJob a(Runnable runnable, long j, TimeUnit timeUnit);

    public abstract ExecutorScheduler.Job b(Runnable runnable);
}
