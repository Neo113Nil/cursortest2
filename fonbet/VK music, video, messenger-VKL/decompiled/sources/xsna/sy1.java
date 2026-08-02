package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oy1;

/* compiled from: AnalyticsWebSocketListener.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.AnalyticsWebSocketListener$stopLoop$1", f = "AnalyticsWebSocketListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class sy1 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ oy1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(oy1 oy1Var, spj<? super sy1> spjVar) {
        super(1, spjVar);
        this.this$0 = oy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new sy1(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((sy1) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eyx eyxVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        oy1.a aVar = this.this$0.f;
        if (aVar != null && (eyxVar = aVar.d) != null) {
            eyxVar.b(null);
        }
        return s3q0.a;
    }
}
