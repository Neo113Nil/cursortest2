package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class s0 extends com.yandex.passport.common.domain.d {
    public final Context b;
    public final com.yandex.passport.common.coroutine.a c;
    public final com.yandex.passport.internal.report.reporters.u d;
    public final SharedPreferences e;

    public s0(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.report.reporters.u uVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = context;
        this.c = aVar;
        this.d = uVar;
        this.e = context.getSharedPreferences("passport_dependencies", 0);
    }

    @Override // com.yandex.passport.common.domain.d
    public final /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
        return c(continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(2:10|11)(2:13|14))(4:15|16|(5:18|(1:20)|21|(1:23)(1:27)|(1:25))(2:28|(2:30|31))|26)))|36|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        r15 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.LogLevel.INFO, null, "Error DependenciesReport: " + r14, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        LimitedDependenciesReportUseCase$run$1 limitedDependenciesReportUseCase$run$1;
        int i;
        Context context = this.b;
        if (continuation instanceof LimitedDependenciesReportUseCase$run$1) {
            limitedDependenciesReportUseCase$run$1 = (LimitedDependenciesReportUseCase$run$1) continuation;
            int i2 = limitedDependenciesReportUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                limitedDependenciesReportUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = limitedDependenciesReportUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = limitedDependenciesReportUseCase$run$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                long longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
                if (this.e.getLong("last_version", -1L) < longVersionCode) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Starting DependenciesReport " + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode(), 8);
                    }
                    this.d.k(longVersionCode);
                    limitedDependenciesReportUseCase$run$1.label = 1;
                    Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) this.c).d, new LimitedDependenciesReportUseCase$refreshLastUpdate$2(this, longVersionCode, null), limitedDependenciesReportUseCase$run$1);
                    if (k0 != coroutineSingletons) {
                        k0 = zy11Var;
                    }
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Library versions in the current version have already been sent", 8);
                        return zy11Var;
                    }
                }
                return zy11Var;
            }
        }
        limitedDependenciesReportUseCase$run$1 = new LimitedDependenciesReportUseCase$run$1(this, (ContinuationImpl) continuation);
        Object obj2 = limitedDependenciesReportUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = limitedDependenciesReportUseCase$run$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
