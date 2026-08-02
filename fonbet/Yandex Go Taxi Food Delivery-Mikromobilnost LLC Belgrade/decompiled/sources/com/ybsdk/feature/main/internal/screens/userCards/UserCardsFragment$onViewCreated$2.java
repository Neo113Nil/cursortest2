package com.ybsdk.feature.main.internal.screens.userCards;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.userCards.UserCardsFragment$onViewCreated$2", f = "UserCardsFragment.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserCardsFragment$onViewCreated$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ UserCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardsFragment$onViewCreated$2(UserCardsFragment userCardsFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userCardsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserCardsFragment$onViewCreated$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserCardsFragment$onViewCreated$2 userCardsFragment$onViewCreated$2 = (UserCardsFragment$onViewCreated$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userCardsFragment$onViewCreated$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            UserCardsFragment.access$getNfcPaymentController$p(this.this$0);
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
