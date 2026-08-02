package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SingleProcessCoordinator.kt */
@b6l(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
/* loaded from: classes.dex */
public final class ovj0<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rvj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovj0(rvj0 rvj0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rvj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
