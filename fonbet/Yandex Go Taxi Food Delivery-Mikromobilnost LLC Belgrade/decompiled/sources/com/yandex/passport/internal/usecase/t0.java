package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class t0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.common.coroutine.a b;
    public final com.yandex.passport.common.c c;
    public final com.yandex.passport.internal.report.reporters.o0 d;
    public final SharedPreferences e;

    public t0(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.c cVar, com.yandex.passport.internal.report.reporters.o0 o0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = aVar;
        this.c = cVar;
        this.d = o0Var;
        this.e = context.getSharedPreferences("passport_init", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(7:24|25|(3:30|(2:32|33)|23)|34|(1:36)|37|(2:39|22))|18|(1:20)|(1:22)(1:23)))|44|6|7|(0)(0)|18|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r1 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.LogLevel.INFO, null, "Error PassportInitReport: " + r0, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.api.w1 w1Var, ContinuationImpl continuationImpl) {
        LimitedPassportInitReportUseCase$run$1 limitedPassportInitReportUseCase$run$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object k0;
        t0 t0Var = this;
        com.yandex.passport.internal.report.reporters.o0 o0Var = t0Var.d;
        if (continuationImpl instanceof LimitedPassportInitReportUseCase$run$1) {
            limitedPassportInitReportUseCase$run$1 = (LimitedPassportInitReportUseCase$run$1) continuationImpl;
            int i2 = limitedPassportInitReportUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                limitedPassportInitReportUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = limitedPassportInitReportUseCase$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = limitedPassportInitReportUseCase$run$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long j = t0Var.e.getLong("last_update", 0L);
                    ((com.yandex.passport.common.a) t0Var.c).getClass();
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 86400000) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Last PassportInitReport was earlier than 1 day ago", 8);
                            return zy11Var;
                        }
                    }
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Starting PassportInitReport", 8);
                    }
                    o0Var.q(w1Var);
                    limitedPassportInitReportUseCase$run$1.L$0 = t0Var;
                    limitedPassportInitReportUseCase$run$1.label = 1;
                    if (o0Var.p(limitedPassportInitReportUseCase$run$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t0Var = (t0) limitedPassportInitReportUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                t0Var.d.r();
                limitedPassportInitReportUseCase$run$1.L$0 = null;
                limitedPassportInitReportUseCase$run$1.label = 2;
                k0 = tje.k0(((com.yandex.passport.common.coroutine.b) t0Var.b).d, new LimitedPassportInitReportUseCase$refreshLastUpdate$2(t0Var, null), limitedPassportInitReportUseCase$run$1);
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
                return k0 != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        limitedPassportInitReportUseCase$run$1 = new LimitedPassportInitReportUseCase$run$1(t0Var, continuationImpl);
        Object obj2 = limitedPassportInitReportUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = limitedPassportInitReportUseCase$run$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        t0Var.d.r();
        limitedPassportInitReportUseCase$run$1.L$0 = null;
        limitedPassportInitReportUseCase$run$1.label = 2;
        k0 = tje.k0(((com.yandex.passport.common.coroutine.b) t0Var.b).d, new LimitedPassportInitReportUseCase$refreshLastUpdate$2(t0Var, null), limitedPassportInitReportUseCase$run$1);
        if (k0 != coroutineSingletons) {
        }
        if (k0 != coroutineSingletons) {
        }
    }
}
