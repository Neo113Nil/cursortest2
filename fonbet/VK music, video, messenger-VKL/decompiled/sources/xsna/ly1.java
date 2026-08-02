package xsna;

import android.os.SystemClock;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnalyticsSendingTimestampRepository.kt */
/* loaded from: classes5.dex */
public final class ly1 {
    public final iy1 a;

    public ly1(iy1 iy1Var) {
        this.a = iy1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        jy1 jy1Var;
        int i;
        Object a;
        if (continuationImpl instanceof jy1) {
            jy1Var = (jy1) continuationImpl;
            int i2 = jy1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jy1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = jy1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jy1Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    jy1Var.label = 1;
                    a = this.a.a(jy1Var);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    a = ((Result) obj).d();
                }
                if (!(a instanceof Result.Failure)) {
                    try {
                        a = new Long(Long.parseLong((String) a));
                    } catch (Throwable th) {
                        a = new Result.Failure(th);
                    }
                }
                return !(a instanceof Result.Failure) ? new Long(0L) : a;
            }
        }
        jy1Var = new jy1(this, continuationImpl);
        Object obj2 = jy1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jy1Var.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ky1 ky1Var;
        int i;
        if (continuationImpl instanceof ky1) {
            ky1Var = (ky1) continuationImpl;
            int i2 = ky1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ky1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ky1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ky1Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String valueOf = String.valueOf(SystemClock.elapsedRealtime());
                    ky1Var.label = 1;
                    if (this.a.b(valueOf, ky1Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    ((Result) obj).getClass();
                }
                return s3q0.a;
            }
        }
        ky1Var = new ky1(this, continuationImpl);
        Object obj2 = ky1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ky1Var.label;
        if (i != 0) {
        }
        return s3q0.a;
    }
}
