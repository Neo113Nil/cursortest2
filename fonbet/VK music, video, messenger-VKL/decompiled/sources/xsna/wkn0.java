package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.xkn0;

/* compiled from: SuspendingPointerInputFilter.kt */
@b6l(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {860}, m = "withTimeoutOrNull", v = 1)
/* loaded from: classes11.dex */
public final class wkn0<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xkn0.a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkn0(xkn0.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.L0(0L, null, this);
    }
}
