package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UxPollsRepositoryImpl.kt */
@b6l(c = "com.vk.uxpolls.data.UxPollsRepositoryImpl", f = "UxPollsRepositoryImpl.kt", l = {25}, m = "getPolls")
/* loaded from: classes6.dex */
public final class s5r0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t5r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5r0(t5r0 t5r0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t5r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.o(this);
    }
}
