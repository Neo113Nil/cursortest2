package ru.ok.android.webrtc.utils.retry;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.observable.c2;
import io.reactivex.rxjava3.schedulers.a;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.c3v;
import xsna.f07;
import xsna.gz30;
import xsna.izs;
import xsna.j0r;
import xsna.jdz0;
import xsna.nc90;
import xsna.s3q0;
import xsna.wzs;
import xsna.zpb;

/* loaded from: classes9.dex */
public final class RetryKt {
    public static final boolean a(Throwable th) {
        return true;
    }

    public static final s3q0 b(Throwable th) {
        return s3q0.a;
    }

    public static final boolean c(Throwable th) {
        return true;
    }

    public static final s3q0 d(Throwable th) {
        return s3q0.a;
    }

    public static final <T> x<T> retryWithBackoff(x<T> xVar, Backoff backoff, izs<? super Throwable, Boolean> izsVar, wzs<? super Throwable, ? super Integer, s3q0> wzsVar, izs<? super Throwable, s3q0> izsVar2, w wVar) {
        return retryWithBackoff(xVar.w(), backoff, izsVar, wzsVar, izsVar2, wVar).m0();
    }

    public static /* synthetic */ x retryWithBackoff$default(x xVar, Backoff backoff, izs izsVar, wzs wzsVar, izs izsVar2, w wVar, int i, Object obj) {
        if ((i & 2) != 0) {
            izsVar = new nc90(10);
        }
        izs izsVar3 = izsVar;
        if ((i & 4) != 0) {
            wzsVar = new zpb((byte) 0, 8);
        }
        wzs wzsVar2 = wzsVar;
        if ((i & 8) != 0) {
            izsVar2 = new gz30(15);
        }
        izs izsVar4 = izsVar2;
        if ((i & 16) != 0) {
            wVar = a.a();
        }
        return retryWithBackoff(xVar, backoff, (izs<? super Throwable, Boolean>) izsVar3, (wzs<? super Throwable, ? super Integer, s3q0>) wzsVar2, (izs<? super Throwable, s3q0>) izsVar4, wVar);
    }

    public static final s3q0 a(Throwable th, int i) {
        return s3q0.a;
    }

    public static final s3q0 b(Throwable th, int i) {
        return s3q0.a;
    }

    public static final t a(izs izsVar, Backoff backoff, wzs wzsVar, w wVar, izs izsVar2, q qVar) {
        return qVar.L(new jdz0(izsVar, backoff, wzsVar, wVar, izsVar2), false);
    }

    public static final <T> q<T> retryWithBackoff(q<T> qVar, final Backoff backoff, final izs<? super Throwable, Boolean> izsVar, final wzs<? super Throwable, ? super Integer, s3q0> wzsVar, final izs<? super Throwable, s3q0> izsVar2, final w wVar) {
        l lVar = new l() { // from class: xsna.gfg0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return RetryKt.a(izs.this, backoff, wzsVar, wVar, izsVar2, (io.reactivex.rxjava3.core.q) obj);
            }
        };
        qVar.getClass();
        return new c2(qVar, lVar);
    }

    public static /* synthetic */ q retryWithBackoff$default(q qVar, Backoff backoff, izs izsVar, wzs wzsVar, izs izsVar2, w wVar, int i, Object obj) {
        if ((i & 2) != 0) {
            izsVar = new j0r(27);
        }
        izs izsVar3 = izsVar;
        if ((i & 4) != 0) {
            wzsVar = new f07((byte) 0, 10);
        }
        wzs wzsVar2 = wzsVar;
        if ((i & 8) != 0) {
            izsVar2 = new c3v(20);
        }
        izs izsVar4 = izsVar2;
        if ((i & 16) != 0) {
            wVar = a.a();
        }
        return retryWithBackoff(qVar, backoff, (izs<? super Throwable, Boolean>) izsVar3, (wzs<? super Throwable, ? super Integer, s3q0>) wzsVar2, (izs<? super Throwable, s3q0>) izsVar4, wVar);
    }
}
