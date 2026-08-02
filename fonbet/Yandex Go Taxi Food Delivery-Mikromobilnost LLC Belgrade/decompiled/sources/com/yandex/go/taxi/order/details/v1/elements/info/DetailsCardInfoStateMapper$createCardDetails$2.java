package com.yandex.go.taxi.order.details.v1.elements.info;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DetailsElement;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.n4h0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.r6j;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yr70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr6j;", "<anonymous>", "(Ltse;)Lr6j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.info.DetailsCardInfoStateMapper$createCardDetails$2", f = "DetailsCardInfoStateMapper.kt", l = {58, 58, 59, 59, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardInfoStateMapper$createCardDetails$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$DetailsElement $element;
    final /* synthetic */ TaxiOrder $order;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.details.v1.elements.info.DetailsCardInfoStateMapper$createCardDetails$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((yr70) this.receiver).showOrderInfo();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardInfoStateMapper$createCardDetails$2(OrderDetailsCardResponse$CardElement$DetailsElement orderDetailsCardResponse$CardElement$DetailsElement, b bVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.$element = orderDetailsCardResponse$CardElement$DetailsElement;
        this.this$0 = bVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardInfoStateMapper$createCardDetails$2 detailsCardInfoStateMapper$createCardDetails$2 = new DetailsCardInfoStateMapper$createCardDetails$2(this.$element, this.this$0, this.$order, continuation);
        detailsCardInfoStateMapper$createCardDetails$2.L$0 = obj;
        return detailsCardInfoStateMapper$createCardDetails$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardInfoStateMapper$createCardDetails$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013a, code lost:
    
        if (r2 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0151, code lost:
    
        if (r2 == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
    
        if (r2 == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r1 == r6) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Type inference failed for: r1v31, types: [noh] */
    /* JADX WARN: Type inference failed for: r1v34, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        Object s;
        noh nohVar;
        Object e;
        qoh qohVar;
        noh nohVar2;
        CharSequence charSequence;
        Object k;
        Object c;
        CharSequence charSequence2;
        DetailsCardListItem.a b;
        Object k2;
        CharSequence charSequence3;
        DetailsCardListItem.a aVar;
        Drawable y;
        CharSequence charSequence4;
        DetailsCardListItem.a aVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FormattedText formattedText = this.$element.d;
            qoh h3 = formattedText != null ? tje.h(tseVar, null, null, new DetailsCardInfoStateMapper$createCardDetails$2$title$1$1(this.this$0, formattedText, null), 3) : null;
            FormattedText formattedText2 = this.$element.e;
            h = formattedText2 != null ? tje.h(tseVar, null, null, new DetailsCardInfoStateMapper$createCardDetails$2$subtitle$1$1(this.this$0, formattedText2, null), 3) : null;
            OrderDetailsCardResponse.CardIcon cardIcon = this.$element.b;
            h2 = cardIcon != null ? tje.h(tseVar, null, null, new DetailsCardInfoStateMapper$createCardDetails$2$icon$1$1(this.this$0, cardIcon, null), 3) : null;
            if (h3 != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h2;
                this.label = 1;
                s = h3.s(this);
            }
            nohVar = h2;
            qoh qohVar2 = h;
            b bVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = qohVar2;
            this.L$3 = nohVar;
            this.label = 2;
            e = c.e(bVar.f, FormattedText.Companion.c(((avj0) bVar.a).h(kyh0.order_options_details)), null, false, this, 30);
            if (e != coroutineSingletons) {
                qohVar = qohVar2;
                charSequence = (CharSequence) e;
                h = qohVar;
                nohVar2 = nohVar;
                if (h != null) {
                }
                b bVar2 = this.this$0;
                TaxiOrder taxiOrder = this.$order;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar2;
                this.L$4 = charSequence;
                this.label = 4;
                c = bVar2.c(taxiOrder, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            h2 = (noh) this.L$3;
            ?? r1 = (noh) this.L$2;
            kotlin.b.b(obj);
            h = r1;
            s = obj;
        } else if (i == 2) {
            noh nohVar3 = (noh) this.L$3;
            ?? r12 = (noh) this.L$2;
            kotlin.b.b(obj);
            nohVar = nohVar3;
            e = obj;
            qohVar = r12;
            charSequence = (CharSequence) e;
            h = qohVar;
            nohVar2 = nohVar;
            if (h != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar2;
                this.L$4 = charSequence;
                this.label = 3;
                k = h.k(this);
            }
            b bVar22 = this.this$0;
            TaxiOrder taxiOrder2 = this.$order;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar2;
            this.L$4 = charSequence;
            this.label = 4;
            c = bVar22.c(taxiOrder2, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (DetailsCardListItem.a) this.L$6;
                    CharSequence charSequence5 = (CharSequence) this.L$5;
                    CharSequence charSequence6 = (CharSequence) this.L$4;
                    kotlin.b.b(obj);
                    charSequence3 = charSequence6;
                    charSequence2 = charSequence5;
                    k2 = obj;
                    y = (BitmapDrawable) k2;
                    if (y == null) {
                        aVar2 = aVar;
                        charSequence4 = charSequence3;
                        return new r6j(charSequence4, charSequence2, aVar2, y, new AnonymousClass1(0, this.this$0.b, yr70.class, "showOrderInfo", "showOrderInfo()V", 0));
                    }
                    CharSequence charSequence7 = charSequence3;
                    b = aVar;
                    charSequence = charSequence7;
                    y = tje.y(n4h0.ic_order_card_info, this.this$0.e.a);
                    charSequence4 = charSequence;
                    aVar2 = b;
                    return new r6j(charSequence4, charSequence2, aVar2, y, new AnonymousClass1(0, this.this$0.b, yr70.class, "showOrderInfo", "showOrderInfo()V", 0));
                }
                charSequence = (CharSequence) this.L$4;
                nohVar2 = (noh) this.L$3;
                kotlin.b.b(obj);
                c = obj;
                charSequence2 = (CharSequence) c;
                b = this.this$0.b(this.$element);
                if (nohVar2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = charSequence;
                    this.L$5 = charSequence2;
                    this.L$6 = b;
                    this.label = 5;
                    k2 = nohVar2.k(this);
                    if (k2 != coroutineSingletons) {
                        charSequence3 = charSequence;
                        aVar = b;
                        y = (BitmapDrawable) k2;
                        if (y == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                y = tje.y(n4h0.ic_order_card_info, this.this$0.e.a);
                charSequence4 = charSequence;
                aVar2 = b;
                return new r6j(charSequence4, charSequence2, aVar2, y, new AnonymousClass1(0, this.this$0.b, yr70.class, "showOrderInfo", "showOrderInfo()V", 0));
            }
            charSequence = (CharSequence) this.L$4;
            nohVar2 = (noh) this.L$3;
            kotlin.b.b(obj);
            k = obj;
            charSequence2 = (CharSequence) k;
        }
        CharSequence charSequence8 = (CharSequence) s;
        if (charSequence8 != null) {
            nohVar2 = h2;
            charSequence = charSequence8;
            if (h != null) {
            }
            b bVar222 = this.this$0;
            TaxiOrder taxiOrder22 = this.$order;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar2;
            this.L$4 = charSequence;
            this.label = 4;
            c = bVar222.c(taxiOrder22, this);
        }
        nohVar = h2;
        qoh qohVar22 = h;
        b bVar3 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = qohVar22;
        this.L$3 = nohVar;
        this.label = 2;
        e = c.e(bVar3.f, FormattedText.Companion.c(((avj0) bVar3.a).h(kyh0.order_options_details)), null, false, this, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
