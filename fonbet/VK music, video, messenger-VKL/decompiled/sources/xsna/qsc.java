package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipEditSdkInteractorImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.domain.ClipEditSdkInteractorImpl", f = "ClipEditSdkInteractorImpl.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 123}, m = "openProfile-0E7RQCE")
/* loaded from: classes17.dex */
public final class qsc extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tsc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsc(tsc tscVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable d = this.this$0.d(null, null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
