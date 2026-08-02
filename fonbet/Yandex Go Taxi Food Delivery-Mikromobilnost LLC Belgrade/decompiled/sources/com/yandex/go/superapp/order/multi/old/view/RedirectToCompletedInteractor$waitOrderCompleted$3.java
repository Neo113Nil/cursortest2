package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ra80;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/object/DriveState;", "driveState", "Lra80;", "orderViewState", "", "<anonymous>", "(Lru/yandex/taxi/object/DriveState;Lra80;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.RedirectToCompletedInteractor$waitOrderCompleted$3", f = "RedirectToCompletedInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RedirectToCompletedInteractor$waitOrderCompleted$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectToCompletedInteractor$waitOrderCompleted$3(l lVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RedirectToCompletedInteractor$waitOrderCompleted$3 redirectToCompletedInteractor$waitOrderCompleted$3 = new RedirectToCompletedInteractor$waitOrderCompleted$3(this.this$0, (Continuation) obj3);
        redirectToCompletedInteractor$waitOrderCompleted$3.L$0 = (DriveState) obj;
        redirectToCompletedInteractor$waitOrderCompleted$3.L$1 = (ra80) obj2;
        return redirectToCompletedInteractor$waitOrderCompleted$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderScreen orderScreen;
        DriveState driveState = (DriveState) this.L$0;
        ra80 ra80Var = (ra80) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        return Boolean.valueOf(DriveState.COMPLETE == driveState && ((orderScreen = ra80Var.a) == OrderScreen.ORDER_LIST || orderScreen == OrderScreen.ORDER_TRACKING));
    }
}
