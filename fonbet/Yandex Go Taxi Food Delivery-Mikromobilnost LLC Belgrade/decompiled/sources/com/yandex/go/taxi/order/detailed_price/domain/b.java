package com.yandex.go.taxi.order.detailed_price.domain;

import defpackage.fef;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ List c;
    public final /* synthetic */ fef w;
    public final /* synthetic */ String x;

    public b(tpr tprVar, c cVar, List list, fef fefVar, String str) {
        this.a = tprVar;
        this.b = cVar;
        this.c = list;
        this.w = fefVar;
        this.x = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1 detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1) {
            detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1 = (DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c, this.w, this.x);
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1 = new DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
