package com.yandex.go.scooters.promocodes.data;

import com.yandex.go.scooters.promocodes.data.ScootersPromocodesPromoLinksExperiment;
import defpackage.d6z;
import defpackage.dno0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1 scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1) {
            scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1 = (ScootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1) continuation;
            int i2 = scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ScootersPromocodesPromoLinksExperiment scootersPromocodesPromoLinksExperiment = (ScootersPromocodesPromoLinksExperiment) obj;
                    List<ScootersPromocodesPromoLinksExperiment.PromoLinkItem> list = scootersPromocodesPromoLinksExperiment.d;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (ScootersPromocodesPromoLinksExperiment.PromoLinkItem promoLinkItem : list) {
                        arrayList.add(new dno0(promoLinkItem.a, d6z.Y(scootersPromocodesPromoLinksExperiment, promoLinkItem.b), promoLinkItem.c));
                    }
                    scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.L$0 = null;
                    scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.L$1 = null;
                    scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.L$2 = null;
                    scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.L$3 = null;
                    scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1 = new ScootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPromocodesPromoLinksExperimentRepositoryImpl$getPromoLinksFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
