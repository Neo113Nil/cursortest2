package com.yandex.go.chargers.subscription.presentation.landing;

import defpackage.mvg;
import defpackage.nta;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uta;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.presentation.landing.ChargersSubscriptionLandingRouter$content$1$1$1", f = "ChargersSubscriptionLandingRouter.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionLandingRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ uta $action;
    final /* synthetic */ d $chargersSubscriptionLandingUiActionInteractor;
    final /* synthetic */ nta $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionLandingRouter$content$1$1$1(d dVar, uta utaVar, nta ntaVar, Continuation continuation) {
        super(2, continuation);
        this.$chargersSubscriptionLandingUiActionInteractor = dVar;
        this.$action = utaVar;
        this.$innerNavigator = ntaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersSubscriptionLandingRouter$content$1$1$1(this.$chargersSubscriptionLandingUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionLandingRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.$chargersSubscriptionLandingUiActionInteractor;
            uta utaVar = this.$action;
            nta ntaVar = this.$innerNavigator;
            this.label = 1;
            if (dVar.a(utaVar, ntaVar, this) == coroutineSingletons) {
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
