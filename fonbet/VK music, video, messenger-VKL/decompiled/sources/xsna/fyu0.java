package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthPermissionsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestGoogleFitPermissionsInternal$2", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class fyu0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ gzs<s3q0> $onGranted;
    final /* synthetic */ RequestedMiniApp $requestedMiniApp;
    int label;
    final /* synthetic */ dyu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyu0(dyu0 dyu0Var, Context context, RequestedMiniApp requestedMiniApp, gzs<s3q0> gzsVar, spj<? super fyu0> spjVar) {
        super(1, spjVar);
        this.this$0 = dyu0Var;
        this.$context = context;
        this.$requestedMiniApp = requestedMiniApp;
        this.$onGranted = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new fyu0(this.this$0, this.$context, this.$requestedMiniApp, this.$onGranted, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((fyu0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xgx0.a.getClass();
        xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> onGranted.invoke()");
        this.this$0.s(this.$context, this.$requestedMiniApp);
        this.$onGranted.invoke();
        return s3q0.a;
    }
}
