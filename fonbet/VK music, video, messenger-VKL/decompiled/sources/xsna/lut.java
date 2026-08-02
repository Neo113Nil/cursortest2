package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* compiled from: GetStepsCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsCommand$handleStepsSyncCompleted$1", f = "GetStepsCommand.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class lut extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ long $startTimestamp;
    int label;
    final /* synthetic */ kut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lut(long j, long j2, kut kutVar, spj<? super lut> spjVar) {
        super(1, spjVar);
        this.$startTimestamp = j;
        this.$endTimestamp = j2;
        this.this$0 = kutVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new lut(this.$startTimestamp, this.$endTimestamp, this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((lut) create(spjVar)).invokeSuspend(s3q0.a);
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
        mft0.a(xe9.a("VkStepsGetStepsCommand.handleStepsSyncCompleted() -> from_date: ", j, ", to_date: ", j2, ", thread: "), xgx0.a);
        r6y r6yVar = this.this$0.b;
        if (r6yVar != null) {
            JsApiEvent jsApiEvent = JsApiEvent.STEPS_SYNC_COMPLETED;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_date", j);
            jSONObject.put("to_date", j2);
            s3q0 s3q0Var = s3q0.a;
            r6yVar.x(jsApiEvent, jSONObject);
        }
        return s3q0.a;
    }
}
