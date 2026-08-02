package com.yandex.go.account.phonish_upgrade;

import defpackage.cne0;
import defpackage.hzk;
import defpackage.jtq0;
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
@mvg(c = "com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2", f = "ForcePhonishUpgradeShowPolicyInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2(p pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2 forcePhonishUpgradeShowPolicyInteractor$showIfNeed$2 = (ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        forcePhonishUpgradeShowPolicyInteractor$showIfNeed$2.invokeSuspend(zy11Var);
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
        hzk hzkVar = this.this$0.a;
        int i = ((cne0) hzkVar.b).i("show_count", 0) + 1;
        cne0 cne0Var = (cne0) hzkVar.b;
        cne0Var.p(i, "show_count");
        cne0Var.p(hzkVar.i() + 1, "show_daily_count");
        cne0Var.q(((jtq0) hzkVar.a).c().getTime(), "last_showed_day");
        return zy11.a;
    }
}
