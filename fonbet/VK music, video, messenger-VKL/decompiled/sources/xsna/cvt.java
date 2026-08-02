package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g0v;

/* compiled from: GetStepsHealthConnectCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectCommand$checkHealthConnectPermissions$1", f = "GetStepsHealthConnectCommand.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class cvt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ dvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvt(dvt dvtVar, spj<? super cvt> spjVar) {
        super(1, spjVar);
        this.this$0 = dvtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new cvt(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((cvt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g0v g0vVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Context mo2getContext = this.this$0.m.mo2getContext();
            if (mo2getContext == null) {
                return s3q0.a;
            }
            dvt dvtVar = this.this$0;
            this.label = 1;
            obj = dvtVar.n(mo2getContext, null, this);
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
        if (iyu0Var == null || (g0vVar = iyu0Var.f) == null) {
            return s3q0.a;
        }
        if (g0vVar.equals(g0v.b.a)) {
            dvt dvtVar2 = this.this$0;
            dvtVar2.k(dvtVar2.i, dvtVar2.j, SelectedDataSource.HEALTH_CONNECT);
        } else {
            dvt dvtVar3 = this.this$0;
            dvtVar3.s.a(dvtVar3.r);
        }
        return s3q0.a;
    }
}
