package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: ObservableScan.java */
/* loaded from: classes8.dex */
public final class e2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final com.vk.movika.sdk.android.defaultplayer.interactive.c c;

    /* compiled from: ObservableScan.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final io.reactivex.rxjava3.functions.c<T, T, T> c;
        public io.reactivex.rxjava3.disposables.c d;
        public T e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.v vVar, com.vk.movika.sdk.android.defaultplayer.interactive.c cVar) {
            this.b = vVar;
            this.c = cVar;
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
            this.b.onComplete();
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

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            T t2 = this.e;
            io.reactivex.rxjava3.core.v<? super T> vVar = this.b;
            if (t2 == null) {
                this.e = t;
                vVar.onNext(t);
                return;
            }
            try {
                T apply = this.c.apply(t2, t);
                Objects.requireNonNull(apply, "The value returned by the accumulator is null");
                this.e = apply;
                vVar.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public e2(io.reactivex.rxjava3.core.t tVar, com.vk.movika.sdk.android.defaultplayer.interactive.c cVar) {
        super(tVar);
        this.c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
