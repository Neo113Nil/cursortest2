package com.yandex.go.summary.interactor.anchored.state;

import defpackage.fnx0;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;

    public n(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FooterUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1 footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FooterUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1) {
            footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1 = (FooterUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kb5 kb5Var = ((fnx0) obj).e;
                    footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kb5Var, footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1 = new FooterUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = footerUiStateInteractor$promoUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
