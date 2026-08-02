package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableDistinctUntilChanged.java */
/* loaded from: classes11.dex */
public final class y<T, K> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super T, K> c;
    public final io.reactivex.rxjava3.functions.d<? super K, ? super K> d;

    /* compiled from: ObservableDistinctUntilChanged.java */
    public static final class a<T, K> extends io.reactivex.rxjava3.internal.observers.a<T, T> {
        public final io.reactivex.rxjava3.functions.l<? super T, K> g;
        public final io.reactivex.rxjava3.functions.d<? super K, ? super K> h;
        public K i;
        public boolean j;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.l<? super T, K> lVar, io.reactivex.rxjava3.functions.d<? super K, ? super K> dVar) {
            super(vVar);
            this.g = lVar;
            this.h = dVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            int i = this.f;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.b;
            if (i != 0) {
                vVar.onNext(t);
                return;
            }
            try {
                K apply = this.g.apply(t);
                if (this.j) {
                    boolean test = this.h.test(this.i, apply);
                    this.i = apply;
                    if (test) {
                        return;
                    }
                } else {
                    this.j = true;
                    this.i = apply;
                }
                vVar.onNext(t);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            while (true) {
                T poll = this.d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.g.apply(poll);
                if (!this.j) {
                    this.j = true;
                    this.i = apply;
                    return poll;
                }
                if (!this.h.test(this.i, apply)) {
                    this.i = apply;
                    return poll;
                }
                this.i = apply;
            }
        }
    }

    public y(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, io.reactivex.rxjava3.functions.d dVar) {
        super(qVar);
        this.c = lVar;
        this.d = dVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c, this.d));
    }
}
