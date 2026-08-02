package xsna;

import com.vk.push.pushsdk.ipc.BasePushService;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasePushService.kt */
@b6l(c = "com.vk.push.pushsdk.ipc.BasePushService$emitNeedToStopServiceByInteractor$1", f = "BasePushService.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class vl6 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $needToStop;
    int label;
    final /* synthetic */ BasePushService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl6(BasePushService basePushService, boolean z, spj<? super vl6> spjVar) {
        super(2, spjVar);
        this.this$0 = basePushService;
        this.$needToStop = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vl6(this.this$0, this.$needToStop, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vl6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.this$0.j;
            Boolean valueOf = Boolean.valueOf(this.$needToStop);
            this.label = 1;
            if (caj0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
