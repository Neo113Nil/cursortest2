package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f0 implements tpr {
    public final /* synthetic */ mth a;

    public f0(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1 verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1;
        int i;
        if (continuation instanceof VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1) {
            verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1 = (VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1) continuation;
            int i2 = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e0 e0Var = new e0(vprVar);
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.L$0 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.L$1 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.L$2 = null;
                    verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.label = 1;
                    if (this.a.collect(e0Var, verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1) == coroutineSingletons) {
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
        verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1 = new VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1(this, continuation);
        Object obj2 = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$filterNot$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
