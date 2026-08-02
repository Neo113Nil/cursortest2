package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MessageViewsRepositoryImpl.kt */
@b6l(c = "com.vk.im.messageviews.impl.data.MessageViewsRepositoryImpl", f = "MessageViewsRepositoryImpl.kt", l = {21}, m = "loadViewsHistory")
/* loaded from: classes2.dex */
public final class qc20 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rc20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc20(rc20 rc20Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rc20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, 0L, 0, 0, this);
    }
}
