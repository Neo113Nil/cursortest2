package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: ObservableTake.java */
/* loaded from: classes11.dex */
public final class o2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;

    /* compiled from: ObservableTake.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public boolean c;
        public io.reactivex.rxjava3.disposables.c d;
        public long e;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, long j) {
            this.b = vVar;
            this.e = j;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.d.dispose();
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.c) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.c = true;
            this.d.dispose();
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.c) {
                return;
            }
            long j = this.e;
            long j2 = j - 1;
            this.e = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.b.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                long j = this.e;
                io.reactivex.rxjava3.core.v<? super T> vVar = this.b;
                if (j != 0) {
                    vVar.onSubscribe(this);
                    return;
                }
                this.c = true;
                cVar.dispose();
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onComplete();
            }
        }
    }

    public o2(io.reactivex.rxjava3.core.q qVar, long j) {
        super(qVar);
        this.c = j;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
