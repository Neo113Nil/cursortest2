package com.yandex.go.taxi.order.details.v1.elements.payment;

import com.yandex.go.slot.dto.SlotItemActionDto$Type;
import com.yandex.go.slot.dto.m1;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Button;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Chevron;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$PaymentElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.avj0;
import defpackage.avu0;
import defpackage.dzg0;
import defpackage.hak0;
import defpackage.ief;
import defpackage.k7x0;
import defpackage.kyh0;
import defpackage.lv90;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qje;
import defpackage.t0a0;
import defpackage.ufu;
import defpackage.v6j;
import defpackage.v8a0;
import defpackage.vng;
import defpackage.wh70;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.zuj0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class b {
    public final ru.yandex.taxi.order.view.b a;
    public final ru.yandex.taxi.widget.c b;
    public final xdf c;
    public final pdc d;
    public final zuj0 e;
    public final k7x0 f;

    public b(ru.yandex.taxi.order.view.b bVar, ru.yandex.taxi.widget.c cVar, xdf xdfVar, pdc pdcVar, zuj0 zuj0Var, k7x0 k7x0Var) {
        this.a = bVar;
        this.b = cVar;
        this.c = xdfVar;
        this.d = pdcVar;
        this.e = zuj0Var;
        this.f = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, OrderDetailsCardResponse$CardElement$PaymentElement orderDetailsCardResponse$CardElement$PaymentElement, boolean z, ContinuationImpl continuationImpl) {
        DetailsCardPaymentStateMapper$getInteractionMode$1 detailsCardPaymentStateMapper$getInteractionMode$1;
        int i;
        zuj0 zuj0Var = bVar.e;
        if (continuationImpl instanceof DetailsCardPaymentStateMapper$getInteractionMode$1) {
            detailsCardPaymentStateMapper$getInteractionMode$1 = (DetailsCardPaymentStateMapper$getInteractionMode$1) continuationImpl;
            int i2 = detailsCardPaymentStateMapper$getInteractionMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardPaymentStateMapper$getInteractionMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardPaymentStateMapper$getInteractionMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardPaymentStateMapper$getInteractionMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i1 i1Var = orderDetailsCardResponse$CardElement$PaymentElement.c;
                    if (!z) {
                        return com.yandex.go.taxi.order.details.v1.ui.e.b;
                    }
                    if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Button)) {
                        if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Chevron)) {
                            return new com.yandex.go.taxi.order.details.v1.ui.e(2);
                        }
                        return new com.yandex.go.taxi.order.details.v1.ui.c(((ufu) bVar.d).g(((OrderDetailsCardResponse$AccessoryResponse$Chevron) i1Var).a));
                    }
                    ru.yandex.taxi.widget.c cVar = bVar.b;
                    FormattedText formattedText = ((OrderDetailsCardResponse$AccessoryResponse$Button) i1Var).a;
                    detailsCardPaymentStateMapper$getInteractionMode$1.L$0 = null;
                    detailsCardPaymentStateMapper$getInteractionMode$1.L$1 = null;
                    detailsCardPaymentStateMapper$getInteractionMode$1.Z$0 = z;
                    detailsCardPaymentStateMapper$getInteractionMode$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, detailsCardPaymentStateMapper$getInteractionMode$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                avj0 avj0Var = (avj0) zuj0Var;
                return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj, qje.t(xng0.textMain, avj0Var.a), qje.t(xng0.controlMinor, avj0Var.a), Collections.singletonList(new Integer(avj0Var.c(mrg0.go_design_m_space))));
            }
        }
        detailsCardPaymentStateMapper$getInteractionMode$1 = new DetailsCardPaymentStateMapper$getInteractionMode$1(bVar, continuationImpl);
        Object obj2 = detailsCardPaymentStateMapper$getInteractionMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardPaymentStateMapper$getInteractionMode$1.label;
        if (i != 0) {
        }
        avj0 avj0Var2 = (avj0) zuj0Var;
        return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj2, qje.t(xng0.textMain, avj0Var2.a), qje.t(xng0.controlMinor, avj0Var2.a), Collections.singletonList(new Integer(avj0Var2.c(mrg0.go_design_m_space))));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DetailsCardPaymentStateMapper$loadLocalPaymentIcon$1 detailsCardPaymentStateMapper$loadLocalPaymentIcon$1;
        int i;
        v8a0 v8a0Var;
        bVar.getClass();
        if (continuationImpl instanceof DetailsCardPaymentStateMapper$loadLocalPaymentIcon$1) {
            detailsCardPaymentStateMapper$loadLocalPaymentIcon$1 = (DetailsCardPaymentStateMapper$loadLocalPaymentIcon$1) continuationImpl;
            int i2 = detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.L$0 = null;
                    detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.label = 1;
                    obj = bVar.d(taxiOrder, detailsCardPaymentStateMapper$loadLocalPaymentIcon$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                v8a0Var = (v8a0) obj;
                if (v8a0Var == null) {
                    return v8a0Var.b;
                }
                return null;
            }
        }
        detailsCardPaymentStateMapper$loadLocalPaymentIcon$1 = new DetailsCardPaymentStateMapper$loadLocalPaymentIcon$1(bVar, continuationImpl);
        Object obj3 = detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardPaymentStateMapper$loadLocalPaymentIcon$1.label;
        if (i != 0) {
        }
        v8a0Var = (v8a0) obj3;
        if (v8a0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0078, code lost:
    
        if (r2 == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DetailsCardPaymentStateMapper$createLocalPaymentMethod$1 detailsCardPaymentStateMapper$createLocalPaymentMethod$1;
        Object obj;
        int i;
        String str;
        Object i2;
        TaxiOrder taxiOrder2;
        v8a0 v8a0Var;
        Object i3;
        CharSequence charSequence;
        TaxiOrder taxiOrder3;
        TaxiOrder taxiOrder4 = taxiOrder;
        zuj0 zuj0Var = this.e;
        if (continuationImpl instanceof DetailsCardPaymentStateMapper$createLocalPaymentMethod$1) {
            detailsCardPaymentStateMapper$createLocalPaymentMethod$1 = (DetailsCardPaymentStateMapper$createLocalPaymentMethod$1) continuationImpl;
            int i4 = detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = detailsCardPaymentStateMapper$createLocalPaymentMethod$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0 = taxiOrder4;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label = 1;
                    obj2 = d(taxiOrder4, detailsCardPaymentStateMapper$createLocalPaymentMethod$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            CharSequence charSequence2 = (CharSequence) detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$3;
                            v8a0Var = (v8a0) detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$1;
                            taxiOrder3 = (TaxiOrder) detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0;
                            kotlin.b.b(obj2);
                            charSequence = charSequence2;
                            CharSequence charSequence3 = (CharSequence) obj2;
                            boolean z = (new wh70(taxiOrder3).a() || taxiOrder3.h.b == DriveState.COMPLETE) ? false : true;
                            com.yandex.go.taxi.order.details.v1.ui.f dVar = !z ? new com.yandex.go.taxi.order.details.v1.ui.d(vng.t(dzg0.component_trail_navigation_elevator, ((avj0) zuj0Var).a)) : com.yandex.go.taxi.order.details.v1.ui.e.b;
                            boolean z2 = v8a0Var == null;
                            DetailsCardListItem.a aVar = new DetailsCardListItem.a(0, 0, false, false, dVar, 31);
                            t0a0 t0a0Var = v8a0Var != null ? v8a0Var.b : null;
                            m1.INSTANCE.getClass();
                            return new v6j(z2, z, false, charSequence, charSequence3, t0a0Var, aVar, new hak0(SlotItemActionDto$Type.OPEN_PAYMENT.name().toLowerCase(Locale.ROOT)));
                        }
                        v8a0Var = (v8a0) detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$1;
                        taxiOrder2 = (TaxiOrder) detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence4 = (CharSequence) obj2;
                        FormattedText c = FormattedText.Companion.c(((avj0) zuj0Var).h(kyh0.summary_payment_method_title));
                        ru.yandex.taxi.widget.c cVar = this.b;
                        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0 = taxiOrder2;
                        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$1 = v8a0Var;
                        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$2 = null;
                        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$3 = charSequence4;
                        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$4 = null;
                        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label = 3;
                        i3 = ru.yandex.taxi.widget.c.i(cVar, c, null, detailsCardPaymentStateMapper$createLocalPaymentMethod$1, 30);
                        if (i3 != obj) {
                            charSequence = charSequence4;
                            taxiOrder3 = taxiOrder2;
                            obj2 = i3;
                            CharSequence charSequence32 = (CharSequence) obj2;
                            if (new wh70(taxiOrder3).a()) {
                            }
                            com.yandex.go.taxi.order.details.v1.ui.f dVar2 = !z ? new com.yandex.go.taxi.order.details.v1.ui.d(vng.t(dzg0.component_trail_navigation_elevator, ((avj0) zuj0Var).a)) : com.yandex.go.taxi.order.details.v1.ui.e.b;
                            if (v8a0Var == null) {
                            }
                            DetailsCardListItem.a aVar2 = new DetailsCardListItem.a(0, 0, false, false, dVar2, 31);
                            if (v8a0Var != null) {
                            }
                            m1.INSTANCE.getClass();
                            return new v6j(z2, z, false, charSequence, charSequence32, t0a0Var, aVar2, new hak0(SlotItemActionDto$Type.OPEN_PAYMENT.name().toLowerCase(Locale.ROOT)));
                        }
                        return obj;
                    }
                    taxiOrder4 = (TaxiOrder) detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0;
                    kotlin.b.b(obj2);
                }
                v8a0 v8a0Var2 = (v8a0) obj2;
                ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                str = v8a0Var2 == null ? v8a0Var2.a : null;
                if (str == null) {
                    str = "";
                }
                FormattedText c2 = bVar.c(str);
                ru.yandex.taxi.widget.c cVar2 = this.b;
                detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0 = taxiOrder4;
                detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$1 = v8a0Var2;
                detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$2 = null;
                detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar2, c2, null, detailsCardPaymentStateMapper$createLocalPaymentMethod$1, 30);
                if (i2 != obj) {
                    taxiOrder2 = taxiOrder4;
                    v8a0Var = v8a0Var2;
                    obj2 = i2;
                    CharSequence charSequence42 = (CharSequence) obj2;
                    FormattedText c3 = FormattedText.Companion.c(((avj0) zuj0Var).h(kyh0.summary_payment_method_title));
                    ru.yandex.taxi.widget.c cVar3 = this.b;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0 = taxiOrder2;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$1 = v8a0Var;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$2 = null;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$3 = charSequence42;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$4 = null;
                    detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label = 3;
                    i3 = ru.yandex.taxi.widget.c.i(cVar3, c3, null, detailsCardPaymentStateMapper$createLocalPaymentMethod$1, 30);
                    if (i3 != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardPaymentStateMapper$createLocalPaymentMethod$1 = new DetailsCardPaymentStateMapper$createLocalPaymentMethod$1(this, continuationImpl);
        Object obj22 = detailsCardPaymentStateMapper$createLocalPaymentMethod$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label;
        if (i != 0) {
        }
        v8a0 v8a0Var22 = (v8a0) obj22;
        ru.yandex.taxi.common_models.net.b bVar2 = FormattedText.Companion;
        if (v8a0Var22 == null) {
        }
        if (str == null) {
        }
        FormattedText c22 = bVar2.c(str);
        ru.yandex.taxi.widget.c cVar22 = this.b;
        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$0 = taxiOrder4;
        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$1 = v8a0Var22;
        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.L$2 = null;
        detailsCardPaymentStateMapper$createLocalPaymentMethod$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar22, c22, null, detailsCardPaymentStateMapper$createLocalPaymentMethod$1, 30);
        if (i2 != obj) {
        }
        return obj;
    }

    public final Object d(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        lv90 lv90Var = taxiOrder.V().I;
        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
        String str = lv90Var.b;
        String str2 = taxiOrder.V().v;
        BigDecimal h = str2 != null ? avu0.h(str2) : null;
        ief iefVar = taxiOrder.V().K;
        return this.a.d(paymentMethod$Type, str, h, iefVar != null ? iefVar.b : null, continuationImpl);
    }
}
