package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import defpackage.b1v;
import defpackage.h111;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.y0v;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;

    public l(vpr vprVar, boolean z) {
        this.a = vprVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1 verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1) {
            verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1 = (VerticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    h111 h111Var = (h111) obj;
                    Object b1vVar = !this.b ? new b1v(h111Var) : new y0v(h111Var);
                    verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b1vVar, verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1 = new VerticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiStateInteractor$paymentCardFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
