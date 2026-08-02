package com.ybsdk.feature.savings.internal.helpers;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.g5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.helpers.SavingsAccountActionsHelperImpl$close$1$2$1", f = "SavingsAccountActionsHelperImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountActionsHelperImpl$close$1$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountActionsHelperImpl$close$1$2$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountActionsHelperImpl$close$1$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SavingsAccountActionsHelperImpl$close$1$2$1 savingsAccountActionsHelperImpl$close$1$2$1 = (SavingsAccountActionsHelperImpl$close$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        savingsAccountActionsHelperImpl$close$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        g5 g5Var = this.this$0.d;
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        Text.Resource h = unr0.h(bVar, dzh0.ybsdk_savings_account_closing_failed_title);
        int i = dzh0.ybsdk_common_error_try_again;
        bVar.getClass();
        g5Var.c(h, new Text.Resource(i));
        return zy11.a;
    }
}
