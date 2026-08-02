package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl", f = "MusicKidsModeManagerImpl.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "openChangePinCodeDialog")
/* loaded from: classes3.dex */
public final class em40 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zl40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em40(zl40 zl40Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zl40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, this);
    }
}
