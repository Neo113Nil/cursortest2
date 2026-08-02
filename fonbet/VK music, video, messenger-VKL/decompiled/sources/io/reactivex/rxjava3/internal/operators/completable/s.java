package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableMergeIterable.java */
/* loaded from: classes8.dex */
public final class s extends io.reactivex.rxjava3.core.a {
    public final Iterable<? extends io.reactivex.rxjava3.core.e> b;

    /* compiled from: CompletableMergeIterable.java */
    public static final class a extends AtomicBoolean implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -7730517613164279224L;
        final io.reactivex.rxjava3.core.c downstream;
        final io.reactivex.rxjava3.disposables.b set;
        final AtomicInteger wip;

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.disposables.b bVar, AtomicInteger atomicInteger) {
            this.downstream = cVar;
            this.set = bVar;
            this.wip = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.set.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.set.c;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.set.dispose();
            if (compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.set.b(cVar);
        }
    }

    public s(Iterable<? extends io.reactivex.rxjava3.core.e> iterable) {
        this.b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        a aVar = new a(cVar, bVar, atomicInteger);
        cVar.onSubscribe(aVar);
        try {
            Iterator<? extends io.reactivex.rxjava3.core.e> it = this.b.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends io.reactivex.rxjava3.core.e> it2 = it;
            while (!bVar.c) {
                try {
                    if (!it2.hasNext()) {
                        aVar.onComplete();
                        return;
                    }
                    if (bVar.c) {
                        return;
                    }
                    try {
                        io.reactivex.rxjava3.core.e next = it2.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        io.reactivex.rxjava3.core.e eVar = next;
                        if (bVar.c) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        eVar.subscribe(aVar);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        bVar.dispose();
                        aVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    bVar.dispose();
                    aVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.b(th3);
            cVar.onError(th3);
        }
    }
}
