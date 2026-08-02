package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {112}, m = "drag-jO51t88", v = 1)
/* loaded from: classes11.dex */
public final class igo extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public igo() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lgo.h(null, 0L, null, this);
    }
}
