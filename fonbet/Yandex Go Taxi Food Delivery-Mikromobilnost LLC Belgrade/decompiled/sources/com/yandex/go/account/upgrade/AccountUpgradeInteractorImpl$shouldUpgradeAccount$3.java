package com.yandex.go.account.upgrade;

import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lhl3;", "", "<destruct>", "Lcom/yandex/go/account/upgrade/ForceAccountUpgradeExperiment;", "experiment", "<anonymous>", "(Lkotlin/Pair;Lcom/yandex/go/account/upgrade/ForceAccountUpgradeExperiment;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.upgrade.AccountUpgradeInteractorImpl$shouldUpgradeAccount$3", f = "AccountUpgradeInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AccountUpgradeInteractorImpl$shouldUpgradeAccount$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AccountUpgradeInteractorImpl$shouldUpgradeAccount$3 accountUpgradeInteractorImpl$shouldUpgradeAccount$3 = new AccountUpgradeInteractorImpl$shouldUpgradeAccount$3(3, (Continuation) obj3);
        accountUpgradeInteractorImpl$shouldUpgradeAccount$3.L$0 = (Pair) obj;
        accountUpgradeInteractorImpl$shouldUpgradeAccount$3.L$1 = (ForceAccountUpgradeExperiment) obj2;
        return accountUpgradeInteractorImpl$shouldUpgradeAccount$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        ForceAccountUpgradeExperiment forceAccountUpgradeExperiment = (ForceAccountUpgradeExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair((hl3) pair.getFirst(), forceAccountUpgradeExperiment);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
