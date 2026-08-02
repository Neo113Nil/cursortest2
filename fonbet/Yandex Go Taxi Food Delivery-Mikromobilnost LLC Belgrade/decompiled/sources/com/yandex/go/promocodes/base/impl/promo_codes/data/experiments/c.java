package com.yandex.go.promocodes.base.impl.promo_codes.data.experiments;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;

    public c(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1 promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PromoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1) {
            promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1 = (PromoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1) continuation;
            int i2 = promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.L$0 = null;
                    promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.L$1 = null;
                    promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.L$2 = null;
                    promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1 = new PromoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeListRequestServicesExperimentRepository$servicesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
