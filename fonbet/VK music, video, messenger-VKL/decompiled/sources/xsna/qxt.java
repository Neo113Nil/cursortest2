package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsHealthConnectDelegate$execute$1", f = "GetWorkoutsHealthConnectDelegate.kt", l = {127, 138, 139}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class qxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $requestId;
    Object L$0;
    int label;
    final /* synthetic */ xxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxt(xxt xxtVar, FragmentActivity fragmentActivity, String str, spj<? super qxt> spjVar) {
        super(1, spjVar);
        this.this$0 = xxtVar;
        this.$activity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new qxt(this.this$0, this.$activity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((qxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (xsna.xxt.c(r3, r6, r2, r30) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r3.a(r7, r30) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        if (r2 == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        iyu0 iyu0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ayu0 ayu0Var = this.this$0.g;
            FragmentActivity fragmentActivity = this.$activity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
            this.label = 1;
            b = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, this);
        } else if (i == 1) {
            kotlin.a.a(obj);
            b = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            iyu0Var = (iyu0) this.L$0;
            kotlin.a.a(obj);
            xxt xxtVar = this.this$0;
            FragmentActivity fragmentActivity2 = this.$activity;
            this.L$0 = null;
            this.label = 3;
        }
        iyu0Var = (iyu0) b;
        if (iyu0Var.h != MobileServicesType.GOOGLE_PLAY || !iyu0Var.b || iyu0Var.g != HealthConnectSdkStatus.AVAILABLE) {
            this.this$0.e.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), this.$requestId, 1, null));
            return s3q0.a;
        }
        d2w0 d2w0Var = this.this$0.i;
        SelectedDataSource selectedDataSource = SelectedDataSource.HEALTH_CONNECT;
        this.L$0 = iyu0Var;
        this.label = 2;
    }
}
