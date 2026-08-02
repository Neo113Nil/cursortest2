package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;

/* compiled from: AskWorkoutPermissionHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.AskWorkoutPermissionHealthConnectDelegate$showHealthConnectSettings$1", f = "AskWorkoutPermissionHealthConnectDelegate.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class mu3 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;
    final /* synthetic */ ju3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(ju3 ju3Var, FragmentActivity fragmentActivity, spj<? super mu3> spjVar) {
        super(1, spjVar);
        this.this$0 = ju3Var;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new mu3(this.this$0, this.$activity, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((mu3) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.f;
            FragmentActivity fragmentActivity = this.$activity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
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
            ju3 ju3Var = this.this$0;
            FragmentActivity fragmentActivity2 = this.$activity;
            xwv0 xwv0Var = ju3Var.d;
            if (xwv0Var != null) {
                xwv0Var.D1(ju3Var.i);
            }
            fragmentActivity2.startActivityForResult(intent, 102);
        } else {
            this.this$0.h(false);
        }
        return s3q0.a;
    }
}
