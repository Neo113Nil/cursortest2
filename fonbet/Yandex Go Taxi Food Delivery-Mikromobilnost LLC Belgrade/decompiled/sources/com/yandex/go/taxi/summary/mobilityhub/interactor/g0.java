package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.ny61;
import defpackage.oa11;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g0 implements vpr {
    public final /* synthetic */ vpr a;

    public g0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1 verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1) {
            verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1 = (VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set set = ((oa11) obj).a;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(set, verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1 = new VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
