package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: RxAnimators.kt */
/* loaded from: classes16.dex */
public final class fte0 extends psg0 {
    public final float c;
    public final float d;
    public final long e;

    /* compiled from: RxAnimators.kt */
    public static final class a extends io.reactivex.rxjava3.observers.a<Long> {
        public final /* synthetic */ io.reactivex.rxjava3.core.v<? super Float> c;
        public final /* synthetic */ fte0 d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;

        public a(io.reactivex.rxjava3.core.v<? super Float> vVar, fte0 fte0Var, float f, float f2) {
            this.c = vVar;
            this.d = fte0Var;
            this.e = f;
            this.f = f2;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            io.reactivex.rxjava3.core.v<? super Float> vVar = this.c;
            if (vVar != null) {
                vVar.onNext(Float.valueOf(this.d.d));
            }
            if (vVar != null) {
                vVar.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.v<? super Float> vVar = this.c;
            if (vVar != null) {
                vVar.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            float longValue = (((Number) obj).longValue() * this.f) + this.e;
            io.reactivex.rxjava3.core.v<? super Float> vVar = this.c;
            if (vVar != null) {
                vVar.onNext(Float.valueOf(longValue));
            }
        }
    }

    public fte0(long j, float f, float f2) {
        this.c = f;
        this.d = f2;
        this.e = j;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Float> vVar) {
        vVar.onSubscribe(this);
        long j = this.e / 25;
        float f = this.d;
        float f2 = this.c;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = io.reactivex.rxjava3.core.q.S(0L, j, 0L, 25L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        a aVar = new a(vVar, this, f2, (f - f2) / j);
        a0.subscribe(aVar);
        this.b = aVar;
    }
}
