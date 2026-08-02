package com.yandex.go.taxi.order.details.v1.elements.section_detail;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SectionDetailElement;
import com.yandex.go.taxi.order.models.api.response.e2;
import defpackage.k0q0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0q0;
import defpackage.p0q0;
import defpackage.q0q0;
import defpackage.r0q0;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt0q0;", "<anonymous>", "(Ltse;)Lt0q0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.section_detail.SectionDetailStateMapper$map$2", f = "SectionDetailStateMapper.kt", l = {23, 26}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SectionDetailStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k0q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionDetailStateMapper$map$2(TaxiOrder taxiOrder, k0q0 k0q0Var, Continuation continuation) {
        super(2, continuation);
        this.$order = taxiOrder;
        this.this$0 = k0q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionDetailStateMapper$map$2(this.$order, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SectionDetailStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        OrderDetailsCardResponse$CardElement$SectionDetailElement orderDetailsCardResponse$CardElement$SectionDetailElement;
        CharSequence charSequence;
        CharSequence charSequence2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BitmapDrawable bitmapDrawable = null;
        if (i == 0) {
            b.b(obj);
            OrderDetailsCardResponse orderDetailsCardResponse = this.$order.V().n0;
            if (orderDetailsCardResponse != null) {
                e2 e2Var = OrderDetailsCardResponse.Companion;
                List list = orderDetailsCardResponse.a;
                if (list != null) {
                    r1 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof OrderDetailsCardResponse$CardElement$SectionDetailElement) {
                            r1.add(obj2);
                        }
                    }
                } else {
                    r1 = EmptyList.a;
                }
                OrderDetailsCardResponse$CardElement$SectionDetailElement orderDetailsCardResponse$CardElement$SectionDetailElement2 = (OrderDetailsCardResponse$CardElement$SectionDetailElement) kotlin.collections.a.R(r1);
                if (orderDetailsCardResponse$CardElement$SectionDetailElement2 != null) {
                    c cVar = this.this$0.c;
                    FormattedText formattedText = orderDetailsCardResponse$CardElement$SectionDetailElement2.d;
                    this.L$0 = orderDetailsCardResponse$CardElement$SectionDetailElement2;
                    this.label = 1;
                    Object i2 = c.i(cVar, formattedText, null, this, 30);
                    if (i2 != coroutineSingletons) {
                        orderDetailsCardResponse$CardElement$SectionDetailElement = orderDetailsCardResponse$CardElement$SectionDetailElement2;
                        obj = i2;
                    }
                    return coroutineSingletons;
                }
            }
            return p0q0.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence2 = (CharSequence) this.L$1;
            orderDetailsCardResponse$CardElement$SectionDetailElement = (OrderDetailsCardResponse$CardElement$SectionDetailElement) this.L$0;
            b.b(obj);
            bitmapDrawable = (BitmapDrawable) obj;
            charSequence = charSequence2;
            return new o0q0(charSequence, ((ufu) this.this$0.a).b(orderDetailsCardResponse$CardElement$SectionDetailElement.c), bitmapDrawable == null ? new r0q0(bitmapDrawable) : q0q0.a);
        }
        orderDetailsCardResponse$CardElement$SectionDetailElement = (OrderDetailsCardResponse$CardElement$SectionDetailElement) this.L$0;
        b.b(obj);
        charSequence = (CharSequence) obj;
        OrderDetailsCardResponse.CardIcon cardIcon = orderDetailsCardResponse$CardElement$SectionDetailElement.b;
        if (cardIcon != null) {
            e eVar = this.this$0.b;
            String str = cardIcon.b;
            this.L$0 = orderDetailsCardResponse$CardElement$SectionDetailElement;
            this.L$1 = charSequence;
            this.L$2 = null;
            this.label = 2;
            Object f = e.f(eVar, str, null, this, 6);
            if (f != coroutineSingletons) {
                charSequence2 = charSequence;
                obj = f;
                bitmapDrawable = (BitmapDrawable) obj;
                charSequence = charSequence2;
            }
            return coroutineSingletons;
        }
        return new o0q0(charSequence, ((ufu) this.this$0.a).b(orderDetailsCardResponse$CardElement$SectionDetailElement.c), bitmapDrawable == null ? new r0q0(bitmapDrawable) : q0q0.a);
    }
}
