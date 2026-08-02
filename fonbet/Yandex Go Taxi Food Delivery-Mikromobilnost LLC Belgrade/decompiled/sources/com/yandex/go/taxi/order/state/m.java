package com.yandex.go.taxi.order.state;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;

    public m(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1 taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1) {
            taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1 = (TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1) continuation;
            int i2 = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.L$0 = null;
                        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.L$1 = null;
                        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.L$2 = null;
                        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.L$3 = null;
                        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1 = new TaxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOnTheWayViewPresenter$observeButtons$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
