package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipEditSdkInteractorImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.domain.ClipEditSdkInteractorImpl", f = "ClipEditSdkInteractorImpl.kt", l = {84}, m = "getAttachedVideoInfo-gIAlu-s")
/* loaded from: classes17.dex */
public final class nsc extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tsc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsc(tsc tscVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
