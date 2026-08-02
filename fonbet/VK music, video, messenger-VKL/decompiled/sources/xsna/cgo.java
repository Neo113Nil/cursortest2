package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1076}, m = "awaitLongPressOrCancellation-rnUCldI", v = 1)
/* loaded from: classes11.dex */
public final class cgo extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public cgo() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lgo.d(null, 0L, this);
    }
}
