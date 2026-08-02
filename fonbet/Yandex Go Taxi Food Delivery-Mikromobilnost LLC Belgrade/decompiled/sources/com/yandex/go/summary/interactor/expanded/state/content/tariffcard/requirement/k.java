package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.owh;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ owh b;
    public final /* synthetic */ fnx0 c;

    public k(tpr tprVar, owh owhVar, fnx0 fnx0Var) {
        this.a = tprVar;
        this.b = owhVar;
        this.c = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1 deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1) {
            deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1 = (DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1) continuation;
            int i2 = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b, this.c);
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.L$0 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.L$1 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.L$2 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1 = new DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
