package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SendTestPushUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.data.SendTestPushUseCase", f = "SendTestPushUseCase.kt", l = {26, 30, 39}, m = "invoke")
/* loaded from: classes5.dex */
public final class lji0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mji0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lji0(mji0 mji0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mji0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
