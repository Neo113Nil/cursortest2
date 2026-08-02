package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.StepsSyncCompleted$Response;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsGoogleFitDelegate$handleStepsSyncCompleted$1", f = "GetStepsGoogleFitDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class wut extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ String $requestId;
    final /* synthetic */ long $startTimestamp;
    int label;
    final /* synthetic */ uut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wut(long j, long j2, uut uutVar, String str, spj<? super wut> spjVar) {
        super(1, spjVar);
        this.$startTimestamp = j;
        this.$endTimestamp = j2;
        this.this$0 = uutVar;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new wut(this.$startTimestamp, this.$endTimestamp, this.this$0, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((wut) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        qvo0 qvo0Var = qvo0.a;
        String j = qvo0.j(qvo0Var, this.$startTimestamp);
        String j2 = qvo0.j(qvo0Var, this.$endTimestamp);
        mft0.a(xe9.a("VkStepsGetStepsGoogleFitDelegate.handleStepsSyncCompleted() -> from_date: ", j, ", to_date: ", j2, ", thread: "), xgx0.a);
        this.this$0.b.n(new JsMethod("VKWebAppStepsSyncCompleted"), new StepsSyncCompleted$Response(null, new StepsSyncCompleted$Response.Data(j, j2, this.$requestId), this.$requestId, 1, null));
        return s3q0.a;
    }
}
