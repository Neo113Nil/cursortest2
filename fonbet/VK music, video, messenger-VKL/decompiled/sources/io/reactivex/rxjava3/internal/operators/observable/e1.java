package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.k;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableInterval.java */
/* loaded from: classes11.dex */
public final class e1 extends io.reactivex.rxjava3.core.q<Long> {
    public final io.reactivex.rxjava3.core.w b;
    public final long c;
    public final long d;
    public final TimeUnit e;

    /* compiled from: ObservableInterval.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final io.reactivex.rxjava3.core.v<? super Long> downstream;

        public a(io.reactivex.rxjava3.core.v<? super Long> vVar) {
            this.downstream = vVar;
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
            if (get() != DisposableHelper.DISPOSED) {
                io.reactivex.rxjava3.core.v<? super Long> vVar = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                vVar.onNext(Long.valueOf(j));
            }
        }
    }

    public e1(long j, long j2, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.b = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Long> vVar) {
        a aVar = new a(vVar);
        vVar.onSubscribe(aVar);
        io.reactivex.rxjava3.core.w wVar = this.b;
        if (!(wVar instanceof io.reactivex.rxjava3.internal.schedulers.k)) {
            DisposableHelper.e(aVar, wVar.e(aVar, this.c, this.d, this.e));
        } else {
            ((io.reactivex.rxjava3.internal.schedulers.k) wVar).getClass();
            k.c cVar = new k.c();
            DisposableHelper.e(aVar, cVar);
            cVar.c(aVar, this.c, this.d, this.e);
        }
    }
}
