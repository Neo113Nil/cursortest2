package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.s0;
import defpackage.atj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s0;", "Latj0;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$3$1$1", f = "VerticalOffersStateInteractorV2.kt", l = {272}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$3$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ s0 $altAction;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$3$1$1(i0 i0Var, s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i0Var;
        this.$altAction = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$3$1$1(this.this$0, this.$altAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$3$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i0 i0Var = this.this$0;
            s0 s0Var = this.$altAction;
            this.label = 1;
            obj = i0.d(i0Var, s0Var, this);
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
        atj0 atj0Var = (atj0) obj;
        if (atj0Var != null) {
            return new Pair(this.$altAction, atj0Var);
        }
        return null;
    }
}
