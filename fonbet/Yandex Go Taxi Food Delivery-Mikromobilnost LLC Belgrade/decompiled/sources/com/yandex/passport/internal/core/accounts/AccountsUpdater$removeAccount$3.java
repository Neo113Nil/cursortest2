package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import com.yandex.passport.internal.usecase.d1;
import com.yandex.passport.internal.usecase.f1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.core.accounts.AccountsUpdater$removeAccount$3", f = "AccountsUpdater.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AccountsUpdater$removeAccount$3 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $modernAccount;
    final /* synthetic */ RevokePlace $revokePlace;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountsUpdater$removeAccount$3(g gVar, ModernAccount modernAccount, RevokePlace revokePlace, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$modernAccount = modernAccount;
        this.$revokePlace = revokePlace;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountsUpdater$removeAccount$3(this.this$0, this.$modernAccount, this.$revokePlace, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountsUpdater$removeAccount$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f1 f1Var = this.this$0.j;
            ModernAccount modernAccount = this.$modernAccount;
            MasterToken masterToken = modernAccount.getMasterToken();
            d1 d1Var = new d1(this.$modernAccount.getAccount());
            Uid uid = this.$modernAccount.getUid();
            RevokePlace revokePlace = this.$revokePlace;
            this.label = 1;
            c = f1.c(f1Var, modernAccount, masterToken, d1Var, uid, revokePlace, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
