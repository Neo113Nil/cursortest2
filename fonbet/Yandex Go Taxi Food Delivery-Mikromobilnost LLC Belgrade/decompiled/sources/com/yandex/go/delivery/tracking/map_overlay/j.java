package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.lxa0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public j(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1 deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DeliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1) {
            deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1 = (DeliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1) continuation;
            int i2 = deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((lxa0) obj2).a.equals(this.b)) {
                            break;
                        }
                    }
                    deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.L$0 = null;
                    deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.L$1 = null;
                    deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.L$2 = null;
                    deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.L$3 = null;
                    deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1 = new DeliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesMapPresenter$getRouteParamsFlowc2zMafY$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
