package com.yandex.go.scooters.offers.v2.domain;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.d0p0;
import defpackage.iin0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xvn0;
import defpackage.y5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.ScootersLayoutEventsRepository$listenToLayoutCompletion$$inlined$simpleCallbackApiToFlow$1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly5n0;", "it", "Lzy11;", "<anonymous>", "(Ly5n0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersSuccessOfferLayoutInteractor$listenToLastLayoutEvent$1", f = "ScootersSuccessOfferLayoutInteractor.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuccessOfferLayoutInteractor$listenToLastLayoutEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ d0p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuccessOfferLayoutInteractor$listenToLastLayoutEvent$1(d0p0 d0p0Var, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d0p0Var;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuccessOfferLayoutInteractor$listenToLastLayoutEvent$1(this.this$0, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuccessOfferLayoutInteractor$listenToLastLayoutEvent$1) create((y5n0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d0p0 d0p0Var = this.this$0;
        View view = this.$view;
        this.label = 1;
        xvn0 xvn0Var = d0p0Var.a;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        xvn0Var.getClass();
        Object y = kotlinx.coroutines.flow.e.y(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new ScootersLayoutEventsRepository$listenToLayoutCompletion$$inlined$simpleCallbackApiToFlow$1(new iin0(6, viewTreeObserver), null)), 500L), this);
        if (y != coroutineSingletons) {
            y = zy11Var;
        }
        return y == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
