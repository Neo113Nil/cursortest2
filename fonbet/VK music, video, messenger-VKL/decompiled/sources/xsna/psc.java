package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipEditSdkInteractorImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.domain.ClipEditSdkInteractorImpl", f = "ClipEditSdkInteractorImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "getTrendingHashtags-IoAF18A")
/* loaded from: classes17.dex */
public final class psc extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tsc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psc(tsc tscVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
