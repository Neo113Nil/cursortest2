package com.ybsdk.common.repositiories.creditlimit;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lzy11;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.creditlimit.CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1", f = "CreditLimitRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1 creditLimitRepository$setCreditLimitPurchaseSettings$2$1$1 = (CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1) create((Map) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        creditLimitRepository$setCreditLimitPurchaseSettings$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
