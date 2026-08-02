package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: QueueDrainObserver.java */
/* loaded from: classes11.dex */
public abstract class i<T, U, V> implements v<T> {
    public final AtomicInteger b = new AtomicInteger();
    public final io.reactivex.rxjava3.observers.e c;
    public final io.reactivex.rxjava3.internal.queue.a d;
    public volatile boolean e;
    public volatile boolean f;

    public i(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.internal.queue.a aVar) {
        this.c = eVar;
        this.d = aVar;
    }

    public abstract void a(v<? super V> vVar, U u);

    public final boolean b() {
        return this.b.getAndIncrement() == 0;
    }

    public final void c(Object obj, io.reactivex.rxjava3.disposables.c cVar) {
        AtomicInteger atomicInteger = this.b;
        int i = atomicInteger.get();
        io.reactivex.rxjava3.observers.e eVar = this.c;
        io.reactivex.rxjava3.internal.queue.a aVar = this.d;
        if (i == 0 && atomicInteger.compareAndSet(0, 1)) {
            a(eVar, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            aVar.offer(obj);
            if (!b()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.i.b(aVar, eVar, cVar, this);
    }

    public final void d(Object obj, io.reactivex.rxjava3.disposables.c cVar) {
        AtomicInteger atomicInteger = this.b;
        int i = atomicInteger.get();
        io.reactivex.rxjava3.observers.e eVar = this.c;
        io.reactivex.rxjava3.internal.queue.a aVar = this.d;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            aVar.offer(obj);
            if (!b()) {
                return;
            }
        } else if (aVar.isEmpty()) {
            a(eVar, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            aVar.offer(obj);
        }
        io.reactivex.rxjava3.internal.util.i.b(aVar, eVar, cVar, this);
    }
}
