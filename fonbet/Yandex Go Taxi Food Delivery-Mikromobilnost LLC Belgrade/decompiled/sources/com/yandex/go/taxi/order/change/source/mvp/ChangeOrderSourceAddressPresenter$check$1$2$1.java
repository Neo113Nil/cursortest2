package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$CloseReasonV2;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.change.source.interactor.e;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.ac9;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sf9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$check$1$2$1", f = "ChangeOrderSourceAddressPresenter.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$check$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$check$1$2$1(Throwable th, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$it = th;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$check$1$2$1(this.$it, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$check$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChangeOrderState$Unavailable changeOrderState$Unavailable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Throwable th = this.$it;
            if (!(th instanceof GoApiHttpException) || ((GoApiHttpException) th).getCode() != 404) {
                r12.Ng(false, (r3 & 2) == 0, (ChangeSourcePointExperiment) this.this$0.H.getValue());
                ((ac9) this.this$0.Dg()).changePinState(new sf9(0));
                return zy11.a;
            }
            d dVar = this.this$0;
            e eVar = dVar.D;
            o2y0 o2y0Var = dVar.x.a;
            ChangeOrderState$Source changeOrderState$Source = ChangeOrderState$Source.SOURCE_POINT;
            ChangeSourcePointExperiment changeSourcePointExperiment = (ChangeSourcePointExperiment) this.this$0.H.getValue();
            String Y = d6z.Y(changeSourcePointExperiment, changeSourcePointExperiment.f.a);
            ChangeSourcePointExperiment changeSourcePointExperiment2 = (ChangeSourcePointExperiment) this.this$0.H.getValue();
            changeOrderState$Unavailable = new ChangeOrderState$Unavailable(changeOrderState$Source, new OrderChangesDto.Notification((String) null, Y, d6z.Y(changeSourcePointExperiment2, changeSourcePointExperiment2.f.b), ChangeOrderNotificationActionResponse.COMMUNICATE_WITH_DRIVER, 1));
            this.label = 1;
            if (eVar.b(o2y0Var, changeOrderState$Unavailable, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.F.b(ChangePointInActiveOrderAnalytics$CloseReasonV2.CheckFailed);
        ((ac9) this.this$0.Dg()).onBack();
        return zy11.a;
    }
}
