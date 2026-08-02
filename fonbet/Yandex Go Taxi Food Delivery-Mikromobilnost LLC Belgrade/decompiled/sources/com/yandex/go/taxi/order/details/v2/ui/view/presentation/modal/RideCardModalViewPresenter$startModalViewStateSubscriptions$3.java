package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import defpackage.cfj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pfq0;
import defpackage.tse;
import defpackage.ukk0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.layers.domain.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalViewPresenter$startModalViewStateSubscriptions$3", f = "RideCardModalViewPresenter.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardModalViewPresenter$startModalViewStateSubscriptions$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ukk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardModalViewPresenter$startModalViewStateSubscriptions$3(ukk0 ukk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ukk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardModalViewPresenter$startModalViewStateSubscriptions$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardModalViewPresenter$startModalViewStateSubscriptions$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a aVar = this.this$0.D;
            this.label = 1;
            if (new w(((pfq0) aVar.h).a.b).collect(new cfj0(6, aVar), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
