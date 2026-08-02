package com.yandex.plus.pay.adapter.internal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/plus/pay/ui/core/internal/a;", "<anonymous>", "()Lcom/yandex/plus/pay/ui/core/internal/a;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.adapter.internal.PlusPaySdkAdapterImpl$plusPayUIDeferred$1", f = "PlusPaySdkAdapterImpl.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusPaySdkAdapterImpl$plusPayUIDeferred$1 extends SuspendLambda implements tls {
    final /* synthetic */ tls $getPlusPayUI;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPaySdkAdapterImpl$plusPayUIDeferred$1(tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.$getPlusPayUI = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlusPaySdkAdapterImpl$plusPayUIDeferred$1(this.$getPlusPayUI, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PlusPaySdkAdapterImpl$plusPayUIDeferred$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        tls tlsVar = this.$getPlusPayUI;
        this.label = 1;
        Object invoke = tlsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
