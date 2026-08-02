package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {523}, m = "anchoredDrag", v = 1)
/* loaded from: classes11.dex */
public final class h02 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c12<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h02(c12 c12Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c12Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
