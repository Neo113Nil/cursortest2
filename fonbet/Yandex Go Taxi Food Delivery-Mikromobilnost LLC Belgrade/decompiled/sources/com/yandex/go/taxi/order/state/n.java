package com.yandex.go.taxi.order.state;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements tpr {
    public final /* synthetic */ tpr a;

    public n(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1 taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1;
        int i;
        if (continuation instanceof TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1) {
            taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1 = (TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1) continuation;
            int i2 = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar);
                    taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.L$0 = null;
                    taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.L$1 = null;
                    taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.L$2 = null;
                    taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(mVar, taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1) == coroutineSingletons) {
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
        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1 = new TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1(this, continuation);
        Object obj2 = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
