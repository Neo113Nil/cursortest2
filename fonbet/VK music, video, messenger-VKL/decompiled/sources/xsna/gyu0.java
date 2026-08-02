package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthPermissionsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestGoogleFitPermissionsInternal$3", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class gyu0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onDenied;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyu0(gzs<s3q0> gzsVar, spj<? super gyu0> spjVar) {
        super(1, spjVar);
        this.$onDenied = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new gyu0(this.$onDenied, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((gyu0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xgx0.a.getClass();
        xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> onDenied.invoke()");
        this.$onDenied.invoke();
        return s3q0.a;
    }
}
