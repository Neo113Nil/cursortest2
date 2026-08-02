package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$CloseReasonV2;
import com.yandex.go.taxi.order.change.source.data.ChangeSourceMessageResponse;
import com.yandex.go.taxi.order.change.source.data.CheckChangeSourceResponse;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.change.source.interactor.e;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ac9;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pv0;
import defpackage.sf9;
import defpackage.tf9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$check$1$1$1", f = "ChangeOrderSourceAddressPresenter.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$check$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ fmt $response;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$check$1$1$1(pv0 pv0Var, fmt fmtVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$response = fmtVar;
        this.this$0 = dVar;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$check$1$1$1(this.$addressInfo, this.$response, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$check$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            CheckChangeSourceResponse checkChangeSourceResponse = (CheckChangeSourceResponse) this.$response.a;
            boolean z = checkChangeSourceResponse.a;
            String str = checkChangeSourceResponse.c;
            ChangeSourceMessageResponse changeSourceMessageResponse = checkChangeSourceResponse.d;
            if (z) {
                CheckChangeSourceResponse.Point point = (CheckChangeSourceResponse.Point) kotlin.collections.a.R(checkChangeSourceResponse.b);
                if (point == null || !point.a) {
                    r1.Ng(false, (r3 & 2) == 0, (ChangeSourcePointExperiment) this.this$0.H.getValue());
                    ac9 ac9Var = (ac9) this.this$0.Dg();
                    String str2 = changeSourceMessageResponse != null ? changeSourceMessageResponse.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = changeSourceMessageResponse != null ? changeSourceMessageResponse.b : null;
                    ac9Var.changePinState(new sf9(str2, str3 != null ? str3 : ""));
                    this.this$0.F.a(false, this.$addressInfo.a.B(), str, this.$response.e.a("X-YaTraceId"));
                    return zy11Var;
                }
                r8.Ng(true, (r3 & 2) == 0, (ChangeSourcePointExperiment) this.this$0.H.getValue());
                ac9 ac9Var2 = (ac9) this.this$0.Dg();
                Double d = point.b;
                Integer num = d != null ? new Integer((int) d.doubleValue()) : null;
                OrderStatusInfo V = this.this$0.x.a.b().V();
                V.getClass();
                ac9Var2.changePinState(new tf9(num, V.f(SimpleBooleanExperiment.ETA_SHOULD_USE_FLOOR)));
                d dVar = this.this$0;
                pv0 pv0Var = this.$addressInfo;
                dVar.J = pv0Var;
                dVar.F.a(true, pv0Var.a.B(), str, this.$response.e.a("X-YaTraceId"));
                return zy11Var;
            }
            d dVar2 = this.this$0;
            e eVar = dVar2.D;
            o2y0 o2y0Var = dVar2.x.a;
            ChangeOrderState$Source changeOrderState$Source = ChangeOrderState$Source.SOURCE_POINT;
            String str4 = changeSourceMessageResponse != null ? changeSourceMessageResponse.a : null;
            ChangeOrderState$Unavailable changeOrderState$Unavailable = new ChangeOrderState$Unavailable(changeOrderState$Source, new OrderChangesDto.Notification((String) null, str4 == null ? "" : str4, changeSourceMessageResponse != null ? changeSourceMessageResponse.b : null, ChangeOrderNotificationActionResponse.COMMUNICATE_WITH_DRIVER, 1));
            this.L$0 = null;
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
        this.this$0.F.b(ChangePointInActiveOrderAnalytics$CloseReasonV2.CheckUnavailable);
        ((ac9) this.this$0.Dg()).onBack();
        return zy11Var;
    }
}
