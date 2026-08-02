package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Response;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g0v;

/* compiled from: GetWorkoutPermissionsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutPermissionsHealthConnectDelegate$execute$1", f = "GetWorkoutPermissionsHealthConnectDelegate.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class jxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ kxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxt(kxt kxtVar, FragmentActivity fragmentActivity, String str, spj<? super jxt> spjVar) {
        super(1, spjVar);
        this.this$0 = kxtVar;
        this.$activity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new jxt(this.this$0, this.$activity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((jxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.e;
            FragmentActivity fragmentActivity = this.$activity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
            this.label = 1;
            b = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = obj;
        }
        iyu0 iyu0Var = (iyu0) b;
        kxt kxtVar = this.this$0;
        String str = this.$requestId;
        com.vk.superapp.base.js.bridge.b bVar = kxtVar.b;
        JsMethod jsMethod = new JsMethod("VKWebAppGetWorkoutsPermissions");
        g0v g0vVar = iyu0Var.f;
        boolean z = iyu0Var.a;
        com.vk.superapp.base.js.bridge.b.p(bVar, jsMethod, new GetWorkoutsPermissions$Response(null, new GetWorkoutsPermissions$Response.Data(iyu0Var.g != HealthConnectSdkStatus.AVAILABLE ? GetWorkoutsPermissions$Response.Data.PermissionState.DISABLED : epx.f(g0vVar, g0v.b.a) && z ? GetWorkoutsPermissions$Response.Data.PermissionState.GRANTED : GetWorkoutsPermissions$Response.Data.PermissionState.DISABLED_CAN_ASK, iyu0Var.h.h(), true, Boolean.valueOf(z), null, str, 16, null), str, 1, null), null, null, false, null, 60);
        return s3q0.a;
    }
}
