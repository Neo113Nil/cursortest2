package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SelectionGestures.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {193, 232}, m = "touchSelectionSubsequentPress", v = 1)
/* loaded from: classes11.dex */
public final class cdi0 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public cdi0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return fdi0.b(null, null, null, 0, this);
    }
}
