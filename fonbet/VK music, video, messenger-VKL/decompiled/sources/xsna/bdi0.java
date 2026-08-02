package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SelectionGestures.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {141, 145}, m = "touchSelectionFirstPress", v = 1)
/* loaded from: classes11.dex */
public final class bdi0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public bdi0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return fdi0.d(null, null, null, this);
    }
}
