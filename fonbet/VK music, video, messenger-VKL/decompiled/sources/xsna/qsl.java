package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: Delay.kt */
/* loaded from: classes11.dex */
public final class qsl {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(ContinuationImpl continuationImpl) {
        psl pslVar;
        int i;
        if (continuationImpl instanceof psl) {
            pslVar = (psl) continuationImpl;
            int i2 = pslVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pslVar.label = i2 - Integer.MIN_VALUE;
                Object obj = pslVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pslVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    pslVar.label = 1;
                    lq9 lq9Var = new lq9(1, s7s0.c(pslVar));
                    lq9Var.o();
                    if (lq9Var.n() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        pslVar = new psl(continuationImpl);
        Object obj2 = pslVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pslVar.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    public static final Object b(long j, spj<? super s3q0> spjVar) {
        if (j <= 0) {
            return s3q0.a;
        }
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        if (j < Long.MAX_VALUE) {
            d(lq9Var.f).s(j, lq9Var);
        }
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    public static final Object c(long j, ContinuationImpl continuationImpl) {
        Object b = b(e(j), continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public static final osl d(kotlin.coroutines.d dVar) {
        d.b bVar = dVar.get(c.a.b);
        osl oslVar = bVar instanceof osl ? (osl) bVar : null;
        return oslVar == null ? rel.a : oslVar;
    }

    public static final long e(long j) {
        zno.a aVar = zno.c;
        boolean z = j > 0;
        if (z) {
            return zno.e(zno.i(j, eoo.f(999999L, DurationUnit.NANOSECONDS)));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
