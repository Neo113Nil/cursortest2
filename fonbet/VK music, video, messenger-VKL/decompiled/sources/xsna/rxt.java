package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Response;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsHealthConnectDelegate$sendGetWorkoutsResultEvent$1", f = "GetWorkoutsHealthConnectDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class rxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ String $description;
    final /* synthetic */ String $requestId;
    final /* synthetic */ long $requestLoadTime;
    int label;
    final /* synthetic */ xxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxt(xxt xxtVar, int i, String str, long j, String str2, spj<? super rxt> spjVar) {
        super(1, spjVar);
        this.this$0 = xxtVar;
        this.$count = i;
        this.$description = str;
        this.$requestLoadTime = j;
        this.$requestId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new rxt(this.this$0, this.$count, this.$description, this.$requestLoadTime, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((rxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.superapp.base.js.bridge.b.p(this.this$0.b, new JsMethod("VKWebAppGetWorkouts"), new GetWorkouts$Response(null, new GetWorkouts$Response.Data(new GetWorkouts$Response.Data.Result(new Integer(this.$count), this.$description, new Integer((int) this.$requestLoadTime), null, null, 24, null), this.$requestId), this.$requestId, 1, null), null, null, false, null, 60);
        return s3q0.a;
    }
}
