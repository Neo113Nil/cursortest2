package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MessageViewsUseCase.kt */
@b6l(c = "com.vk.im.messageviews.impl.domain.MessageViewsUseCase", f = "MessageViewsUseCase.kt", l = {10, 11}, m = "loadViewedUsers")
/* loaded from: classes2.dex */
public final class wc20 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xc20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc20(xc20 xc20Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xc20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, 0L, 0, this);
    }
}
