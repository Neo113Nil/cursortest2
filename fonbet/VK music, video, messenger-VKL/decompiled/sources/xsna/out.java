package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetStepsCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsCommand", f = "GetStepsCommand.kt", l = {163}, m = "trySendSteps$suspendImpl")
/* loaded from: classes6.dex */
public final class out extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public out(kut kutVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kutVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kut.m(this.this$0, 0L, 0L, null, this);
    }
}
