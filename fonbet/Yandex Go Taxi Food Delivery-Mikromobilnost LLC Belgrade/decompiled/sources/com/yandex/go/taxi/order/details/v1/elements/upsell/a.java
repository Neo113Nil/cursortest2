package com.yandex.go.taxi.order.details.v1.elements.upsell;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.totw.TotwPromotions;
import com.yandex.go.taxi.order.models.api.totw.TotwUpsellResponse;
import defpackage.a2k;
import defpackage.d8j;
import defpackage.gci0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w7j;
import defpackage.x7j;
import defpackage.y7j;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements a2k {
    public final y7j a;
    public final x7j b;
    public final gci0 c;

    public a(y7j y7jVar, x7j x7jVar) {
        this.a = y7jVar;
        this.b = x7jVar;
        this.c = y7jVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        DetailsCardUpsellStateInteractor$onOrderUpdated$1 detailsCardUpsellStateInteractor$onOrderUpdated$1;
        int i;
        TotwUpsellResponse totwUpsellResponse;
        if (continuation instanceof DetailsCardUpsellStateInteractor$onOrderUpdated$1) {
            detailsCardUpsellStateInteractor$onOrderUpdated$1 = (DetailsCardUpsellStateInteractor$onOrderUpdated$1) continuation;
            int i2 = detailsCardUpsellStateInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardUpsellStateInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardUpsellStateInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardUpsellStateInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    b.b(obj);
                    TotwPromotions totwPromotions = taxiOrder.V().d0;
                    if (totwPromotions == null || (totwUpsellResponse = totwPromotions.getC()) == null) {
                        totwUpsellResponse = new TotwUpsellResponse(0);
                    }
                    detailsCardUpsellStateInteractor$onOrderUpdated$1.L$0 = null;
                    detailsCardUpsellStateInteractor$onOrderUpdated$1.label = 1;
                    x7j x7jVar = this.b;
                    x7jVar.d.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new DetailsCardUpsellStateMapper$map$2(totwUpsellResponse, x7jVar, null), detailsCardUpsellStateInteractor$onOrderUpdated$1);
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
                this.a.a.l((d8j) obj);
                return zy11.a;
            }
        }
        detailsCardUpsellStateInteractor$onOrderUpdated$1 = new DetailsCardUpsellStateInteractor$onOrderUpdated$1(this, continuation);
        Object obj2 = detailsCardUpsellStateInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardUpsellStateInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        this.a.a.l((d8j) obj2);
        return zy11.a;
    }

    @Override // defpackage.a2k
    public final Object b(TaxiOrder taxiOrder) {
        TotwUpsellResponse totwUpsellResponse;
        TotwPromotions totwPromotions = taxiOrder.V().d0;
        if (totwPromotions == null || (totwUpsellResponse = totwPromotions.getC()) == null) {
            totwUpsellResponse = new TotwUpsellResponse(0);
        }
        return new w7j(totwUpsellResponse);
    }
}
