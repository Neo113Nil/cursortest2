package com.yandex.plus.experiments.api.cooldown;

import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.zhf;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public abstract class a {
    public final zhf a;
    public final long b;

    public a(zhf zhfVar) {
        o430 o430Var = e3n.b;
        long U = kp50.U(24, DurationUnit.HOURS);
        this.a = zhfVar;
        this.b = U;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(a aVar, long j, ContinuationImpl continuationImpl) {
        BasePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1 basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        long j3;
        e3n e3nVar;
        e3n e3nVar2;
        e3n e3nVar3;
        long k;
        a aVar2 = aVar;
        if (continuationImpl instanceof BasePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1) {
            basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1 = (BasePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1) continuationImpl;
            int i2 = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    long a = aVar2.a.a();
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.L$0 = aVar2;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$0 = j;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$1 = a;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label = 1;
                    obj = aVar2.a(basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1);
                    if (obj != coroutineSingletons) {
                        j2 = a;
                        j3 = j;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                j2 = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$1;
                j3 = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$0;
                aVar2 = (a) basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.L$0;
                b.b(obj);
                e3nVar = (e3n) obj;
                e3nVar2 = new e3n(j3);
                e3nVar3 = new e3n(aVar2.b);
                if (e3nVar2.compareTo(e3nVar3) > 0) {
                    e3nVar2 = e3nVar3;
                }
                k = e3n.k(j2, e3nVar2.a);
                if (e3nVar != null || e3n.c(e3nVar.a, k) < 0) {
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.L$0 = null;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.L$1 = null;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$0 = j3;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$1 = j2;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$2 = k;
                    basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label = 2;
                    if (aVar2.c(k, basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1 = new BasePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1(aVar2, continuationImpl);
        Object obj2 = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        e3nVar = (e3n) obj2;
        e3nVar2 = new e3n(j3);
        e3nVar3 = new e3n(aVar2.b);
        if (e3nVar2.compareTo(e3nVar3) > 0) {
        }
        k = e3n.k(j2, e3nVar2.a);
        if (e3nVar != null) {
        }
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.L$0 = null;
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.L$1 = null;
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$0 = j3;
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$1 = j2;
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.J$2 = k;
        basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1.label = 2;
        if (aVar2.c(k, basePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1) != coroutineSingletons) {
            return zy11Var2;
        }
    }

    public abstract Object a(ContinuationImpl continuationImpl);

    public abstract Object b(ContinuationImpl continuationImpl);

    public abstract Object c(long j, ContinuationImpl continuationImpl);
}
