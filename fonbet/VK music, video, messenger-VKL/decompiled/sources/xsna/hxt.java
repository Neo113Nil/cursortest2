package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Response;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetWorkoutPermissionsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutPermissionsGoogleFitDelegate$execute$1", f = "GetWorkoutPermissionsGoogleFitDelegate.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class hxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ ixt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxt(ixt ixtVar, FragmentActivity fragmentActivity, String str, spj<? super hxt> spjVar) {
        super(1, spjVar);
        this.this$0 = ixtVar;
        this.$activity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new hxt(this.this$0, this.$activity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((hxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.e;
            FragmentActivity fragmentActivity = this.$activity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
            this.label = 1;
            obj = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        iyu0 iyu0Var = (iyu0) obj;
        ixt ixtVar = this.this$0;
        String str = this.$requestId;
        com.vk.superapp.base.js.bridge.b.p(ixtVar.b, new JsMethod("VKWebAppGetWorkoutsPermissions"), new GetWorkoutsPermissions$Response(null, new GetWorkoutsPermissions$Response.Data(jyu0.e(iyu0Var) ? GetWorkoutsPermissions$Response.Data.PermissionState.GRANTED : iyu0Var.b ? GetWorkoutsPermissions$Response.Data.PermissionState.DISABLED_CAN_ASK : GetWorkoutsPermissions$Response.Data.PermissionState.DISABLED, iyu0Var.h.h(), true, Boolean.valueOf(iyu0Var.a), Boolean.valueOf(iyu0Var.c), str), str, 1, null), null, null, false, null, 60);
        return s3q0.a;
    }
}
