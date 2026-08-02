package com.yandex.go.summary.interactor.expanded.state;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ r b;

    public o(kotlinx.coroutines.flow.n nVar, r rVar) {
        this.a = nVar;
        this.b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1 footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1) {
            footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1 = (FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b);
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(nVar, footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1 = new FooterUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = footerUiStateInteractor$paymentInfoButtonUiStateFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
