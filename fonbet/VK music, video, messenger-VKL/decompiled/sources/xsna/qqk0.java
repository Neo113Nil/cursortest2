package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StartPushServiceUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.StartPushServiceUseCase", f = "StartPushServiceUseCase.kt", l = {65, 68}, m = "safeStartBackgroundService")
/* loaded from: classes5.dex */
public final class qqk0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pqk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqk0(pqk0 pqk0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pqk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return pqk0.a(this.this$0, null, this);
    }
}
