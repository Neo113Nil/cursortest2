package xsna;

import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AskHealthConnectWorkoutPermissionsCommand.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.AskHealthConnectWorkoutPermissionsCommand$showHealthConnectSettings$1", f = "AskHealthConnectWorkoutPermissionsCommand.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class cu3 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ yt3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu3(yt3 yt3Var, spj<? super cu3> spjVar) {
        super(1, spjVar);
        this.this$0 = yt3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new cu3(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((cu3) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HealthConnectSdkStatus healthConnectSdkStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yt3 yt3Var = this.this$0;
            this.label = 1;
            obj = yt3Var.e(this);
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
        if (iyu0Var == null || (healthConnectSdkStatus = iyu0Var.g) == null) {
            return s3q0.a;
        }
        if (healthConnectSdkStatus == HealthConnectSdkStatus.AVAILABLE) {
            yt3 yt3Var2 = this.this$0;
            yt3Var2.i.a(yt3Var2.f.g());
        } else {
            this.this$0.i();
        }
        return s3q0.a;
    }
}
