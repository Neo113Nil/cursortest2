package com.yandex.messaging.domain.actions;

import defpackage.cl21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wx4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lcl21;", "user", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.actions.BaseAuthAction$doWork$2", f = "BaseAuthAction.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseAuthAction$doWork$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wx4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAuthAction$doWork$2(wx4 wx4Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wx4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseAuthAction$doWork$2 baseAuthAction$doWork$2 = new BaseAuthAction$doWork$2(this.this$0, continuation);
        baseAuthAction$doWork$2.L$0 = obj;
        return baseAuthAction$doWork$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAuthAction$doWork$2) create((cl21) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        cl21 cl21Var = (cl21) this.L$0;
        wx4 wx4Var = this.this$0;
        this.label = 1;
        Object b = wx4Var.b(cl21Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
