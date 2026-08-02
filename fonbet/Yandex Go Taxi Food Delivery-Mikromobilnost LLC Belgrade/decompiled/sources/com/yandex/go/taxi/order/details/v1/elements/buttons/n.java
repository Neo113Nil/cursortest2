package com.yandex.go.taxi.order.details.v1.elements.buttons;

import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements tpr {
    public final /* synthetic */ l a;
    public final /* synthetic */ OrderDetailsDriverExperiment b;
    public final /* synthetic */ TaxiOrder c;

    public n(l lVar, OrderDetailsDriverExperiment orderDetailsDriverExperiment, TaxiOrder taxiOrder) {
        this.a = lVar;
        this.b = orderDetailsDriverExperiment;
        this.c = taxiOrder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DetailsCardTopButtonsStateMapper$map$$inlined$map$2$1 detailsCardTopButtonsStateMapper$map$$inlined$map$2$1;
        int i;
        if (continuation instanceof DetailsCardTopButtonsStateMapper$map$$inlined$map$2$1) {
            detailsCardTopButtonsStateMapper$map$$inlined$map$2$1 = (DetailsCardTopButtonsStateMapper$map$$inlined$map$2$1) continuation;
            int i2 = detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b, this.c);
                    detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.L$0 = null;
                    detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.L$1 = null;
                    detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.L$2 = null;
                    detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.label = 1;
                    if (this.a.collect(mVar, detailsCardTopButtonsStateMapper$map$$inlined$map$2$1) == coroutineSingletons) {
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
        detailsCardTopButtonsStateMapper$map$$inlined$map$2$1 = new DetailsCardTopButtonsStateMapper$map$$inlined$map$2$1(this, continuation);
        Object obj2 = detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardTopButtonsStateMapper$map$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
