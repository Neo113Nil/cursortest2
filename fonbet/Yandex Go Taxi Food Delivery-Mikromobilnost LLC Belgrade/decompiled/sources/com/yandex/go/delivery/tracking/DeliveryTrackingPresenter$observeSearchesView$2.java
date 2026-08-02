package com.yandex.go.delivery.tracking;

import com.yandex.go.delivery.tracking.map_overlay.r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qui;
import defpackage.roi;
import defpackage.toi;
import defpackage.uoi;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.deliveries.map.search.DeliverySearchViews;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luoi;", "pulsar", "Lzy11;", "<anonymous>", "(Luoi;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.DeliveryTrackingPresenter$observeSearchesView$2", f = "DeliveryTrackingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryTrackingPresenter$observeSearchesView$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTrackingPresenter$observeSearchesView$2(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryTrackingPresenter$observeSearchesView$2 deliveryTrackingPresenter$observeSearchesView$2 = new DeliveryTrackingPresenter$observeSearchesView$2(this.this$0, continuation);
        deliveryTrackingPresenter$observeSearchesView$2.L$0 = obj;
        return deliveryTrackingPresenter$observeSearchesView$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryTrackingPresenter$observeSearchesView$2 deliveryTrackingPresenter$observeSearchesView$2 = (DeliveryTrackingPresenter$observeSearchesView$2) create((uoi) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryTrackingPresenter$observeSearchesView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        uoi uoiVar = (uoi) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = uoiVar instanceof toi;
        r0 r0Var = this.this$0.c0;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, uoiVar));
        if (z) {
            this.this$0.y.a(false);
        }
        r rVar = this.this$0.z;
        roi roiVar = new roi(uoiVar);
        DeliverySearchViews deliverySearchViews = rVar.c;
        if (deliverySearchViews != null) {
            deliverySearchViews.render(roiVar);
        }
        ((qui) this.this$0.Dg()).setMapFocusAboveCard();
        return zy11.a;
    }
}
