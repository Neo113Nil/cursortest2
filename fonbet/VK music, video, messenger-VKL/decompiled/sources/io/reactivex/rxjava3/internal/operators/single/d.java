package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* compiled from: SingleDelay.java */
/* loaded from: classes8.dex */
public final class d<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;
    public final boolean f;

    /* compiled from: SingleDelay.java */
    public final class a implements io.reactivex.rxjava3.core.z<T> {
        public final SequentialDisposable b;
        public final io.reactivex.rxjava3.core.z<? super T> c;

        /* compiled from: SingleDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.d$a$a, reason: collision with other inner class name */
        public final class RunnableC2153a implements Runnable {
            public final Throwable b;

            public RunnableC2153a(Throwable th) {
                this.b = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.c.onError(this.b);
            }
        }

        /* compiled from: SingleDelay.java */
        public final class b implements Runnable {
            public final T b;

            public b(T t) {
                this.b = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.c.onSuccess(this.b);
            }
        }

        public a(SequentialDisposable sequentialDisposable, io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = sequentialDisposable;
            this.c = zVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            d dVar = d.this;
            DisposableHelper.c(this.b, dVar.e.d(new RunnableC2153a(th), dVar.f ? dVar.c : 0L, dVar.d));
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.b;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            d dVar = d.this;
            DisposableHelper.c(this.b, dVar.e.d(new b(t), dVar.c, dVar.d));
        }
    }

    public d(io.reactivex.rxjava3.core.x xVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, boolean z) {
        this.b = xVar;
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
        this.f = z;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        zVar.onSubscribe(sequentialDisposable);
        this.b.subscribe(new a(sequentialDisposable, zVar));
    }
}
