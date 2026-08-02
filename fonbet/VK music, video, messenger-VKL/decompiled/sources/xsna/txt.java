package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.WorkoutsSyncCompleted$Response;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsHealthConnectDelegate$sendWorkoutsSyncCompletedEvent$1", f = "GetWorkoutsHealthConnectDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class txt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ int $amountWorkouts;
    int label;
    final /* synthetic */ xxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txt(xxt xxtVar, int i, spj<? super txt> spjVar) {
        super(1, spjVar);
        this.this$0 = xxtVar;
        this.$amountWorkouts = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new txt(this.this$0, this.$amountWorkouts, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((txt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        String b = defpackage.j0.b("VKWebAppGetWorkouts", this.this$0.b);
        this.this$0.b.n(new JsMethod("VKWebAppWorkoutsSyncCompleted"), new WorkoutsSyncCompleted$Response(null, new WorkoutsSyncCompleted$Response.Data(this.$amountWorkouts, b), b, 1, null));
        return s3q0.a;
    }
}
