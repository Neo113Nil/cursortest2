package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;

/* compiled from: GetStepsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsHealthConnectDelegate$showHealthConnectSettings$1", f = "GetStepsHealthConnectDelegate.kt", l = {388}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ovt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;
    final /* synthetic */ kvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(kvt kvtVar, FragmentActivity fragmentActivity, spj<? super ovt> spjVar) {
        super(1, spjVar);
        this.this$0 = kvtVar;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ovt(this.this$0, this.$activity, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((ovt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.f;
            FragmentActivity fragmentActivity = this.$activity;
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
        if (((iyu0) obj).g == HealthConnectSdkStatus.AVAILABLE) {
            czu.a.getClass();
            Intent intent = new Intent(czu.b.b);
            kvt kvtVar = this.this$0;
            FragmentActivity fragmentActivity2 = this.$activity;
            xwv0 xwv0Var = kvtVar.c;
            if (xwv0Var != null) {
                xwv0Var.D1(kvtVar.n);
            }
            fragmentActivity2.startActivityForResult(intent, 102);
        } else {
            kvt kvtVar2 = this.this$0;
            zrp zrpVar = kvt.o;
            kvtVar2.k();
        }
        return s3q0.a;
    }
}
