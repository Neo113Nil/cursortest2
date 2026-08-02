package com.yandex.go.navigator.rate_route;

import com.yandex.go.navigator.rate_route.experiement.NavigatorRateScreenExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final t1b0 a;
    public final c b;

    public d(rqo rqoVar) {
        NavigatorRateScreenExperiment.Companion.getClass();
        NavigatorRateScreenExperiment navigatorRateScreenExperiment = NavigatorRateScreenExperiment.j;
        t1b0 e = ((jbh) rqoVar).e(navigatorRateScreenExperiment);
        this.a = e;
        this.b = new c(com.yandex.go.coroutines.b.d(e.a(), new RateRouteExperiementRepository$special$$inlined$start$1(navigatorRateScreenExperiment, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RateRouteExperiementRepository$isRateScreenVisible$1 rateRouteExperiementRepository$isRateScreenVisible$1;
        int i;
        if (continuationImpl instanceof RateRouteExperiementRepository$isRateScreenVisible$1) {
            rateRouteExperiementRepository$isRateScreenVisible$1 = (RateRouteExperiementRepository$isRateScreenVisible$1) continuationImpl;
            int i2 = rateRouteExperiementRepository$isRateScreenVisible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rateRouteExperiementRepository$isRateScreenVisible$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rateRouteExperiementRepository$isRateScreenVisible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rateRouteExperiementRepository$isRateScreenVisible$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rateRouteExperiementRepository$isRateScreenVisible$1.label = 1;
                    obj = this.a.b(rateRouteExperiementRepository$isRateScreenVisible$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((NavigatorRateScreenExperiment) obj).g);
            }
        }
        rateRouteExperiementRepository$isRateScreenVisible$1 = new RateRouteExperiementRepository$isRateScreenVisible$1(this, continuationImpl);
        Object obj2 = rateRouteExperiementRepository$isRateScreenVisible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rateRouteExperiementRepository$isRateScreenVisible$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((NavigatorRateScreenExperiment) obj2).g);
    }
}
