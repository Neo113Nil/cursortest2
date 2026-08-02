package com.yandex.plus.core.network.interceptor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uv50;
import defpackage.yci0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Input", "Output", "Luv50;", "<anonymous>", "()Luv50;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.interceptor.NetworkInterceptorChainImpl$getInterceptor$result$1", f = "NetworkInterceptorChainImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkInterceptorChainImpl$getInterceptor$result$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInterceptorChainImpl$getInterceptor$result$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkInterceptorChainImpl$getInterceptor$result$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((NetworkInterceptorChainImpl$getInterceptor$result$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        if (aVar.d >= aVar.c.size()) {
            ny61.r("Check failed.");
            return null;
        }
        a aVar2 = this.this$0;
        boolean z = aVar2.f;
        int i = aVar2.d;
        ArrayList arrayList = aVar2.c;
        if (z || aVar2.g == 0) {
            aVar2.g++;
            return (uv50) arrayList.get(i);
        }
        yci0.n("interceptor ", arrayList.get(i), " must call proceed() exactly once");
        return null;
    }
}
