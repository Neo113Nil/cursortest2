package com.yandex.go.taxi.order.view;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderMvpView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.view.OrderPresenter$addCardStateChangeSubscription$1", f = "OrderPresenter.kt", l = {406}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPresenter$addCardStateChangeSubscription$1 extends SuspendLambda implements wls {
    final /* synthetic */ DriveState $state;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPresenter$addCardStateChangeSubscription$1(e eVar, DriveState driveState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$state = driveState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPresenter$addCardStateChangeSubscription$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPresenter$addCardStateChangeSubscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DriveState driveState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.C.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            OrderPresenter$addCardStateChangeSubscription$1$hasQueue$1 orderPresenter$addCardStateChangeSubscription$1$hasQueue$1 = new OrderPresenter$addCardStateChangeSubscription$1$hasQueue$1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(mdhVar, orderPresenter$addCardStateChangeSubscription$1$hasQueue$1, this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e eVar = this.this$0;
        if (booleanValue) {
            ((OrderMvpView) eVar.Dg()).setBottomSheetState(4);
        } else if (!tje.L(eVar.A) || (driveState = this.$state) == DriveState.SEARCH || driveState == DriveState.PREORDER) {
            ((OrderMvpView) this.this$0.Dg()).setBottomSheetState(6);
        } else {
            ((OrderMvpView) this.this$0.Dg()).setBottomSheetState(3);
        }
        return zy11.a;
    }
}
