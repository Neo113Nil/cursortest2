package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableDoAfterNext.java */
/* loaded from: classes8.dex */
public final class z<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.f<? super T> c;

    /* compiled from: ObservableDoAfterNext.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.a<T, T> {
        public final io.reactivex.rxjava3.functions.f<? super T> g;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.f<? super T> fVar) {
            super(vVar);
            this.g = fVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.b.onNext(t);
            if (this.f == 0) {
                try {
                    this.g.accept(t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            T poll = this.d.poll();
            if (poll != null) {
                this.g.accept(poll);
            }
            return poll;
        }
    }

    public z(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.f fVar) {
        super(qVar);
        this.c = fVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
