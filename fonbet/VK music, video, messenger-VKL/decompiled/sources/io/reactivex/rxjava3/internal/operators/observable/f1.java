package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.k;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableIntervalRange.java */
/* loaded from: classes8.dex */
public final class f1 extends io.reactivex.rxjava3.core.q<Long> {
    public final io.reactivex.rxjava3.core.w b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final TimeUnit g;

    /* compiled from: ObservableIntervalRange.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final io.reactivex.rxjava3.core.v<? super Long> downstream;
        final long end;

        public a(io.reactivex.rxjava3.core.v<? super Long> vVar, long j, long j2) {
            this.downstream = vVar;
            this.count = j;
            this.end = j2;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (h()) {
                return;
            }
            long j = this.count;
            this.downstream.onNext(Long.valueOf(j));
            if (j != this.end) {
                this.count = j + 1;
                return;
            }
            if (!h()) {
                this.downstream.onComplete();
            }
            DisposableHelper.a(this);
        }
    }

    public f1(long j, long j2, long j3, long j4, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.e = j3;
        this.f = j4;
        this.g = timeUnit;
        this.b = wVar;
        this.c = j;
        this.d = j2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Long> vVar) {
        a aVar = new a(vVar, this.c, this.d);
        vVar.onSubscribe(aVar);
        io.reactivex.rxjava3.core.w wVar = this.b;
        if (!(wVar instanceof io.reactivex.rxjava3.internal.schedulers.k)) {
            DisposableHelper.e(aVar, wVar.e(aVar, this.e, this.f, this.g));
        } else {
            ((io.reactivex.rxjava3.internal.schedulers.k) wVar).getClass();
            k.c cVar = new k.c();
            DisposableHelper.e(aVar, cVar);
            cVar.c(aVar, this.e, this.f, this.g);
        }
    }
}
