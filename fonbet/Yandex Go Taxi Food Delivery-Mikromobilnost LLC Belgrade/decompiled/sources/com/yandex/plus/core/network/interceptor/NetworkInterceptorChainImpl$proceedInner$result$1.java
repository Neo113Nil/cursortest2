package com.yandex.plus.core.network.interceptor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sz50;
import defpackage.tls;
import defpackage.uv50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Output", "Lsz50;", "<anonymous>", "()Lsz50;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.interceptor.NetworkInterceptorChainImpl$proceedInner$result$1", f = "NetworkInterceptorChainImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkInterceptorChainImpl$proceedInner$result$1 extends SuspendLambda implements tls {
    final /* synthetic */ Object $input;
    final /* synthetic */ uv50 $interceptor;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInterceptorChainImpl$proceedInner$result$1(a aVar, Object obj, uv50 uv50Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$input = obj;
        this.$interceptor = uv50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkInterceptorChainImpl$proceedInner$result$1(this.this$0, this.$input, this.$interceptor, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((NetworkInterceptorChainImpl$proceedInner$result$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            a aVar2 = new a(aVar.a, this.$input, aVar.c, aVar.d + 1, aVar.e, aVar.f);
            uv50 uv50Var = this.$interceptor;
            this.L$0 = null;
            this.label = 1;
            obj = uv50Var.a(aVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (sz50) obj;
    }
}
