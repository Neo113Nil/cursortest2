package com.yandex.plus.core.network.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.impl.CallFactoryWithContextImpl$withContext$result$1", f = "CallFactoryWithContextImpl.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CallFactoryWithContextImpl$withContext$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ Object $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallFactoryWithContextImpl$withContext$result$1(wls wlsVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
        this.$context = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallFactoryWithContextImpl$withContext$result$1(this.$block, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallFactoryWithContextImpl$withContext$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        wls wlsVar = this.$block;
        Object obj2 = this.$context;
        this.label = 1;
        Object invoke = wlsVar.invoke(obj2, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
