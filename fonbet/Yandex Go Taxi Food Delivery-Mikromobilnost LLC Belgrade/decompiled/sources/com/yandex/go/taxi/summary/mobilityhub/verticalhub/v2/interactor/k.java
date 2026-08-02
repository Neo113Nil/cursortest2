package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q c;

    public k(tpr tprVar, boolean z, q qVar) {
        this.a = tprVar;
        this.b = z;
        this.c = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1 verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1) {
            verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1 = (VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1) continuation;
            int i2 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b, this.c);
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.L$0 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.L$1 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.L$2 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1 = new VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
