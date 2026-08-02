package com.yandex.go.summary.interactor.anchored.state;

import defpackage.avj0;
import defpackage.ba91;
import defpackage.kyh0;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.q1a0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t b;

    public l(vpr vprVar, t tVar) {
        this.a = vprVar;
        this.b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1 footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1) {
            footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1 = (FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m1a0 m1a0Var = (m1a0) obj;
                    t tVar = this.b;
                    q1a0 q1a0Var = new q1a0(m1a0Var, tVar.d, ba91.b(m1a0Var, ((avj0) tVar.f).h(kyh0.summary_order_button_payment_content_description)));
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q1a0Var, footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1 = new FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
