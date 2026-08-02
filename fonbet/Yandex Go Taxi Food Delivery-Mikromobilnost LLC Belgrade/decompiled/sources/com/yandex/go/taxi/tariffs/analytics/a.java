package com.yandex.go.taxi.tariffs.analytics;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1 tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof TariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1) {
            tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1 = (TariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.navigation.screen.c cVar = this.b.b;
                    if (cVar.e() || cVar.h() || cVar.f()) {
                        tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1 = new TariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
