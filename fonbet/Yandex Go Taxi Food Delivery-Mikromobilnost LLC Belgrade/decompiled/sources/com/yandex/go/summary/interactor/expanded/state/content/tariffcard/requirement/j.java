package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.f6v;
import defpackage.fnx0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.owh;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ owh b;
    public final /* synthetic */ fnx0 c;

    public j(vpr vprVar, owh owhVar, fnx0 fnx0Var) {
        this.a = vprVar;
        this.b = owhVar;
        this.c = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1 deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1) {
            deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1 = (DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vfx0 vfx0Var = this.b.b;
                    mi31 mi31Var = this.c.a;
                    vfx0Var.getClass();
                    f6v b = ru.yandex.taxi.requirements.utils.c.b((List) obj, vfx0.a(mi31Var));
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1 = new DeliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryBadgesUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
