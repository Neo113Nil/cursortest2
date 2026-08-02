package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SingleProcessCoordinator.kt */
@b6l(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
/* loaded from: classes12.dex */
public final class pvj0<T> extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rvj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvj0(rvj0 rvj0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rvj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
