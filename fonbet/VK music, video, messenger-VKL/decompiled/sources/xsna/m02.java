package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {564}, m = "anchoredDrag")
/* loaded from: classes11.dex */
public final class m02 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d12<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(d12 d12Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d12Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
