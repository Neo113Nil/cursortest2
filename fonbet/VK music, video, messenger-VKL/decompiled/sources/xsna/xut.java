package xsna;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.ApiException;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.infrastructure.exceptions.SyncAlreadyInProgressException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsGoogleFitDelegate$handleStepsSyncError$1", f = "GetStepsGoogleFitDelegate.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class xut extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ SelectedDataSource $selectedDataSource;
    final /* synthetic */ long $startTimestamp;
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ uut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xut(uut uutVar, Throwable th, long j, long j2, SelectedDataSource selectedDataSource, FragmentActivity fragmentActivity, spj<? super xut> spjVar) {
        super(1, spjVar);
        this.this$0 = uutVar;
        this.$throwable = th;
        this.$startTimestamp = j;
        this.$endTimestamp = j2;
        this.$selectedDataSource = selectedDataSource;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new xut(this.this$0, this.$throwable, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource, this.$activity, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((xut) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uut uutVar;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            String b = defpackage.j0.b("VKWebAppGetSteps", this.this$0.b);
            xgx0 xgx0Var = xgx0.a;
            String str = "TAG.handleStepsSyncError() -> throwable: " + this.$throwable.getMessage() + ", thread: " + Thread.currentThread().getName();
            xgx0Var.getClass();
            xgx0.b(str);
            if (this.this$0.e.k(this.$throwable) && (i = (uutVar = this.this$0).i) == 0) {
                uutVar.i = i + 1;
                long j = this.$startTimestamp;
                long j2 = this.$endTimestamp;
                SelectedDataSource selectedDataSource = this.$selectedDataSource;
                this.label = 1;
                if (uut.c(uutVar, b, j, j2, selectedDataSource, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Throwable th = this.$throwable;
                if (th instanceof SyncAlreadyInProgressException) {
                    wvp wvpVar = this.this$0.d;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, message, 1, null), null, null, 114686, null), b, 1, null));
                } else {
                    this.this$0.d.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, th.getMessage(), new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
                    if (this.$throwable instanceof ApiException) {
                        ay2.a(this.$activity);
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
