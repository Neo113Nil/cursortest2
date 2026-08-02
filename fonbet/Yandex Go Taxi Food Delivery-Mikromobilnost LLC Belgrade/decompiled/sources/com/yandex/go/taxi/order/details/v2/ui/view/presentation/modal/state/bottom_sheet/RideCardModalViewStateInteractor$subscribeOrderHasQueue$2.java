package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.ykk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasQueue", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.RideCardModalViewStateInteractor$subscribeOrderHasQueue$2", f = "RideCardModalViewStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardModalViewStateInteractor$subscribeOrderHasQueue$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardModalViewStateInteractor$subscribeOrderHasQueue$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardModalViewStateInteractor$subscribeOrderHasQueue$2 rideCardModalViewStateInteractor$subscribeOrderHasQueue$2 = new RideCardModalViewStateInteractor$subscribeOrderHasQueue$2(this.this$0, continuation);
        rideCardModalViewStateInteractor$subscribeOrderHasQueue$2.Z$0 = ((Boolean) obj).booleanValue();
        return rideCardModalViewStateInteractor$subscribeOrderHasQueue$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        RideCardModalViewStateInteractor$subscribeOrderHasQueue$2 rideCardModalViewStateInteractor$subscribeOrderHasQueue$2 = (RideCardModalViewStateInteractor$subscribeOrderHasQueue$2) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardModalViewStateInteractor$subscribeOrderHasQueue$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (z && this.this$0.a.c() != DriveState.COMPLETE) {
            r0 r0Var = this.this$0.b.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, ykk0.a((ykk0) value, 4, false, false, null, null, false, 62)));
        }
        return zy11.a;
    }
}
