package com.yandex.go.tariffcard.experiment;

import defpackage.ny61;
import defpackage.o9u;
import defpackage.p9u;
import defpackage.q9u;
import defpackage.rib1;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wiv0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1 summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1;
        int i;
        Object singletonList;
        Object p9uVar;
        if (continuation instanceof SummaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1) {
            summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1 = (SummaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SummaryOptionsTariffCardExperiment summaryOptionsTariffCardExperiment = (SummaryOptionsTariffCardExperiment) obj;
                    if (summaryOptionsTariffCardExperiment.q) {
                        List<HeaderGradientConfigDto> list = summaryOptionsTariffCardExperiment.r;
                        singletonList = new ArrayList(tcc.n(list, 10));
                        for (HeaderGradientConfigDto headerGradientConfigDto : list) {
                            GradientTypeDto gradientTypeDto = headerGradientConfigDto.a;
                            Map map = headerGradientConfigDto.b;
                            int i3 = wiv0.a[gradientTypeDto.ordinal()];
                            if (i3 == 1) {
                                p9uVar = new p9u(map, rib1.d(headerGradientConfigDto.c), rib1.d(headerGradientConfigDto.d));
                            } else {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                p9uVar = new o9u(map);
                            }
                            singletonList.add(p9uVar);
                        }
                    } else {
                        singletonList = Collections.singletonList(q9u.a);
                    }
                    summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1) == obj3) {
                        return obj3;
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
        summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1 = new SummaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryOptionsTariffCardExperimentRepositoryImpl$headerBackgroundGradientsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
