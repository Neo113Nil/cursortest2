package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.lxa0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;

    public o(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1 deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof DeliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1) {
            deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1 = (DeliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1) continuation;
            int i2 = deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((lxa0) obj).b;
                    deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.L$0 = null;
                    deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.L$1 = null;
                    deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.L$2 = null;
                    deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.L$3 = null;
                    deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(list, deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1) == coroutineSingletons) {
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
        deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1 = new DeliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1(this, continuation);
        Object obj22 = deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRoutePresenter$launchRouteVoUpdater$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
