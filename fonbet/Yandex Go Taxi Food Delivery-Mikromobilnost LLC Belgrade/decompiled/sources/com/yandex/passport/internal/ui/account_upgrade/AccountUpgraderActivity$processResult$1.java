package com.yandex.passport.internal.ui.account_upgrade;

import com.yandex.passport.api.w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity$processResult$1", f = "AccountUpgraderActivity.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AccountUpgraderActivity$processResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ w $authResult;
    int label;
    final /* synthetic */ AccountUpgraderActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUpgraderActivity$processResult$1(AccountUpgraderActivity accountUpgraderActivity, w wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = accountUpgraderActivity;
        this.$authResult = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountUpgraderActivity$processResult$1(this.this$0, this.$authResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountUpgraderActivity$processResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object onResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AccountUpgraderActivity accountUpgraderActivity = this.this$0;
            w wVar = this.$authResult;
            this.label = 1;
            onResult = accountUpgraderActivity.onResult(wVar, this);
            if (onResult == coroutineSingletons) {
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
