package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MessageViewsRepositoryImpl.kt */
@b6l(c = "com.vk.im.messageviews.impl.data.MessageViewsRepositoryImpl", f = "MessageViewsRepositoryImpl.kt", l = {32}, m = "loadViewedUsers")
/* loaded from: classes2.dex */
public final class pc20 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rc20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc20(rc20 rc20Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rc20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
