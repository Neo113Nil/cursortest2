package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsHealthConnectCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectCommand$showHealthConnectSettings$1", f = "GetStepsHealthConnectCommand.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class fvt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ dvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvt(dvt dvtVar, spj<? super fvt> spjVar) {
        super(1, spjVar);
        this.this$0 = dvtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new fvt(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((fvt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HealthConnectSdkStatus healthConnectSdkStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dvt dvtVar = this.this$0;
            Context requireContext = dvtVar.m.requireContext();
            this.label = 1;
            obj = dvtVar.n(requireContext, null, this);
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
            dvt dvtVar2 = this.this$0;
            dvtVar2.t.a(dvtVar2.n.g());
        } else {
            this.this$0.j();
        }
        return s3q0.a;
    }
}
