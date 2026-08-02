package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SessionFirelogPublisher.kt */
@b6l(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {100}, m = "shouldLogSession")
/* loaded from: classes.dex */
public final class qti0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pti0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qti0(pti0 pti0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pti0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return pti0.b(this.this$0, this);
    }
}
