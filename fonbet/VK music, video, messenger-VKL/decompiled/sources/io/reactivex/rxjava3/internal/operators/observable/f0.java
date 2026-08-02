package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableElementAtSingle.java */
/* loaded from: classes11.dex */
public final class f0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.f<T> {
    public final io.reactivex.rxjava3.core.q b;
    public final T c;

    /* compiled from: ObservableElementAtSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public final T c;
        public io.reactivex.rxjava3.disposables.c d;
        public long e;
        public boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.z zVar, Object obj) {
            this.b = zVar;
            this.c = obj;
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
            if (this.f) {
                return;
            }
            this.f = true;
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            T t = this.c;
            if (t != null) {
                zVar.onSuccess(t);
            } else {
                zVar.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.f = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            long j = this.e;
            if (j != 0) {
                this.e = j + 1;
                return;
            }
            this.f = true;
            this.d.dispose();
            this.b.onSuccess(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(io.reactivex.rxjava3.core.q qVar, Object obj) {
        this.b = qVar;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<T> b() {
        return new d0(this.b, this.c, true);
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
