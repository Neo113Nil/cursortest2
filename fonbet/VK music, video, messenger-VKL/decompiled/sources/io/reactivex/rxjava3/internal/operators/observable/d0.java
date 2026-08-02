package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableElementAt.java */
/* loaded from: classes8.dex */
public final class d0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final T c;
    public final boolean d;

    /* compiled from: ObservableElementAt.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final T c;
        public final boolean d;
        public io.reactivex.rxjava3.disposables.c e;
        public long f;
        public boolean g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.v vVar, Object obj, boolean z) {
            this.b = vVar;
            this.c = obj;
            this.d = z;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            io.reactivex.rxjava3.core.v<? super T> vVar = this.b;
            T t = this.c;
            if (t == null && this.d) {
                vVar.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                vVar.onNext(t);
            }
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.g) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.g = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.g) {
                return;
            }
            long j = this.f;
            if (j != 0) {
                this.f = j + 1;
                return;
            }
            this.g = true;
            this.e.dispose();
            io.reactivex.rxjava3.core.v<? super T> vVar = this.b;
            vVar.onNext(t);
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.e, cVar)) {
                this.e = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(io.reactivex.rxjava3.core.q qVar, Object obj, boolean z) {
        super(qVar);
        this.c = obj;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c, this.d));
    }
}
