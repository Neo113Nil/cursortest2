package com.yandex.go.rida.bids.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.p8p;
import defpackage.vpr;
import defpackage.x780;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;

    public q(vpr vprVar, s sVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FailedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1 failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof FailedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1) {
            failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1 = (FailedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1) continuation;
            int i2 = failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    int i3 = p8p.a[taxiOrder.h.b.ordinal()];
                    if ((i3 == 1 || i3 == 2) ? true : i3 != 3 ? false : x780.a(taxiOrder)) {
                        failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.L$0 = null;
                        failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.L$1 = null;
                        failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.L$2 = null;
                        failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.L$3 = null;
                        failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.label = 1;
                        if (vprVar.emit(obj, failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1 = new FailedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = failedOrderStatusInteractor$awaitFailedStatus$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
