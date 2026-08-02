package com.yandex.go.taxi.order.details.v1.elements.ride_support;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.c;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Chevron;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RideSupportElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import com.yandex.go.taxi.order.models.api.response.l1;
import defpackage.iqk0;
import defpackage.mqk0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.s9k0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xak0;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmqk0;", "<anonymous>", "(Ltse;)Lmqk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.ride_support.RideSupportStateMapper$createRideSupportUiState$2", f = "RideSupportStateMapper.kt", l = {46, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideSupportStateMapper$createRideSupportUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$RideSupportElement $element;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ iqk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideSupportStateMapper$createRideSupportUiState$2(iqk0 iqk0Var, OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement, Continuation continuation) {
        super(2, continuation);
        this.$element = orderDetailsCardResponse$CardElement$RideSupportElement;
        this.this$0 = iqk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideSupportStateMapper$createRideSupportUiState$2 rideSupportStateMapper$createRideSupportUiState$2 = new RideSupportStateMapper$createRideSupportUiState$2(this.this$0, this.$element, continuation);
        rideSupportStateMapper$createRideSupportUiState$2.L$0 = obj;
        return rideSupportStateMapper$createRideSupportUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideSupportStateMapper$createRideSupportUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        CharSequence charSequence;
        DetailsCardListItem.a aVar;
        CharSequence charSequence2;
        DetailsCardListItem.a aVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BitmapDrawable bitmapDrawable = null;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new RideSupportStateMapper$createRideSupportUiState$2$title$1(this.this$0, this.$element, null), 3);
            OrderDetailsCardResponse.CardIcon cardIcon = this.$element.b;
            h = cardIcon != null ? tje.h(tseVar, null, null, new RideSupportStateMapper$createRideSupportUiState$2$icon$1$1(this.this$0, cardIcon, null), 3) : null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (DetailsCardListItem.a) this.L$4;
                charSequence2 = (CharSequence) this.L$3;
                b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                aVar = aVar2;
                charSequence = charSequence2;
                iqk0 iqk0Var = this.this$0;
                OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement = this.$element;
                iqk0Var.getClass();
                return new mqk0(charSequence, aVar, bitmapDrawable, !(orderDetailsCardResponse$CardElement$RideSupportElement.e instanceof l1) ? new xak0("OPEN_RIDE_SUPPORT_NOTIFICATION".toLowerCase(Locale.ROOT)) : s9k0.a);
            }
            h = (noh) this.L$2;
            b.b(obj);
        }
        charSequence = (CharSequence) obj;
        iqk0 iqk0Var2 = this.this$0;
        OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement2 = this.$element;
        iqk0Var2.getClass();
        i1 i1Var = orderDetailsCardResponse$CardElement$RideSupportElement2.c;
        aVar = i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Chevron ? new DetailsCardListItem.a(0, 0, false, false, (f) new c(((ufu) iqk0Var2.a).g(((OrderDetailsCardResponse$AccessoryResponse$Chevron) i1Var).a)), 31) : new DetailsCardListItem.a(0, 0, false, false, (f) new c(null), 31);
        if (h != null) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = charSequence;
            this.L$4 = aVar;
            this.label = 2;
            Object k = h.k(this);
            if (k != coroutineSingletons) {
                charSequence2 = charSequence;
                obj = k;
                aVar2 = aVar;
                bitmapDrawable = (BitmapDrawable) obj;
                aVar = aVar2;
                charSequence = charSequence2;
            }
            return coroutineSingletons;
        }
        iqk0 iqk0Var3 = this.this$0;
        OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement3 = this.$element;
        iqk0Var3.getClass();
        return new mqk0(charSequence, aVar, bitmapDrawable, !(orderDetailsCardResponse$CardElement$RideSupportElement3.e instanceof l1) ? new xak0("OPEN_RIDE_SUPPORT_NOTIFICATION".toLowerCase(Locale.ROOT)) : s9k0.a);
    }
}
