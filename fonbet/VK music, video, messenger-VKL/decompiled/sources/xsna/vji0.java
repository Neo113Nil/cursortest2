package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SendVkStepsUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.SendVkStepsUseCase", f = "SendVkStepsUseCase.kt", l = {125, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "processImportSteps")
/* loaded from: classes6.dex */
public final class vji0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tji0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vji0(tji0 tji0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tji0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
