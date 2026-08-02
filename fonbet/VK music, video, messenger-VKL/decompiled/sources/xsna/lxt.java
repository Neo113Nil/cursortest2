package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;

/* compiled from: GetWorkoutsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsGoogleFitDelegate$execute$1", f = "GetWorkoutsGoogleFitDelegate.kt", l = {JsonToken.END_ARRAY, 100}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class lxt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $requestId;
    Object L$0;
    int label;
    final /* synthetic */ mxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxt(mxt mxtVar, FragmentActivity fragmentActivity, String str, spj<? super lxt> spjVar) {
        super(1, spjVar);
        this.this$0 = mxtVar;
        this.$activity = fragmentActivity;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new lxt(this.this$0, this.$activity, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((lxt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r2 == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a9  */
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
            ayu0 ayu0Var = this.this$0.f;
            FragmentActivity fragmentActivity = this.$activity;
            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
            this.label = 1;
            b = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iyu0Var = (iyu0) this.L$0;
                kotlin.a.a(obj);
                mxt mxtVar = this.this$0;
                FragmentActivity fragmentActivity2 = this.$activity;
                String b2 = defpackage.j0.b("VKWebAppGetWorkouts", mxtVar.b);
                if (!jyu0.e(iyu0Var)) {
                    mxtVar.c(fragmentActivity2);
                } else if (iyu0Var.h == MobileServicesType.GOOGLE_PLAY) {
                    ayu0 ayu0Var2 = mxtVar.f;
                    kxu0 kxu0Var = new kxu0();
                    kxu0Var.b = fragmentActivity2;
                    ayu0Var2.e(kxu0Var, new u0d(mxtVar, 2), new td8(mxtVar, 2), RequestedMiniApp.VK_WORKOUT);
                } else {
                    mxtVar.d.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b2, 1, null));
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
            b = obj;
        }
        iyu0 iyu0Var2 = (iyu0) b;
        if (!iyu0Var2.b) {
            this.this$0.d.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), this.$requestId, 1, null));
            return s3q0.a;
        }
        d2w0 d2w0Var = this.this$0.g;
        SelectedDataSource selectedDataSource = SelectedDataSource.GOOGLE_FIT;
        this.L$0 = iyu0Var2;
        this.label = 2;
        if (d2w0Var.a(selectedDataSource, this) != coroutineSingletons) {
            iyu0Var = iyu0Var2;
            mxt mxtVar2 = this.this$0;
            FragmentActivity fragmentActivity22 = this.$activity;
            String b22 = defpackage.j0.b("VKWebAppGetWorkouts", mxtVar2.b);
            if (!jyu0.e(iyu0Var)) {
            }
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}
