package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/v0;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/v0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomsheetViewModel$start$1$currentState$1", f = "LogoutBottomsheetViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LogoutBottomsheetViewModel$start$1$currentState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomsheetViewModel$start$1$currentState$1(x0 x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogoutBottomsheetViewModel$start$1$currentState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogoutBottomsheetViewModel$start$1$currentState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.flow.n0 n0Var = this.this$0.A;
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(n0Var, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
