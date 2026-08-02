package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InvalidationTracker.kt */
@b6l(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {342}, m = "stopTrackingTable")
/* loaded from: classes12.dex */
public final class xqp0 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sqp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqp0(sqp0 sqp0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sqp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return sqp0.d(this.this$0, null, 0, this);
    }
}
