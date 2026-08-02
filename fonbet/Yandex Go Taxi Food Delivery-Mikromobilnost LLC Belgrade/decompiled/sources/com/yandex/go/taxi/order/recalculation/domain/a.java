package com.yandex.go.taxi.order.recalculation.domain;

import com.yandex.go.taxi.order.recalculation.api.PriceRecalculationApi;
import com.yandex.go.taxi.order.recalculation.model.request.NewRoutePriceParam;
import com.yandex.go.taxi.order.recalculation.model.response.NewRoutePrice;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.f0f0;
import defpackage.ffx;
import defpackage.hit;
import defpackage.i3y;
import defpackage.lr40;
import defpackage.ny61;
import defpackage.on2;
import defpackage.tje;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class a {
    public final hit a;
    public final i3y b;
    public final n0 c = ffx.c(0, 0, null, 6);
    public String d = "";

    public a(on2 on2Var, hit hitVar) {
        this.a = hitVar;
        this.b = kotlin.a.a(new lr40(on2Var, 9));
    }

    public final void a(f0f0 f0f0Var) {
        tje.N(this.a.a, null, null, new PriceRecalculationRepository$notifyToShowModalView$1(this, f0f0Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, List list, ContinuationImpl continuationImpl) {
        PriceRecalculationRepository$postNewRoutePrice$1 priceRecalculationRepository$postNewRoutePrice$1;
        int i;
        if (continuationImpl instanceof PriceRecalculationRepository$postNewRoutePrice$1) {
            priceRecalculationRepository$postNewRoutePrice$1 = (PriceRecalculationRepository$postNewRoutePrice$1) continuationImpl;
            int i2 = priceRecalculationRepository$postNewRoutePrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                priceRecalculationRepository$postNewRoutePrice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = priceRecalculationRepository$postNewRoutePrice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = priceRecalculationRepository$postNewRoutePrice$1.label;
                if (i != 0) {
                    b.b(obj);
                    boolean J = evu0.J(this.d);
                    i3y i3yVar = this.b;
                    cmt<NewRoutePrice> a = !J ? ((PriceRecalculationApi) i3yVar.getValue()).a(new NewRoutePriceParam(str, list, this.d)) : ((PriceRecalculationApi) i3yVar.getValue()).a(new NewRoutePriceParam(str, list, null));
                    priceRecalculationRepository$postNewRoutePrice$1.L$0 = null;
                    priceRecalculationRepository$postNewRoutePrice$1.L$1 = null;
                    priceRecalculationRepository$postNewRoutePrice$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, priceRecalculationRepository$postNewRoutePrice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                NewRoutePrice newRoutePrice = (NewRoutePrice) obj;
                this.d = newRoutePrice.a;
                return newRoutePrice;
            }
        }
        priceRecalculationRepository$postNewRoutePrice$1 = new PriceRecalculationRepository$postNewRoutePrice$1(this, continuationImpl);
        Object obj2 = priceRecalculationRepository$postNewRoutePrice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = priceRecalculationRepository$postNewRoutePrice$1.label;
        if (i != 0) {
        }
        NewRoutePrice newRoutePrice2 = (NewRoutePrice) obj2;
        this.d = newRoutePrice2.a;
        return newRoutePrice2;
    }
}
