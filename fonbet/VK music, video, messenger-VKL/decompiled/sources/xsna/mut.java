package xsna;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.infrastructure.exceptions.SyncAlreadyInProgressException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bex0;

/* compiled from: GetStepsCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsCommand$handleStepsSyncError$1", f = "GetStepsCommand.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class mut extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ SelectedDataSource $selectedDataSource;
    final /* synthetic */ long $startTimestamp;
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ kut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mut(Throwable th, kut kutVar, long j, long j2, SelectedDataSource selectedDataSource, spj<? super mut> spjVar) {
        super(1, spjVar);
        this.$throwable = th;
        this.this$0 = kutVar;
        this.$startTimestamp = j;
        this.$endTimestamp = j2;
        this.$selectedDataSource = selectedDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new mut(this.$throwable, this.this$0, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((mut) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kut kutVar;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            xgx0 xgx0Var = xgx0.a;
            String str = "VkStepsGetStepsCommand.handleStepsSyncError() -> throwable: " + this.$throwable.getMessage() + ", thread: " + Thread.currentThread().getName();
            xgx0Var.getClass();
            xgx0.b(str);
            if (this.this$0.f.k(this.$throwable) && (i = (kutVar = this.this$0).h) == 0) {
                kutVar.h = i + 1;
                long j = this.$startTimestamp;
                long j2 = this.$endTimestamp;
                SelectedDataSource selectedDataSource = this.$selectedDataSource;
                this.label = 1;
                if (kutVar.e(j, j2, selectedDataSource, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Throwable th = this.$throwable;
                if (th instanceof SyncAlreadyInProgressException) {
                    r6y r6yVar = this.this$0.b;
                    if (r6yVar != null) {
                        bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.CUSTOM_ERROR, th.getMessage(), null, null, 56);
                    }
                } else {
                    r6y r6yVar2 = this.this$0.b;
                    if (r6yVar2 != null) {
                        bex0.a.a(r6yVar2, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.UNKNOWN_ERROR, th.getMessage(), null, null, 56);
                    }
                    if (this.$throwable instanceof ApiException) {
                        Context mo2getContext = this.this$0.e.mo2getContext();
                        if (mo2getContext == null) {
                            return s3q0.a;
                        }
                        ay2.a(mo2getContext);
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
