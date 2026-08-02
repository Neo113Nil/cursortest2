package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableMergeArray.java */
/* loaded from: classes11.dex */
public final class r extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.e[] b;

    /* compiled from: CompletableMergeArray.java */
    public static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -8360547806504310570L;
        final io.reactivex.rxjava3.core.c downstream;
        final AtomicBoolean once;
        final io.reactivex.rxjava3.disposables.b set;

        public a(io.reactivex.rxjava3.core.c cVar, AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.b bVar, int i) {
            this.downstream = cVar;
            this.once = atomicBoolean;
            this.set = bVar;
            lazySet(i);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.set.dispose();
            this.once.set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.set.c;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
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

    public r(io.reactivex.rxjava3.core.e[] eVarArr) {
        this.b = eVarArr;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        a aVar = new a(cVar, new AtomicBoolean(), bVar, this.b.length + 1);
        cVar.onSubscribe(aVar);
        for (io.reactivex.rxjava3.core.e eVar : this.b) {
            if (bVar.c) {
                return;
            }
            if (eVar == null) {
                bVar.dispose();
                aVar.onError(new NullPointerException("A completable source is null"));
                return;
            }
            eVar.subscribe(aVar);
        }
        aVar.onComplete();
    }
}
