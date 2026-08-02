package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {529}, m = "anchoredDrag")
/* loaded from: classes17.dex */
public final class g02 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e12<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g02(e12 e12Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e12Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
