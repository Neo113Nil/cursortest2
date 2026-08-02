package xsna;

import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;
import xsna.g0v;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsHealthConnectDelegate$checkHealthConnectPermissions$1", f = "GetWorkoutsHealthConnectDelegate.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class pxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;
    final /* synthetic */ xxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxt(xxt xxtVar, FragmentActivity fragmentActivity, spj<? super pxt> spjVar) {
        super(1, spjVar);
        this.this$0 = xxtVar;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new pxt(this.this$0, this.$activity, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((pxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Intent a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.g;
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
        if (epx.f(((iyu0) obj).f, g0v.b.a)) {
            xxt xxtVar = this.this$0;
            FragmentActivity fragmentActivity2 = (FragmentActivity) xxtVar.c.invoke();
            if (fragmentActivity2 != null) {
                xxtVar.d(fragmentActivity2);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                czu.a.getClass();
                a = new Intent(czu.b.b);
            } else {
                xxt xxtVar2 = this.this$0;
                a = xxtVar2.k.a(this.$activity, xxtVar2.l);
            }
            xxt xxtVar3 = this.this$0;
            FragmentActivity fragmentActivity3 = this.$activity;
            xwv0 xwv0Var = xxtVar3.d;
            if (xwv0Var != null) {
                xwv0Var.D1(xxtVar3.m);
            }
            fragmentActivity3.startActivityForResult(a, 101);
        }
        return s3q0.a;
    }
}
