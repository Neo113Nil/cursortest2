package com.yandex.go.taxi.order.details.v1.elements.info;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Chevron;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DetailsElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Type;
import com.yandex.go.taxi.order.models.api.response.c2;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.avj0;
import defpackage.kub1;
import defpackage.kyh0;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.o480;
import defpackage.pdc;
import defpackage.r6j;
import defpackage.tje;
import defpackage.ufu;
import defpackage.xdf;
import defpackage.yr70;
import defpackage.zuj0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class b {
    public final zuj0 a;
    public final o480 b;
    public final xdf c;
    public final pdc d;
    public final e e;
    public final c f;

    public b(zuj0 zuj0Var, o480 o480Var, xdf xdfVar, pdc pdcVar, e eVar, c cVar) {
        this.a = zuj0Var;
        this.b = o480Var;
        this.c = xdfVar;
        this.d = pdcVar;
        this.e = eVar;
        this.f = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r15 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DetailsCardInfoStateMapper$createCardDetailsFallback$1 detailsCardInfoStateMapper$createCardDetailsFallback$1;
        Object obj;
        int i;
        Object c;
        CharSequence charSequence;
        if (continuationImpl instanceof DetailsCardInfoStateMapper$createCardDetailsFallback$1) {
            detailsCardInfoStateMapper$createCardDetailsFallback$1 = (DetailsCardInfoStateMapper$createCardDetailsFallback$1) continuationImpl;
            int i2 = detailsCardInfoStateMapper$createCardDetailsFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardInfoStateMapper$createCardDetailsFallback$1.label = i2 - Integer.MIN_VALUE;
                DetailsCardInfoStateMapper$createCardDetailsFallback$1 detailsCardInfoStateMapper$createCardDetailsFallback$12 = detailsCardInfoStateMapper$createCardDetailsFallback$1;
                Object obj2 = detailsCardInfoStateMapper$createCardDetailsFallback$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardInfoStateMapper$createCardDetailsFallback$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardInfoStateMapper$createCardDetailsFallback$12.L$0 = taxiOrder;
                    detailsCardInfoStateMapper$createCardDetailsFallback$12.label = 1;
                    obj2 = c.e(this.f, FormattedText.Companion.c(((avj0) this.a).h(kyh0.order_options_details)), null, false, detailsCardInfoStateMapper$createCardDetailsFallback$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence2 = (CharSequence) detailsCardInfoStateMapper$createCardDetailsFallback$12.L$1;
                        kotlin.b.b(obj2);
                        charSequence = charSequence2;
                        return new r6j(charSequence, (CharSequence) obj2, b(null), tje.y(n4h0.ic_order_card_info, this.e.a), new DetailsCardInfoStateMapper$createCardDetailsFallback$2(0, this.b, yr70.class, "showOrderInfo", "showOrderInfo()V", 0));
                    }
                    taxiOrder = (TaxiOrder) detailsCardInfoStateMapper$createCardDetailsFallback$12.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence3 = (CharSequence) obj2;
                detailsCardInfoStateMapper$createCardDetailsFallback$12.L$0 = null;
                detailsCardInfoStateMapper$createCardDetailsFallback$12.L$1 = charSequence3;
                detailsCardInfoStateMapper$createCardDetailsFallback$12.label = 2;
                c = c(taxiOrder, detailsCardInfoStateMapper$createCardDetailsFallback$12);
                if (c != obj) {
                    charSequence = charSequence3;
                    obj2 = c;
                    return new r6j(charSequence, (CharSequence) obj2, b(null), tje.y(n4h0.ic_order_card_info, this.e.a), new DetailsCardInfoStateMapper$createCardDetailsFallback$2(0, this.b, yr70.class, "showOrderInfo", "showOrderInfo()V", 0));
                }
                return obj;
            }
        }
        detailsCardInfoStateMapper$createCardDetailsFallback$1 = new DetailsCardInfoStateMapper$createCardDetailsFallback$1(this, continuationImpl);
        DetailsCardInfoStateMapper$createCardDetailsFallback$1 detailsCardInfoStateMapper$createCardDetailsFallback$122 = detailsCardInfoStateMapper$createCardDetailsFallback$1;
        Object obj22 = detailsCardInfoStateMapper$createCardDetailsFallback$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardInfoStateMapper$createCardDetailsFallback$122.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj22;
        detailsCardInfoStateMapper$createCardDetailsFallback$122.L$0 = null;
        detailsCardInfoStateMapper$createCardDetailsFallback$122.L$1 = charSequence32;
        detailsCardInfoStateMapper$createCardDetailsFallback$122.label = 2;
        c = c(taxiOrder, detailsCardInfoStateMapper$createCardDetailsFallback$122);
        if (c != obj) {
        }
        return obj;
    }

    public final DetailsCardListItem.a b(OrderDetailsCardResponse$CardElement$DetailsElement orderDetailsCardResponse$CardElement$DetailsElement) {
        i1 i1Var = orderDetailsCardResponse$CardElement$DetailsElement != null ? orderDetailsCardResponse$CardElement$DetailsElement.c : null;
        if (i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Chevron) {
            return new DetailsCardListItem.a(0, 0, false, false, (f) new com.yandex.go.taxi.order.details.v1.ui.c(((ufu) this.d).g(((OrderDetailsCardResponse$AccessoryResponse$Chevron) i1Var).a)), 31);
        }
        return new DetailsCardListItem.a(0, 0, false, false, (f) new com.yandex.go.taxi.order.details.v1.ui.c(null), 31);
    }

    public final Object c(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
        Object obj = null;
        List list = orderDetailsCardResponse != null ? orderDetailsCardResponse.a : null;
        if (list == null) {
            list = EmptyList.a;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((c2) next).a() == OrderDetailsCardResponse$CardElement$Type.PAYMENT_METHOD) {
                obj = next;
                break;
            }
        }
        c2 c2Var = (c2) obj;
        String j = taxiOrder.j();
        if (j == null || j.length() == 0 || c2Var != null) {
            return "";
        }
        return c.e(this.f, FormattedText.Companion.c(((avj0) this.a).i(kyh0.common_strings_requirements_cost_of_travel, kub1.e(this.c, taxiOrder.V().K, taxiOrder.j()))), null, false, continuationImpl, 30);
    }
}
