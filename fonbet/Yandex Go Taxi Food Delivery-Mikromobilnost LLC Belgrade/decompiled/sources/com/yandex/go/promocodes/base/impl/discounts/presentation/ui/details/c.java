package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.cmf0;
import defpackage.krj;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wlf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ krj b;
    public final /* synthetic */ wlf0 c;
    public final /* synthetic */ cmf0 w;

    public c(tpr tprVar, krj krjVar, wlf0 wlf0Var, cmf0 cmf0Var) {
        this.a = tprVar;
        this.b = krjVar;
        this.c = wlf0Var;
        this.w = cmf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1 discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1) {
            discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1 = (DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c, this.w);
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.L$0 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.L$1 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.L$2 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1 = new DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
