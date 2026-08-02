package com.yandex.go.promocodes.base.impl.promo_codes.data.datasources;

import defpackage.dvx;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1 promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dvx dvxVar = (dvx) obj;
                    if (dvxVar != null) {
                        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(dvxVar, promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
