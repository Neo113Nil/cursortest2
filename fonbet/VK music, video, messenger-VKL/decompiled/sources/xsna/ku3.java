package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AskWorkoutPermissionHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.AskWorkoutPermissionHealthConnectDelegate$execute$1", f = "AskWorkoutPermissionHealthConnectDelegate.kt", l = {108, 112}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ku3 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;
    final /* synthetic */ ju3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku3(ju3 ju3Var, FragmentActivity fragmentActivity, spj<? super ku3> spjVar) {
        super(1, spjVar);
        this.this$0 = ju3Var;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ku3(this.this$0, this.$activity, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((ku3) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (xsna.ju3.c(r1, r3, r6, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        iyu0 iyu0Var = (iyu0) obj;
        if (iyu0Var.a) {
            this.this$0.d(iyu0Var);
        } else {
            ju3 ju3Var = this.this$0;
            FragmentActivity fragmentActivity2 = this.$activity;
            this.label = 2;
        }
        return s3q0.a;
    }
}
