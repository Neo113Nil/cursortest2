package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Response;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g0v;

/* compiled from: GetStepsPermissionsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsPermissionsHealthConnectDelegate$execute$1", f = "GetStepsPermissionsHealthConnectDelegate.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class uvt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ vvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvt(vvt vvtVar, FragmentActivity fragmentActivity, String str, spj<? super uvt> spjVar) {
        super(1, spjVar);
        this.this$0 = vvtVar;
        this.$fragmentActivity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new uvt(this.this$0, this.$fragmentActivity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((uvt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.e;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
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
        com.vk.superapp.base.js.bridge.b.p(this.this$0.b, new JsMethod("VKWebAppGetStepsPermissions"), new GetStepsPermissions$Response(null, new GetStepsPermissions$Response.Data(iyu0Var.a && epx.f(iyu0Var.f, g0v.b.a), iyu0Var.h.h(), true, this.$requestId), this.$requestId, 1, null), null, null, false, null, 60);
        return s3q0.a;
    }
}
