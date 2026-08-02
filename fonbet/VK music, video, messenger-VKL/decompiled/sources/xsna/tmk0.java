package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DragCancelledAnimation.kt */
@b6l(c = "com.vk.core.compose.reorder.SpringDragCancelledAnimation", f = "DragCancelledAnimation.kt", l = {30, 31}, m = "dragCancelled-d-4ec7I")
/* loaded from: classes17.dex */
public final class tmk0 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ umk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk0(umk0 umk0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = umk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0L, this);
    }
}
