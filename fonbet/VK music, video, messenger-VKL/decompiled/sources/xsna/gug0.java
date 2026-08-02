package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: RxAnimators.kt */
/* loaded from: classes16.dex */
public final class gug0 extends psg0 {
    public final float c;
    public final float d;
    public final long e;
    public final long f = 25;

    /* compiled from: RxAnimators.kt */
    public static final class a extends io.reactivex.rxjava3.observers.a<Long> {
        public final /* synthetic */ float d;
        public final /* synthetic */ io.reactivex.rxjava3.core.v<? super Float> e;

        public a(float f, io.reactivex.rxjava3.core.v<? super Float> vVar) {
            this.d = f;
            this.e = vVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            io.reactivex.rxjava3.core.v<? super Float> vVar = this.e;
            if (vVar != null) {
                vVar.onNext(Float.valueOf(gug0.this.d));
                vVar.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.v<? super Float> vVar = this.e;
            if (vVar != null) {
                vVar.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            float longValue = (((Number) obj).longValue() * this.d) + gug0.this.c;
            io.reactivex.rxjava3.core.v<? super Float> vVar = this.e;
            if (vVar != null) {
                vVar.onNext(Float.valueOf(longValue));
            }
        }
    }

    public gug0(long j, float f, float f2) {
        this.c = f;
        this.d = f2;
        this.e = j;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Float> vVar) {
        vVar.onSubscribe(this);
        float f = this.d;
        float f2 = this.c;
        float abs = Math.abs(f - f2);
        float f3 = this.e;
        long b = an10.b(abs * f3);
        long j = this.f;
        float f4 = (j / f3) * (f2 > f ? -1 : 1);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = io.reactivex.rxjava3.core.q.S(0L, b / j, 0L, j, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        a aVar = new a(f4, vVar);
        a0.subscribe(aVar);
        this.b = aVar;
    }
}
