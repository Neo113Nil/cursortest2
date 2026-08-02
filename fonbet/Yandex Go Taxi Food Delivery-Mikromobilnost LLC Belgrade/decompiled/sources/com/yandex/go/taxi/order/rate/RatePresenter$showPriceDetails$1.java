package com.yandex.go.taxi.order.rate;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.g7i0;
import defpackage.hze0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.rate.RatePresenter$showPriceDetails$1", f = "RatePresenter.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RatePresenter$showPriceDetails$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<hze0> $details;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatePresenter$showPriceDetails$1(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$details = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatePresenter$showPriceDetails$1(this.this$0, this.$details, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RatePresenter$showPriceDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.D.getClass();
            sjh sjhVar = uyj.a;
            RatePresenter$showPriceDetails$1$priceDetails$1 ratePresenter$showPriceDetails$1$priceDetails$1 = new RatePresenter$showPriceDetails$1$priceDetails$1(this.this$0, this.$details, null);
            this.label = 1;
            obj = tje.k0(sjhVar, ratePresenter$showPriceDetails$1$priceDetails$1, this);
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
        g7i0 g7i0Var = (g7i0) this.this$0.Dg();
        OrderStatusInfo V = this.this$0.x.b().V();
        V.getClass();
        g7i0Var.showPriceDetails((List) obj, V.f(SimpleBooleanExperiment.NEW_COST_BREAKDOWN));
        return zy11.a;
    }
}
