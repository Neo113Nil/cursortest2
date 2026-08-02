package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Response;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsPermissionsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsPermissionsGoogleFitDelegate$execute$1", f = "GetStepsPermissionsGoogleFitDelegate.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class svt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ String $requestId;
    Object L$0;
    int label;
    final /* synthetic */ tvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svt(tvt tvtVar, FragmentActivity fragmentActivity, String str, spj<? super svt> spjVar) {
        super(1, spjVar);
        this.this$0 = tvtVar;
        this.$fragmentActivity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new svt(this.this$0, this.$fragmentActivity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((svt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MobileServicesType mobileServicesType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            MobileServicesType h = this.this$0.e.h(this.$fragmentActivity);
            ayu0 ayu0Var = this.this$0.e;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
            this.L$0 = h;
            this.label = 1;
            Object b = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            mobileServicesType = h;
            obj = b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mobileServicesType = (MobileServicesType) this.L$0;
            kotlin.a.a(obj);
        }
        iyu0 iyu0Var = (iyu0) obj;
        com.vk.superapp.base.js.bridge.b.p(this.this$0.b, new JsMethod("VKWebAppGetStepsPermissions"), new GetStepsPermissions$Response(null, new GetStepsPermissions$Response.Data(jyu0.b(iyu0Var) || jyu0.d(iyu0Var), mobileServicesType.h(), true, this.$requestId), this.$requestId, 1, null), null, null, false, null, 60);
        return s3q0.a;
    }
}
