package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1172, 1213}, m = "awaitTouchSlopOrCancellation-jO51t88", v = 1)
/* loaded from: classes11.dex */
public final class ego extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public ego() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lgo.e(null, 0L, null, this);
    }
}
