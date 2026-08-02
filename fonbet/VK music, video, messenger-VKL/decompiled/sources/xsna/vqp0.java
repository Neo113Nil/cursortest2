package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InvalidationTracker.kt */
@b6l(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {412}, m = "notifyInvalidation")
/* loaded from: classes.dex */
public final class vqp0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sqp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqp0(sqp0 sqp0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sqp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return sqp0.b(this.this$0, this);
    }
}
