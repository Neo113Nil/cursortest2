package com.yandex.go.taxi.order.details.v1.elements.payment;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$PaymentElement;
import defpackage.avj0;
import defpackage.dyc;
import defpackage.hak0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.s0a0;
import defpackage.t0a0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v6j;
import defpackage.wh70;
import defpackage.wls;
import defpackage.wug0;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv6j;", "<anonymous>", "(Ltse;)Lv6j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.payment.DetailsCardPaymentStateMapper$createCardPaymentMethod$2", f = "DetailsCardPaymentStateMapper.kt", l = {102, 109, 110, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardPaymentStateMapper$createCardPaymentMethod$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$PaymentElement $element;
    final /* synthetic */ TaxiOrder $order;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardPaymentStateMapper$createCardPaymentMethod$2(OrderDetailsCardResponse$CardElement$PaymentElement orderDetailsCardResponse$CardElement$PaymentElement, b bVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.$element = orderDetailsCardResponse$CardElement$PaymentElement;
        this.this$0 = bVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardPaymentStateMapper$createCardPaymentMethod$2 detailsCardPaymentStateMapper$createCardPaymentMethod$2 = new DetailsCardPaymentStateMapper$createCardPaymentMethod$2(this.$element, this.this$0, this.$order, continuation);
        detailsCardPaymentStateMapper$createCardPaymentMethod$2.L$0 = obj;
        return detailsCardPaymentStateMapper$createCardPaymentMethod$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardPaymentStateMapper$createCardPaymentMethod$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0192  */
    /* JADX WARN: Type inference failed for: r10v8, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v27, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v30, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s0a0 s0a0Var;
        boolean z;
        Object s;
        qoh qohVar;
        DetailsCardListItem.a aVar;
        qoh qohVar2;
        t0a0 t0a0Var;
        boolean z2;
        Object k;
        DetailsCardListItem.a aVar2;
        CharSequence charSequence;
        Object k2;
        CharSequence charSequence2;
        boolean z3;
        t0a0 t0a0Var2;
        DetailsCardListItem.a aVar3;
        CharSequence charSequence3;
        boolean z4;
        CharSequence charSequence4;
        CharSequence charSequence5;
        DetailsCardListItem.a aVar4;
        hak0 hak0Var;
        Object b;
        boolean z5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        DetailsCardListItem.a aVar5;
        hak0 hak0Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FormattedText formattedText = this.$element.d;
            if (formattedText == null) {
                return v6j.i;
            }
            qoh h = tje.h(tseVar, null, null, new DetailsCardPaymentStateMapper$createCardPaymentMethod$2$title$1$1(this.this$0, formattedText, this.$order, null), 3);
            FormattedText formattedText2 = this.$element.e;
            qoh h2 = formattedText2 != null ? tje.h(tseVar, null, null, new DetailsCardPaymentStateMapper$createCardPaymentMethod$2$subtitle$1$1(this.this$0, formattedText2, null), 3) : null;
            OrderDetailsCardResponse.CardIcon cardIcon = this.$element.b;
            if (cardIcon != null) {
                b bVar = this.this$0;
                int c = ((avj0) bVar.e).c(wug0.details_card_payment_icon_size);
                s0a0Var = new s0a0(((m7x0) bVar.f).a(cardIcon.b), new dyc(1), c, c);
            } else {
                s0a0Var = null;
            }
            b bVar2 = this.this$0;
            TaxiOrder taxiOrder = this.$order;
            bVar2.getClass();
            z = new wh70(taxiOrder).a() && taxiOrder.h.b != DriveState.COMPLETE;
            qoh h3 = tje.h(tseVar, null, null, new DetailsCardPaymentStateMapper$createCardPaymentMethod$2$interactionMode$1(this.this$0, this.$element, z, null), 3);
            DetailsCardListItem.a aVar6 = DetailsCardListItem.a.g;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = h2;
            this.L$3 = s0a0Var;
            this.L$4 = null;
            this.L$5 = aVar6;
            this.Z$0 = z;
            this.I$0 = 0;
            this.I$1 = 0;
            this.I$2 = 0;
            this.I$3 = 0;
            this.I$4 = 0;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                qohVar = h2;
                aVar = aVar6;
                qohVar2 = h;
                t0a0Var = s0a0Var;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            boolean z6 = this.Z$0;
            aVar = (DetailsCardListItem.a) this.L$5;
            t0a0Var = (t0a0) this.L$3;
            ?? r9 = (noh) this.L$2;
            ?? r10 = (noh) this.L$1;
            kotlin.b.b(obj);
            qohVar2 = r10;
            qohVar = r9;
            z = z6;
            s = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = this.Z$1;
                    z5 = this.Z$0;
                    hak0Var2 = (hak0) this.L$8;
                    charSequence6 = (CharSequence) this.L$7;
                    charSequence7 = (CharSequence) this.L$6;
                    aVar5 = (DetailsCardListItem.a) this.L$5;
                    kotlin.b.b(obj);
                    b = obj;
                    t0a0Var2 = (t0a0) b;
                    z4 = z5;
                    hak0Var = hak0Var2;
                    charSequence4 = charSequence6;
                    charSequence5 = charSequence7;
                    aVar4 = aVar5;
                    return new v6j(true, z4, z2, charSequence5, charSequence4, t0a0Var2, aVar4, hak0Var);
                }
                z2 = this.Z$1;
                z3 = this.Z$0;
                CharSequence charSequence8 = (CharSequence) this.L$6;
                DetailsCardListItem.a aVar7 = (DetailsCardListItem.a) this.L$5;
                t0a0 t0a0Var3 = (t0a0) this.L$3;
                kotlin.b.b(obj);
                t0a0Var2 = t0a0Var3;
                aVar3 = aVar7;
                charSequence2 = charSequence8;
                k2 = obj;
                charSequence3 = (CharSequence) k2;
                if (charSequence3 == null) {
                    t0a0 t0a0Var4 = t0a0Var2;
                    z = z3;
                    charSequence = charSequence2;
                    aVar2 = aVar3;
                    t0a0Var = t0a0Var4;
                    charSequence3 = "";
                    DetailsCardListItem.a aVar8 = aVar2;
                    charSequence2 = charSequence;
                    z3 = z;
                    t0a0Var2 = t0a0Var;
                    aVar3 = aVar8;
                }
                hak0 hak0Var3 = new hak0("OPEN_PAYMENT".toLowerCase(Locale.ROOT));
                if (t0a0Var2 == null) {
                    z4 = z3;
                    charSequence4 = charSequence3;
                    charSequence5 = charSequence2;
                    aVar4 = aVar3;
                    hak0Var = hak0Var3;
                    return new v6j(true, z4, z2, charSequence5, charSequence4, t0a0Var2, aVar4, hak0Var);
                }
                b bVar3 = this.this$0;
                TaxiOrder taxiOrder2 = this.$order;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = aVar3;
                this.L$6 = charSequence2;
                this.L$7 = charSequence3;
                this.L$8 = hak0Var3;
                this.Z$0 = z3;
                this.Z$1 = z2;
                this.label = 4;
                b = b.b(bVar3, taxiOrder2, this);
                if (b != coroutineSingletons) {
                    z5 = z3;
                    charSequence6 = charSequence3;
                    charSequence7 = charSequence2;
                    aVar5 = aVar3;
                    hak0Var2 = hak0Var3;
                    t0a0Var2 = (t0a0) b;
                    z4 = z5;
                    hak0Var = hak0Var2;
                    charSequence4 = charSequence6;
                    charSequence5 = charSequence7;
                    aVar4 = aVar5;
                    return new v6j(true, z4, z2, charSequence5, charSequence4, t0a0Var2, aVar4, hak0Var);
                }
                return coroutineSingletons;
            }
            z2 = this.Z$1;
            boolean z7 = this.Z$0;
            aVar2 = (DetailsCardListItem.a) this.L$5;
            t0a0Var = (t0a0) this.L$3;
            ?? r92 = (noh) this.L$2;
            kotlin.b.b(obj);
            qohVar = r92;
            z = z7;
            k = obj;
            charSequence = (CharSequence) k;
            if (qohVar != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = t0a0Var;
                this.L$4 = null;
                this.L$5 = aVar2;
                this.L$6 = charSequence;
                this.Z$0 = z;
                this.Z$1 = z2;
                this.label = 3;
                k2 = qohVar.k(this);
                if (k2 != coroutineSingletons) {
                    DetailsCardListItem.a aVar9 = aVar2;
                    charSequence2 = charSequence;
                    z3 = z;
                    t0a0Var2 = t0a0Var;
                    aVar3 = aVar9;
                    charSequence3 = (CharSequence) k2;
                    if (charSequence3 == null) {
                    }
                    hak0 hak0Var32 = new hak0("OPEN_PAYMENT".toLowerCase(Locale.ROOT));
                    if (t0a0Var2 == null) {
                    }
                }
                return coroutineSingletons;
            }
            charSequence3 = "";
            DetailsCardListItem.a aVar82 = aVar2;
            charSequence2 = charSequence;
            z3 = z;
            t0a0Var2 = t0a0Var;
            aVar3 = aVar82;
            hak0 hak0Var322 = new hak0("OPEN_PAYMENT".toLowerCase(Locale.ROOT));
            if (t0a0Var2 == null) {
            }
        }
        DetailsCardListItem.a aVar10 = new DetailsCardListItem.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, (com.yandex.go.taxi.order.details.v1.ui.f) s);
        z2 = this.$order.l.C;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = qohVar;
        this.L$3 = t0a0Var;
        this.L$4 = null;
        this.L$5 = aVar10;
        this.Z$0 = z;
        this.Z$1 = z2;
        this.label = 2;
        k = qohVar2.k(this);
        if (k != coroutineSingletons) {
            aVar2 = aVar10;
            charSequence = (CharSequence) k;
            if (qohVar != null) {
            }
            charSequence3 = "";
            DetailsCardListItem.a aVar822 = aVar2;
            charSequence2 = charSequence;
            z3 = z;
            t0a0Var2 = t0a0Var;
            aVar3 = aVar822;
            hak0 hak0Var3222 = new hak0("OPEN_PAYMENT".toLowerCase(Locale.ROOT));
            if (t0a0Var2 == null) {
            }
        }
        return coroutineSingletons;
    }
}
