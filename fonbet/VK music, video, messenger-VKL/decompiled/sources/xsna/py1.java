package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oy1;

/* compiled from: AnalyticsWebSocketListener.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.AnalyticsWebSocketListener$onAlive$1", f = "AnalyticsWebSocketListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class py1 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ oy1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py1(oy1 oy1Var, spj<? super py1> spjVar) {
        super(1, spjVar);
        this.this$0 = oy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new py1(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((py1) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        oy1.a aVar = this.this$0.f;
        if (aVar == null) {
            return s3q0.a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - aVar.b;
        oy1 oy1Var = this.this$0;
        long j2 = aVar.a + j;
        oy1Var.f = new oy1.a(j2, currentTimeMillis, j, aVar.d);
        w80 w80Var = oy1Var.b;
        myc0.h(w80Var.e, null, null, new y80(w80Var, j, j2, null), 3);
        return s3q0.a;
    }
}
