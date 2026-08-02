package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableFilter.java */
/* loaded from: classes11.dex */
public final class i0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.m<? super T> c;

    /* compiled from: ObservableFilter.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.a<T, T> {
        public final io.reactivex.rxjava3.functions.m<? super T> g;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.m<? super T> mVar) {
            super(vVar);
            this.g = mVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            int i = this.f;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.b;
            if (i != 0) {
                vVar.onNext(null);
                return;
            }
            try {
                if (this.g.test(t)) {
                    vVar.onNext(t);
                }
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            T poll;
            do {
                poll = this.d.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.g.test(poll));
            return poll;
        }
    }

    public i0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.m mVar) {
        super(qVar);
        this.c = mVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
