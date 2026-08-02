package com.yandex.go.user_profile.ui.am;

import defpackage.adf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.am.AmProfileRouter$content$1$handleAction$1$1", f = "AmProfileRouter.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AmProfileRouter$content$1$handleAction$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ adf0 $action;
    final /* synthetic */ com.yandex.go.user_profile.ui.a $actionInteractor;
    final /* synthetic */ p $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmProfileRouter$content$1$handleAction$1$1(com.yandex.go.user_profile.ui.a aVar, adf0 adf0Var, p pVar, Continuation continuation) {
        super(2, continuation);
        this.$actionInteractor = aVar;
        this.$action = adf0Var;
        this.$innerNavigator = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AmProfileRouter$content$1$handleAction$1$1(this.$actionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AmProfileRouter$content$1$handleAction$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.user_profile.ui.a aVar = this.$actionInteractor;
            adf0 adf0Var = this.$action;
            p pVar = this.$innerNavigator;
            this.label = 1;
            if (aVar.a(adf0Var, pVar, this) == coroutineSingletons) {
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
