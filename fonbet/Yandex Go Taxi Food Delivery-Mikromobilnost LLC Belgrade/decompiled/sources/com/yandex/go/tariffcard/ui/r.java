package com.yandex.go.tariffcard.ui;

import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.yn4;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1 tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1) {
            tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1 = (TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yn4((wl4) it.next()));
                    }
                    tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1 = new TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
