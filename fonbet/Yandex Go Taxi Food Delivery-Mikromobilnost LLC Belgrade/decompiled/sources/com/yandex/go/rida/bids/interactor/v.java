package com.yandex.go.rida.bids.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ny61;
import defpackage.p5k0;
import defpackage.poz;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class v implements vpr {
    public final /* synthetic */ vpr a;

    public v(vpr vprVar, x xVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1 ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1;
        int i;
        poz pozVar;
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo.NewState newState;
        OrderStatusInfo.RidaSearchInfo.BackgroundColors backgroundColors;
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo.NewState newState2;
        if (continuation instanceof RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1) {
            ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1 = (RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1) continuation;
            int i2 = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderStatusInfo.RidaSearchInfo ridaSearchInfo = ((TaxiOrder) obj).V().u0;
                    if (ridaSearchInfo != null) {
                        FormattedText formattedText = ridaSearchInfo.c;
                        String str = ridaSearchInfo.d;
                        OrderStatusInfo.RidaSearchInfo.BackgroundColors backgroundColors2 = ridaSearchInfo.b;
                        p5k0 p5k0Var = new p5k0(formattedText, str, backgroundColors2);
                        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo increasePriceInfo = ridaSearchInfo.f;
                        String str2 = (increasePriceInfo == null || (newState2 = increasePriceInfo.a) == null) ? null : newState2.b;
                        if (increasePriceInfo != null && (newState = increasePriceInfo.a) != null && (backgroundColors = newState.a) != null) {
                            backgroundColors2 = backgroundColors;
                        }
                        pozVar = new poz(ridaSearchInfo.a, p5k0Var, new p5k0(formattedText, str2, backgroundColors2));
                    } else {
                        pozVar = null;
                    }
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.L$0 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.L$1 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.L$2 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.L$3 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pozVar, ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1 = new RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
