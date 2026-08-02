package com.yandex.go.navigator.rate_route;

import com.yandex.go.navigator.rate_route.experiement.FeedbackItemDto;
import com.yandex.go.navigator.rate_route.experiement.NavigatorRateScreenExperiment;
import com.yandex.go.navigator.rate_route.experiement.OptionDto;
import defpackage.ae70;
import defpackage.d6z;
import defpackage.le50;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zsq;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RateRouteExperiementRepository$special$$inlined$map$1$2$1 rateRouteExperiementRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RateRouteExperiementRepository$special$$inlined$map$1$2$1) {
            rateRouteExperiementRepository$special$$inlined$map$1$2$1 = (RateRouteExperiementRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = rateRouteExperiementRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rateRouteExperiementRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rateRouteExperiementRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rateRouteExperiementRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    NavigatorRateScreenExperiment navigatorRateScreenExperiment = (NavigatorRateScreenExperiment) obj;
                    String Y = d6z.Y(navigatorRateScreenExperiment, navigatorRateScreenExperiment.d);
                    String Y2 = d6z.Y(navigatorRateScreenExperiment, navigatorRateScreenExperiment.e);
                    String Y3 = d6z.Y(navigatorRateScreenExperiment, navigatorRateScreenExperiment.f);
                    boolean z = navigatorRateScreenExperiment.g;
                    List list = navigatorRateScreenExperiment.h;
                    int i3 = 10;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        FeedbackItemDto feedbackItemDto = (FeedbackItemDto) it.next();
                        String str = feedbackItemDto.a;
                        String str2 = feedbackItemDto.b;
                        String str3 = feedbackItemDto.c;
                        List list2 = feedbackItemDto.d;
                        Iterator it2 = it;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list2, i3));
                        for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                            OptionDto optionDto = (OptionDto) it3.next();
                            arrayList2.add(new ae70(optionDto.a, d6z.Y(navigatorRateScreenExperiment, optionDto.b)));
                        }
                        arrayList.add(new zsq(str, str2, str3, arrayList2));
                        it = it2;
                        i3 = 10;
                    }
                    le50 le50Var = new le50(Y, Y2, Y3, z, arrayList);
                    rateRouteExperiementRepository$special$$inlined$map$1$2$1.L$0 = null;
                    rateRouteExperiementRepository$special$$inlined$map$1$2$1.L$1 = null;
                    rateRouteExperiementRepository$special$$inlined$map$1$2$1.L$2 = null;
                    rateRouteExperiementRepository$special$$inlined$map$1$2$1.L$3 = null;
                    rateRouteExperiementRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(le50Var, rateRouteExperiementRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        rateRouteExperiementRepository$special$$inlined$map$1$2$1 = new RateRouteExperiementRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rateRouteExperiementRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rateRouteExperiementRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
