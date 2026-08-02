package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthPermissionsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getHealthConnectSdkStatus$1", f = "VkHealthPermissionsManagerImpl.kt", l = {379}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class cyu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ izs<HealthConnectSdkStatus, s3q0> $statusListener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cyu0(Context context, izs<? super HealthConnectSdkStatus, s3q0> izsVar, spj<? super cyu0> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$statusListener = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cyu0(this.$context, this.$statusListener, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cyu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            pxu0 pxu0Var = pxu0.a;
            Context context = this.$context;
            this.label = 1;
            obj = pxu0Var.c(context, 4000L, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$statusListener.invoke((HealthConnectSdkStatus) obj);
        return s3q0.a;
    }
}
