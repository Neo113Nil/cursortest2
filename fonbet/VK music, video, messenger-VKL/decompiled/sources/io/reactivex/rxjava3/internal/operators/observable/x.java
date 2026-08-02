package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.f;
import java.util.Collection;
import java.util.Objects;

/* compiled from: ObservableDistinct.java */
/* loaded from: classes8.dex */
public final class x<T, K> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final a.q c;
    public final io.reactivex.rxjava3.functions.n<? extends Collection<? super K>> d;

    /* compiled from: ObservableDistinct.java */
    public static final class a<T, K> extends io.reactivex.rxjava3.internal.observers.a<T, T> {
        public final Collection<? super K> g;
        public final io.reactivex.rxjava3.functions.l<? super T, K> h;

        public a(io.reactivex.rxjava3.core.v vVar, a.q qVar, Collection collection) {
            super(vVar);
            this.h = qVar;
            this.g = collection;
        }

        @Override // io.reactivex.rxjava3.internal.observers.a, io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.g.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.a, io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.g.clear();
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.a, io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.e = true;
            this.g.clear();
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            int i = this.f;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.b;
            if (i != 0) {
                vVar.onNext(null);
                return;
            }
            try {
                K apply = this.h.apply(t);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
                if (this.g.add(apply)) {
                    vVar.onNext(t);
                }
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            T poll;
            K apply;
            do {
                poll = this.d.poll();
                if (poll == null) {
                    break;
                }
                apply = this.h.apply(poll);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
            } while (!this.g.add(apply));
            return poll;
        }
    }

    public x(io.reactivex.rxjava3.subjects.f fVar, a.p pVar) {
        super(fVar);
        this.c = io.reactivex.rxjava3.internal.functions.a.a;
        this.d = pVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        try {
            Collection<? super K> collection = this.d.get();
            if (collection == null) {
                throw io.reactivex.rxjava3.internal.util.f.b("The collectionSupplier returned a null Collection.");
            }
            f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
            this.b.subscribe(new a(vVar, this.c, collection));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
