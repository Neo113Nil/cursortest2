package com.yandex.go.delivery.tracking;

import defpackage.gqi;
import defpackage.hqi;
import defpackage.lqi;
import defpackage.ny61;
import defpackage.sa91;
import defpackage.soi;
import defpackage.t701;
import defpackage.toi;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1 deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DeliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1) {
            deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1 = (DeliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1) continuation;
            int i2 = deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    lqi lqiVar = ((t701) obj).a.b.d;
                    sa91 sa91Var = lqiVar != null ? lqiVar.e : null;
                    if (sa91Var instanceof gqi) {
                        obj2 = toi.a;
                    } else {
                        if (!(sa91Var instanceof hqi) && sa91Var != null) {
                            w511.b();
                            return null;
                        }
                        obj2 = soi.a;
                    }
                    deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.L$0 = null;
                    deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.L$1 = null;
                    deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.L$2 = null;
                    deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.L$3 = null;
                    deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1 = new DeliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryTrackingPresenter$observeSearchesView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
