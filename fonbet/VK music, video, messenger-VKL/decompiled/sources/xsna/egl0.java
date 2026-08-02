package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StopStepsPermissionsDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.StopStepsPermissionsDelegate$execute$1", f = "StopStepsPermissionsDelegate.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class egl0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ fgl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egl0(fgl0 fgl0Var, FragmentActivity fragmentActivity, String str, spj<? super egl0> spjVar) {
        super(1, spjVar);
        this.this$0 = fgl0Var;
        this.$fragmentActivity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new egl0(this.this$0, this.$fragmentActivity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((egl0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.e;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
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
        if (((iyu0) b).d) {
            fgl0 fgl0Var = this.this$0;
            ayu0 ayu0Var2 = fgl0Var.e;
            FragmentActivity fragmentActivity2 = this.$fragmentActivity;
            kxu0 kxu0Var = new kxu0();
            kxu0Var.b = fragmentActivity2;
            String str = this.$requestId;
            ayu0Var2.n(kxu0Var, new cg1(25, fgl0Var, str), new xm6(13, fgl0Var, str));
        } else {
            this.this$0.d.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), this.$requestId, 1, null));
        }
        return s3q0.a;
    }
}
