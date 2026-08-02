package com.yandex.go.taxi.order.listener;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a5y0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.listener.TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2$1$1", f = "TaxiOrderFeedbackActivityListener.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2$1$1(b bVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2$1$1(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.a.b() == Lifecycle.State.STARTED) {
                com.yandex.go.taxi.order.interactors.a aVar = this.this$0.g;
                String str = this.$order.a;
                this.label = 1;
                obj = aVar.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((Boolean) obj).booleanValue()) {
            b bVar = this.this$0;
            bVar.f.b((m950) bVar.e.get(), new a5y0("show feedback", null, null, 30));
        }
        return zy11.a;
    }
}
