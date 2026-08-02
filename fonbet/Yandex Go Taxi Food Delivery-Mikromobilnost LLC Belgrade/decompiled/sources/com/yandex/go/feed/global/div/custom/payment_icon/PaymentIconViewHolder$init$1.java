package com.yandex.go.feed.global.div.custom.payment_icon;

import com.yandex.div.core.view2.Div2View;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feed.global.div.custom.payment_icon.PaymentIconViewHolder$init$1", f = "PaymentIconViewHolder.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class PaymentIconViewHolder$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ CompositePaymentIconsView $compositeView;
    final /* synthetic */ String $titleVariable;
    int label;
    final /* synthetic */ PaymentIconViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIconViewHolder$init$1(PaymentIconViewHolder paymentIconViewHolder, CompositePaymentIconsView compositePaymentIconsView, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentIconViewHolder;
        this.$compositeView = compositePaymentIconsView;
        this.$titleVariable = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentIconViewHolder$init$1(this.this$0, this.$compositeView, this.$titleVariable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentIconViewHolder$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Div2View div2View;
        Object startPaymentUpdates;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PaymentIconViewHolder paymentIconViewHolder = this.this$0;
            CompositePaymentIconsView compositePaymentIconsView = this.$compositeView;
            String str = this.$titleVariable;
            div2View = paymentIconViewHolder.divView;
            this.label = 1;
            startPaymentUpdates = paymentIconViewHolder.startPaymentUpdates(compositePaymentIconsView, str, div2View, this);
            if (startPaymentUpdates == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
