package com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact;

import defpackage.eek0;
import defpackage.ibk0;
import defpackage.jbk0;
import defpackage.mvg;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wrs0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactPresenter$handleAction$1", f = "RideCardCompactPresenter.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompactPresenter$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ nqs0 $action;
    final /* synthetic */ wrs0 $analytics;
    int label;
    final /* synthetic */ eek0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompactPresenter$handleAction$1(eek0 eek0Var, nqs0 nqs0Var, wrs0 wrs0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eek0Var;
        this.$action = nqs0Var;
        this.$analytics = wrs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardCompactPresenter$handleAction$1(this.this$0, this.$action, this.$analytics, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompactPresenter$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jbk0 jbk0Var = this.this$0.z;
            ibk0 ibk0Var = (ibk0) this.$action;
            wrs0 wrs0Var = this.$analytics;
            this.label = 1;
            if (jbk0Var.a(ibk0Var, wrs0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
