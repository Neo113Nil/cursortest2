package com.yandex.plus.pay.ui.yb.web.internal.ui;

import defpackage.lz51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Llz51;", "effect", "Lzy11;", "<anonymous>", "(Ltse;Llz51;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity$onCreate$4", f = "PlusPayYbWebActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlusPayYbWebActivity$onCreate$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlusPayYbWebActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayYbWebActivity$onCreate$4(PlusPayYbWebActivity plusPayYbWebActivity, Continuation continuation) {
        super(3, continuation);
        this.this$0 = plusPayYbWebActivity;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusPayYbWebActivity$onCreate$4 plusPayYbWebActivity$onCreate$4 = new PlusPayYbWebActivity$onCreate$4(this.this$0, (Continuation) obj3);
        plusPayYbWebActivity$onCreate$4.L$0 = (lz51) obj2;
        zy11 zy11Var = zy11.a;
        plusPayYbWebActivity$onCreate$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lz51 lz51Var = (lz51) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.showScreeEffect(lz51Var);
        return zy11.a;
    }
}
