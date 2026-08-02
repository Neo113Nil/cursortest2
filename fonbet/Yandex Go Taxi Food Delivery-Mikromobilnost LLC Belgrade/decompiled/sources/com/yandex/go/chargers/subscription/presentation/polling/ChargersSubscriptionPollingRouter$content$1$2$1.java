package com.yandex.go.chargers.subscription.presentation.polling;

import defpackage.cy9;
import defpackage.jl40;
import defpackage.kua;
import defpackage.lua;
import defpackage.ly9;
import defpackage.m950;
import defpackage.mua;
import defpackage.mvg;
import defpackage.nua;
import defpackage.ny61;
import defpackage.oua;
import defpackage.pua;
import defpackage.qu;
import defpackage.qua;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.presentation.polling.ChargersSubscriptionPollingRouter$content$1$2$1", f = "ChargersSubscriptionPollingRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionPollingRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ pua $action;
    final /* synthetic */ qua $chargersSubscriptionPollingUiActionInteractor;
    final /* synthetic */ lua $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionPollingRouter$content$1$2$1(qua quaVar, pua puaVar, lua luaVar, Continuation continuation) {
        super(2, continuation);
        this.$chargersSubscriptionPollingUiActionInteractor = quaVar;
        this.$action = puaVar;
        this.$innerNavigator = luaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersSubscriptionPollingRouter$content$1$2$1(this.$chargersSubscriptionPollingUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersSubscriptionPollingRouter$content$1$2$1 chargersSubscriptionPollingRouter$content$1$2$1 = (ChargersSubscriptionPollingRouter$content$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersSubscriptionPollingRouter$content$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qua quaVar = this.$chargersSubscriptionPollingUiActionInteractor;
        pua puaVar = this.$action;
        lua luaVar = this.$innerNavigator;
        quaVar.getClass();
        if (jl40.l(puaVar, nua.a)) {
            luaVar.a.r(new qu(9));
        } else {
            if (!(puaVar instanceof oua)) {
                w511.b();
                return null;
            }
            cy9 cy9Var = ((oua) puaVar).a;
            mua muaVar = luaVar.a;
            muaVar.A((m950) muaVar.H.get(), new ly9(cy9Var), new kua(muaVar));
        }
        return zy11.a;
    }
}
