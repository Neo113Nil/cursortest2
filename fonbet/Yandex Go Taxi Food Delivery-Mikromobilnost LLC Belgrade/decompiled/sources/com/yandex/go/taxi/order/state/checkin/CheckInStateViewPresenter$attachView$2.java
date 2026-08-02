package com.yandex.go.taxi.order.state.checkin;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.CheckInAction;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.UiConfig;
import defpackage.ifb1;
import defpackage.kfb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yfb;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.checkin.CheckInButtonState;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.styling.ButtonType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lru/yandex/taxi/checkin/CheckInButtonState;", "checkInButtonState", "Lyfb;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lru/yandex/taxi/checkin/CheckInButtonState;)Lyfb;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.checkin.CheckInStateViewPresenter$attachView$2", f = "CheckInStateViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CheckInStateViewPresenter$attachView$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckInStateViewPresenter$attachView$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CheckInStateViewPresenter$attachView$2 checkInStateViewPresenter$attachView$2 = new CheckInStateViewPresenter$attachView$2(this.this$0, (Continuation) obj3);
        checkInStateViewPresenter$attachView$2.L$0 = (TaxiOrder) obj;
        checkInStateViewPresenter$attachView$2.L$1 = (CheckInButtonState) obj2;
        return checkInStateViewPresenter$attachView$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CheckInButtonState checkInButtonState = (CheckInButtonState) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        aVar.getClass();
        CheckInInfo checkInInfo = taxiOrder.V().a0;
        if (checkInInfo == null) {
            return yfb.j;
        }
        UiConfig uiConfig = checkInInfo.c;
        kfb1 b = ifb1.b(checkInInfo);
        CheckInAction checkInAction = uiConfig.a;
        String str = checkInAction.a;
        String str2 = checkInAction.b;
        CheckInStateActionType a = ifb1.a(checkInInfo);
        CheckInAction checkInAction2 = uiConfig.a;
        return new yfb(checkInButtonState, true, b, a, str, str2, checkInAction2.c, checkInAction2.d, aVar.V.d(taxiOrder.M(), taxiOrder.x()).a.a(ButtonType.PROMO));
    }
}
