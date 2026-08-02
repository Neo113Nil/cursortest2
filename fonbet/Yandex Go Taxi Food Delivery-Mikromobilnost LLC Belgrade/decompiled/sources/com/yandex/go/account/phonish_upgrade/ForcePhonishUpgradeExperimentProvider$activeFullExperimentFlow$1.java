package com.yandex.go.account.phonish_upgrade;

import com.yandex.go.analytics.AccountType;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/account/phonish_upgrade/ForcePhonishUpgradeExperiment;", "experiment", "accountType", "Lcom/yandex/go/analytics/AccountType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1", f = "ForcePhonishUpgradeExperimentProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ForcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ForcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1 forcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1 = new ForcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1(this.this$0, (Continuation) obj3);
        forcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1.L$0 = (ForcePhonishUpgradeExperiment) obj;
        forcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1.L$1 = (AccountType) obj2;
        return forcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ForcePhonishUpgradeExperiment forcePhonishUpgradeExperiment = (ForcePhonishUpgradeExperiment) this.L$0;
        AccountType accountType = (AccountType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        return jl40.l(accountType != null ? accountType.getEventValue() : null, AccountType.Phonish.getEventValue()) ? forcePhonishUpgradeExperiment : new ForcePhonishUpgradeExperiment(0);
    }
}
