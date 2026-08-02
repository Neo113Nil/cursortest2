package xsna;

import com.huawei.hms.hihealth.result.HealthKitAuthResult;
import com.huawei.hms.support.account.AccountAuthManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthHuaweiHealthPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHuaweiHealthPermissionsProvider$onActivityResult$4", f = "VkHealthHuaweiHealthPermissionsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class xxu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ HealthKitAuthResult $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxu0(HealthKitAuthResult healthKitAuthResult, spj<? super xxu0> spjVar) {
        super(2, spjVar);
        this.$result = healthKitAuthResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xxu0(this.$result, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xxu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yxu0 yxu0Var = yxu0.a;
        String unionId = this.$result.getAuthAccount().getUnionId();
        yxu0Var.getClass();
        tw8 tw8Var = yxu0.c;
        qcy<Object> qcyVar = yxu0.b[0];
        tw8Var.g(unionId);
        yxu0Var.g(AccountAuthManager.containScopes(this.$result.getAuthAccount(), yxu0.i));
        return s3q0.a;
    }
}
