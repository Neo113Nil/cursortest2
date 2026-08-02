package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipEditSdkInteractorImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.domain.ClipEditSdkInteractorImpl", f = "ClipEditSdkInteractorImpl.kt", l = {27}, m = "uploadCover-gIAlu-s")
/* loaded from: classes17.dex */
public final class ssc extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tsc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssc(tsc tscVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(null, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
