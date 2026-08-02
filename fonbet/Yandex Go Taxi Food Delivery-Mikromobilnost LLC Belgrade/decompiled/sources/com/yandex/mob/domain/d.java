package com.yandex.mob.domain;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.jr20;
import defpackage.ny61;
import defpackage.un20;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public final com.yandex.mob.cron.a a;
    public final com.yandex.mob.cron.a b;
    public final com.yandex.mob.datastore.d c;
    public final jr20 d;
    public final un20 e;
    public final a f;
    public final c g;

    public d(com.yandex.mob.cron.a aVar, com.yandex.mob.cron.a aVar2, com.yandex.mob.datastore.d dVar, jr20 jr20Var, un20 un20Var, a aVar3, c cVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = dVar;
        this.d = jr20Var;
        this.e = un20Var;
        this.f = aVar3;
        this.g = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r9.i((defpackage.ha4) r14, r6) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName, MobTrigger mobTrigger, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        AvailabilityReportUseCase$executeAvailabilityCheck$1 availabilityReportUseCase$executeAvailabilityCheck$1;
        int i;
        boolean z3;
        boolean z4;
        dVar.getClass();
        if (continuationImpl instanceof AvailabilityReportUseCase$executeAvailabilityCheck$1) {
            availabilityReportUseCase$executeAvailabilityCheck$1 = (AvailabilityReportUseCase$executeAvailabilityCheck$1) continuationImpl;
            int i2 = availabilityReportUseCase$executeAvailabilityCheck$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availabilityReportUseCase$executeAvailabilityCheck$1.label = i2 - Integer.MIN_VALUE;
                AvailabilityReportUseCase$executeAvailabilityCheck$1 availabilityReportUseCase$executeAvailabilityCheck$12 = availabilityReportUseCase$executeAvailabilityCheck$1;
                Object obj = availabilityReportUseCase$executeAvailabilityCheck$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityReportUseCase$executeAvailabilityCheck$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = dVar.f;
                    availabilityReportUseCase$executeAvailabilityCheck$12.L$0 = null;
                    availabilityReportUseCase$executeAvailabilityCheck$12.L$1 = null;
                    availabilityReportUseCase$executeAvailabilityCheck$12.Z$0 = z;
                    availabilityReportUseCase$executeAvailabilityCheck$12.Z$1 = z2;
                    availabilityReportUseCase$executeAvailabilityCheck$12.label = 1;
                    obj = aVar.a(mobAvailabilityCheckStrategyName, mobTrigger, z, z2, availabilityReportUseCase$executeAvailabilityCheck$12);
                    if (obj != coroutineSingletons) {
                        z3 = z;
                        z4 = z2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                z4 = availabilityReportUseCase$executeAvailabilityCheck$12.Z$1;
                z3 = availabilityReportUseCase$executeAvailabilityCheck$12.Z$0;
                kotlin.b.b(obj);
                c cVar = dVar.g;
                availabilityReportUseCase$executeAvailabilityCheck$12.L$0 = null;
                availabilityReportUseCase$executeAvailabilityCheck$12.L$1 = null;
                availabilityReportUseCase$executeAvailabilityCheck$12.L$2 = null;
                availabilityReportUseCase$executeAvailabilityCheck$12.Z$0 = z3;
                availabilityReportUseCase$executeAvailabilityCheck$12.Z$1 = z4;
                availabilityReportUseCase$executeAvailabilityCheck$12.label = 2;
            }
        }
        availabilityReportUseCase$executeAvailabilityCheck$1 = new AvailabilityReportUseCase$executeAvailabilityCheck$1(dVar, continuationImpl);
        AvailabilityReportUseCase$executeAvailabilityCheck$1 availabilityReportUseCase$executeAvailabilityCheck$122 = availabilityReportUseCase$executeAvailabilityCheck$1;
        Object obj2 = availabilityReportUseCase$executeAvailabilityCheck$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityReportUseCase$executeAvailabilityCheck$122.label;
        if (i != 0) {
        }
        c cVar2 = dVar.g;
        availabilityReportUseCase$executeAvailabilityCheck$122.L$0 = null;
        availabilityReportUseCase$executeAvailabilityCheck$122.L$1 = null;
        availabilityReportUseCase$executeAvailabilityCheck$122.L$2 = null;
        availabilityReportUseCase$executeAvailabilityCheck$122.Z$0 = z3;
        availabilityReportUseCase$executeAvailabilityCheck$122.Z$1 = z4;
        availabilityReportUseCase$executeAvailabilityCheck$122.label = 2;
    }

    public final void b() {
        AvailabilityReportUseCase$recoverIncompleteChecks$1 availabilityReportUseCase$recoverIncompleteChecks$1 = new AvailabilityReportUseCase$recoverIncompleteChecks$1(this, null);
        jr20 jr20Var = this.d;
        jr20.b(jr20Var, null, availabilityReportUseCase$recoverIncompleteChecks$1, 3);
        jr20.b(jr20Var, null, new AvailabilityReportUseCase$subscribeOnContourChanges$1(this, null), 3);
        this.a.e(new AvailabilityReportUseCase$schedulePeriodicChecks$1(this, null));
        this.b.e(new AvailabilityReportUseCase$schedulePeriodicChecks$2(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MobTrigger mobTrigger, boolean z, boolean z2, Continuation continuation) {
        AvailabilityReportUseCase$invoke$1 availabilityReportUseCase$invoke$1;
        int i;
        Object f;
        if (continuation instanceof AvailabilityReportUseCase$invoke$1) {
            availabilityReportUseCase$invoke$1 = (AvailabilityReportUseCase$invoke$1) continuation;
            int i2 = availabilityReportUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availabilityReportUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = availabilityReportUseCase$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityReportUseCase$invoke$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AvailabilityReportUseCase$invoke$2 availabilityReportUseCase$invoke$2 = new AvailabilityReportUseCase$invoke$2(this, mobTrigger, z, z2, null);
                    availabilityReportUseCase$invoke$1.L$0 = null;
                    availabilityReportUseCase$invoke$1.Z$0 = z;
                    availabilityReportUseCase$invoke$1.Z$1 = z2;
                    availabilityReportUseCase$invoke$1.label = 1;
                    f = this.a.f(mobTrigger, availabilityReportUseCase$invoke$2, availabilityReportUseCase$invoke$1);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    f = ((Result) obj).getValue();
                }
                return Boolean.valueOf(!(f instanceof Result.Failure));
            }
        }
        availabilityReportUseCase$invoke$1 = new AvailabilityReportUseCase$invoke$1(this, continuation);
        Object obj2 = availabilityReportUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityReportUseCase$invoke$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!(f instanceof Result.Failure));
    }
}
