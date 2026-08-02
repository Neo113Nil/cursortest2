package com.yandex.div.core.timer;

import android.os.SystemClock;
import defpackage.i3y;
import defpackage.l6o;
import defpackage.nz;
import defpackage.rer;
import defpackage.sls;
import defpackage.t0z0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes11.dex */
public final class a {
    public final String a;
    public final tls b;
    public final tls c;
    public final tls d;
    public final tls e;
    public final l6o f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public long l;
    public Ticker$State k = Ticker$State.STOPPED;
    public long m = -1;
    public long n = -1;
    public final i3y o = kotlin.a.b(LazyThreadSafetyMode.NONE, Ticker$timer$2.w);

    public a(String str, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, l6o l6oVar) {
        this.a = str;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.d = tlsVar3;
        this.e = tlsVar4;
        this.f = l6oVar;
    }

    public final void a() {
        int i = t0z0.a[this.k.ordinal()];
        if (i == 2 || i == 3) {
            this.k = Ticker$State.STOPPED;
            b();
            ((TimerController$ticker$1) this.b).invoke(Long.valueOf(d()));
            f();
        }
    }

    public final void b() {
        ((rer) this.o.getValue()).a.removeCallbacksAndMessages(null);
    }

    public final void c() {
        Long l = this.g;
        tls tlsVar = this.e;
        if (l == null) {
            ((TimerController$ticker$4) tlsVar).invoke(Long.valueOf(d()));
            return;
        }
        long d = d();
        long longValue = l.longValue();
        if (d > longValue) {
            d = longValue;
        }
        ((TimerController$ticker$4) tlsVar).invoke(Long.valueOf(d));
    }

    public final long d() {
        return (this.m == -1 ? 0L : SystemClock.elapsedRealtime() - this.m) + this.l;
    }

    public final void e(String str) {
        this.f.e(new IllegalArgumentException(str));
    }

    public final void f() {
        this.m = -1L;
        this.n = -1L;
        this.l = 0L;
    }

    public final void g() {
        Long l = this.j;
        Long l2 = this.i;
        if (l != null && this.n != -1 && SystemClock.elapsedRealtime() - this.n > l.longValue()) {
            c();
        }
        if (l == null && l2 != null) {
            final long longValue = l2.longValue();
            long d = longValue - d();
            if (d >= 0) {
                i(d, d, new sls() { // from class: com.yandex.div.core.timer.Ticker$runCountDownTimer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        a.this.b();
                        ((TimerController$ticker$3) a.this.d).invoke(Long.valueOf(longValue));
                        a aVar = a.this;
                        aVar.k = Ticker$State.STOPPED;
                        aVar.f();
                        return zy11.a;
                    }
                });
                return;
            } else {
                ((TimerController$ticker$3) this.d).invoke(l2);
                f();
                return;
            }
        }
        if (l == null || l2 == null) {
            if (l == null || l2 != null) {
                return;
            }
            long longValue2 = l.longValue();
            i(longValue2, longValue2 - (d() % longValue2), new sls() { // from class: com.yandex.div.core.timer.Ticker$runEndlessTimer$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a.this.c();
                    return zy11.a;
                }
            });
            return;
        }
        final long longValue3 = l2.longValue();
        final long longValue4 = l.longValue();
        long d2 = longValue4 - (d() % longValue4);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = (longValue3 / longValue4) - (d() / longValue4);
        final sls slsVar = new sls() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$processTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                if (Ref$LongRef.this.element > 0) {
                    ((TimerController$ticker$4) this.e).invoke(Long.valueOf(longValue3));
                }
                ((TimerController$ticker$3) this.d).invoke(Long.valueOf(longValue3));
                this.b();
                this.f();
                this.k = Ticker$State.STOPPED;
                return zy11.a;
            }
        };
        i(longValue4, d2, new sls() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                long d3 = longValue3 - this.d();
                this.c();
                Ref$LongRef ref$LongRef2 = ref$LongRef;
                ref$LongRef2.element--;
                if (1 <= d3 && d3 < longValue4) {
                    this.b();
                    a aVar = this;
                    final sls slsVar2 = slsVar;
                    aVar.i(d3, d3, new sls() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1.1
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            sls.this.invoke();
                            return zy11.a;
                        }
                    });
                } else if (d3 <= 0) {
                    slsVar.invoke();
                }
                return zy11.a;
            }
        });
    }

    public final void h() {
        if (this.m != -1) {
            this.l += SystemClock.elapsedRealtime() - this.m;
            this.n = SystemClock.elapsedRealtime();
            this.m = -1L;
        }
        b();
    }

    public final void i(long j, long j2, sls slsVar) {
        this.m = SystemClock.elapsedRealtime();
        rer rerVar = (rer) this.o.getValue();
        rerVar.a.postDelayed(new nz(rerVar, j, slsVar, 2), j2);
    }

    public final void j() {
        int i = t0z0.a[this.k.ordinal()];
        if (i == 1) {
            b();
            this.i = this.g;
            this.j = this.h;
            this.k = Ticker$State.WORKING;
            ((TimerController$ticker$2) this.c).invoke(Long.valueOf(d()));
            g();
            return;
        }
        String str = this.a;
        if (i == 2) {
            e("The timer '" + str + "' already working!");
            return;
        }
        if (i != 3) {
            return;
        }
        e("The timer '" + str + "' paused!");
    }
}
