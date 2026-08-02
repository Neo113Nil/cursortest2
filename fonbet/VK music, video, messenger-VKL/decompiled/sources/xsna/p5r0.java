package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UxPollsRepositoryImpl.kt */
@b6l(c = "com.vk.uxpolls.data.UxPollsRepositoryImpl", f = "UxPollsRepositoryImpl.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "clearTriggerFromCachedPolls")
/* loaded from: classes6.dex */
public final class p5r0 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t5r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5r0(t5r0 t5r0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t5r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t5r0.n(this.this$0, null, null, this);
    }
}
