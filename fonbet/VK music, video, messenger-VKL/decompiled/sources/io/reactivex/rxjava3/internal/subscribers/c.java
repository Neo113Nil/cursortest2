package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.util.i;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;

/* compiled from: QueueDrainSubscriber.java */
/* loaded from: classes11.dex */
public abstract class c<T, U, V> extends d implements j<T> {
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicLong c = new AtomicLong();
    public final io.reactivex.rxjava3.subscribers.a d;
    public final io.reactivex.rxjava3.internal.queue.a e;
    public volatile boolean f;
    public volatile boolean g;

    public c(io.reactivex.rxjava3.subscribers.a aVar, io.reactivex.rxjava3.internal.queue.a aVar2) {
        this.d = aVar;
        this.e = aVar2;
    }

    public abstract void a(Object obj, axm0 axm0Var);

    public final boolean b() {
        return this.b.getAndIncrement() == 0;
    }

    public final void d(Object obj, io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.subscribers.a aVar = this.d;
        io.reactivex.rxjava3.internal.queue.a aVar2 = this.e;
        AtomicInteger atomicInteger = this.b;
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            long j = this.c.get();
            if (j == 0) {
                this.f = true;
                cVar.dispose();
                aVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (aVar2.isEmpty()) {
                a(obj, aVar);
                if (j != Long.MAX_VALUE) {
                    this.c.addAndGet(-1L);
                }
                if (this.b.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                aVar2.offer(obj);
            }
        } else {
            aVar2.offer(obj);
            if (!b()) {
                return;
            }
        }
        i.c(aVar2, aVar, cVar, this);
    }
}
