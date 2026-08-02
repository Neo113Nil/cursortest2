package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.properties.UpdateableProperties;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.common.coroutine.a b;
    public final com.yandex.passport.common.c c;
    public final com.yandex.passport.internal.report.reporters.o0 d;
    public final SharedPreferences e;

    public u0(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.c cVar, com.yandex.passport.internal.report.reporters.o0 o0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = aVar;
        this.c = cVar;
        this.d = o0Var;
        this.e = context.getSharedPreferences("update_properties", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(2:10|11)(2:13|14))(8:15|16|(3:21|(2:23|24)|25)|26|(1:28)|29|(1:31)|(1:33)(1:25))))|38|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        r14 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.LogLevel.INFO, null, "Error ReportUpdatedProperties: " + r13, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UpdateableProperties updateableProperties, ContinuationImpl continuationImpl) {
        LimitedUpdatedPropertiesReportUseCase$run$1 limitedUpdatedPropertiesReportUseCase$run$1;
        int i;
        if (continuationImpl instanceof LimitedUpdatedPropertiesReportUseCase$run$1) {
            limitedUpdatedPropertiesReportUseCase$run$1 = (LimitedUpdatedPropertiesReportUseCase$run$1) continuationImpl;
            int i2 = limitedUpdatedPropertiesReportUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                limitedUpdatedPropertiesReportUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = limitedUpdatedPropertiesReportUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = limitedUpdatedPropertiesReportUseCase$run$1.label;
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
                long j = this.e.getLong("last_update", 0L);
                ((com.yandex.passport.common.a) this.c).getClass();
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis >= 0 && currentTimeMillis <= 86400000) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Last ReportUpdatedProperties was earlier than 1 day ago", 8);
                        return zy11Var;
                    }
                }
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Starting ReportUpdatedProperties", 8);
                }
                this.d.t(updateableProperties);
                limitedUpdatedPropertiesReportUseCase$run$1.label = 1;
                Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) this.b).d, new LimitedUpdatedPropertiesReportUseCase$refreshLastUpdate$2(this, null), limitedUpdatedPropertiesReportUseCase$run$1);
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
                return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        limitedUpdatedPropertiesReportUseCase$run$1 = new LimitedUpdatedPropertiesReportUseCase$run$1(this, continuationImpl);
        Object obj2 = limitedUpdatedPropertiesReportUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = limitedUpdatedPropertiesReportUseCase$run$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
