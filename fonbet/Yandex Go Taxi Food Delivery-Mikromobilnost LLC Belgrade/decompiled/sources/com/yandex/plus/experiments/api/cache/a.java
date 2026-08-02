package com.yandex.plus.experiments.api.cache;

import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.q1d0;
import defpackage.zhf;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public abstract class a {
    public final zhf a;
    public final long b;

    public a(zhf zhfVar, long j) {
        this.a = zhfVar;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(a aVar, ContinuationImpl continuationImpl) {
        BasePlusExperimentsCache$getEmptyExperiments$1 basePlusExperimentsCache$getEmptyExperiments$1;
        int i;
        if (continuationImpl instanceof BasePlusExperimentsCache$getEmptyExperiments$1) {
            basePlusExperimentsCache$getEmptyExperiments$1 = (BasePlusExperimentsCache$getEmptyExperiments$1) continuationImpl;
            int i2 = basePlusExperimentsCache$getEmptyExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basePlusExperimentsCache$getEmptyExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basePlusExperimentsCache$getEmptyExperiments$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePlusExperimentsCache$getEmptyExperiments$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q1d0 q1d0Var = (q1d0) basePlusExperimentsCache$getEmptyExperiments$1.L$1;
                    b.b(obj);
                    return q1d0Var;
                }
                b.b(obj);
                long a = aVar.a.a();
                long k = e3n.k(e3n.k(a, e3n.q(aVar.b)), kp50.U(15, DurationUnit.MINUTES));
                q1d0 q1d0Var2 = new q1d0(null, null, null, null, k);
                basePlusExperimentsCache$getEmptyExperiments$1.L$0 = null;
                basePlusExperimentsCache$getEmptyExperiments$1.L$1 = q1d0Var2;
                basePlusExperimentsCache$getEmptyExperiments$1.L$2 = null;
                basePlusExperimentsCache$getEmptyExperiments$1.J$0 = a;
                basePlusExperimentsCache$getEmptyExperiments$1.J$1 = k;
                basePlusExperimentsCache$getEmptyExperiments$1.I$0 = 0;
                basePlusExperimentsCache$getEmptyExperiments$1.label = 1;
                return aVar.e(q1d0Var2, basePlusExperimentsCache$getEmptyExperiments$1) == obj2 ? obj2 : q1d0Var2;
            }
        }
        basePlusExperimentsCache$getEmptyExperiments$1 = new BasePlusExperimentsCache$getEmptyExperiments$1(aVar, continuationImpl);
        Object obj3 = basePlusExperimentsCache$getEmptyExperiments$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePlusExperimentsCache$getEmptyExperiments$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(a aVar, ContinuationImpl continuationImpl) {
        BasePlusExperimentsCache$getNotExpiredExperiments$1 basePlusExperimentsCache$getNotExpiredExperiments$1;
        int i;
        q1d0 q1d0Var;
        if (continuationImpl instanceof BasePlusExperimentsCache$getNotExpiredExperiments$1) {
            basePlusExperimentsCache$getNotExpiredExperiments$1 = (BasePlusExperimentsCache$getNotExpiredExperiments$1) continuationImpl;
            int i2 = basePlusExperimentsCache$getNotExpiredExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basePlusExperimentsCache$getNotExpiredExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basePlusExperimentsCache$getNotExpiredExperiments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePlusExperimentsCache$getNotExpiredExperiments$1.label;
                if (i != 0) {
                    b.b(obj);
                    basePlusExperimentsCache$getNotExpiredExperiments$1.L$0 = aVar;
                    basePlusExperimentsCache$getNotExpiredExperiments$1.label = 1;
                    obj = aVar.c(basePlusExperimentsCache$getNotExpiredExperiments$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) basePlusExperimentsCache$getNotExpiredExperiments$1.L$0;
                    b.b(obj);
                }
                q1d0Var = (q1d0) obj;
                if (q1d0Var != null) {
                    long a = aVar.a.a();
                    long j = q1d0Var.e;
                    if (e3n.c(j, e3n.k(a, e3n.q(aVar.b))) > 0 && e3n.c(j, a) < 0) {
                        return q1d0Var;
                    }
                }
                return null;
            }
        }
        basePlusExperimentsCache$getNotExpiredExperiments$1 = new BasePlusExperimentsCache$getNotExpiredExperiments$1(aVar, continuationImpl);
        Object obj2 = basePlusExperimentsCache$getNotExpiredExperiments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePlusExperimentsCache$getNotExpiredExperiments$1.label;
        if (i != 0) {
        }
        q1d0Var = (q1d0) obj2;
        if (q1d0Var != null) {
        }
        return null;
    }

    public abstract Object a(long j, Continuation continuation);

    public abstract Object c(ContinuationImpl continuationImpl);

    public abstract Object e(q1d0 q1d0Var, ContinuationImpl continuationImpl);
}
