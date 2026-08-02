package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.f;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableBuffer.java */
/* loaded from: classes11.dex */
public final class h<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final int c;
    public final int d;
    public final io.reactivex.rxjava3.functions.n<U> e;

    /* compiled from: ObservableBuffer.java */
    /* loaded from: classes8.dex */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super U> b;
        public final int c;
        public final io.reactivex.rxjava3.functions.n<U> d;
        public U e;
        public int f;
        public io.reactivex.rxjava3.disposables.c g;

        public a(io.reactivex.rxjava3.core.v<? super U> vVar, int i, io.reactivex.rxjava3.functions.n<U> nVar) {
            this.b = vVar;
            this.c = i;
            this.d = nVar;
        }

        public final boolean a() {
            try {
                U u = this.d.get();
                Objects.requireNonNull(u, "Empty buffer supplied");
                this.e = u;
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.e = null;
                io.reactivex.rxjava3.disposables.c cVar = this.g;
                io.reactivex.rxjava3.core.v<? super U> vVar = this.b;
                if (cVar == null) {
                    EmptyDisposable.b(th, vVar);
                    return false;
                }
                cVar.dispose();
                vVar.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.g.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.g.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            U u = this.e;
            if (u != null) {
                this.e = null;
                boolean isEmpty = u.isEmpty();
                io.reactivex.rxjava3.core.v<? super U> vVar = this.b;
                if (!isEmpty) {
                    vVar.onNext(u);
                }
                vVar.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.e = null;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            U u = this.e;
            if (u != null) {
                u.add(t);
                int i = this.f + 1;
                this.f = i;
                if (i >= this.c) {
                    this.b.onNext(u);
                    this.f = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.g, cVar)) {
                this.g = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    /* compiled from: ObservableBuffer.java */
    public static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -8223395059921494546L;
        final io.reactivex.rxjava3.functions.n<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final io.reactivex.rxjava3.core.v<? super U> downstream;
        long index;
        final int skip;
        io.reactivex.rxjava3.disposables.c upstream;

        public b(io.reactivex.rxjava3.core.v<? super U> vVar, int i, int i2, io.reactivex.rxjava3.functions.n<U> nVar) {
            this.downstream = vVar;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = nVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % this.skip == 0) {
                try {
                    U u = this.bufferSupplier.get();
                    if (u == null) {
                        throw io.reactivex.rxjava3.internal.util.f.b("The bufferSupplier returned a null Collection.");
                    }
                    f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
                    this.buffers.offer(u);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public h(io.reactivex.rxjava3.core.q qVar, int i, int i2, ArrayListSupplier arrayListSupplier) {
        super(qVar);
        this.c = i;
        this.d = i2;
        this.e = arrayListSupplier;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        io.reactivex.rxjava3.functions.n<U> nVar = this.e;
        int i = this.d;
        int i2 = this.c;
        if (i != i2) {
            tVar.subscribe(new b(vVar, i2, i, nVar));
            return;
        }
        a aVar = new a(vVar, i2, nVar);
        if (aVar.a()) {
            tVar.subscribe(aVar);
        }
    }
}
