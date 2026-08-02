package com.ybsdk.feature.main.internal.screens.userCards;

import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qas0;
import defpackage.tse;
import defpackage.uk21;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.userCards.UserCardsFragment$consumeSideEffect$1", f = "UserCardsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserCardsFragment$consumeSideEffect$1 extends SuspendLambda implements wls {
    final /* synthetic */ qas0 $sideEffect;
    int label;
    final /* synthetic */ UserCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardsFragment$consumeSideEffect$1(UserCardsFragment userCardsFragment, qas0 qas0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userCardsFragment;
        this.$sideEffect = qas0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserCardsFragment$consumeSideEffect$1(this.this$0, this.$sideEffect, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserCardsFragment$consumeSideEffect$1 userCardsFragment$consumeSideEffect$1 = (UserCardsFragment$consumeSideEffect$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userCardsFragment$consumeSideEffect$1.invokeSuspend(zy11Var);
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
        com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, this.this$0.requireActivity(), ((uk21) this.$sideEffect).a, null, 12);
        return zy11.a;
    }
}
