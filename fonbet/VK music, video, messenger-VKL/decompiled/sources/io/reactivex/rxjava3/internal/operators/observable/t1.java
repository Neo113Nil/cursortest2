package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* compiled from: ObservableRange.java */
/* loaded from: classes8.dex */
public final class t1 extends io.reactivex.rxjava3.core.q<Integer> {
    public final int b;
    public final long c;

    /* compiled from: ObservableRange.java */
    public static final class a extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final io.reactivex.rxjava3.core.v<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        public a(io.reactivex.rxjava3.core.v<? super Integer> vVar, long j, long j2) {
            this.downstream = vVar;
            this.index = j;
            this.end = j2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            this.fused = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() != 0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final Object poll() throws Throwable {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public t1(int i, int i2) {
        this.b = i;
        this.c = i + i2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Integer> vVar) {
        a aVar = new a(vVar, this.b, this.c);
        vVar.onSubscribe(aVar);
        if (aVar.fused) {
            return;
        }
        io.reactivex.rxjava3.core.v<? super Integer> vVar2 = aVar.downstream;
        long j = aVar.end;
        for (long j2 = aVar.index; j2 != j && aVar.get() == 0; j2++) {
            vVar2.onNext(Integer.valueOf((int) j2));
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            vVar2.onComplete();
        }
    }
}
