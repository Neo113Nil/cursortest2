package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {921}, m = "awaitAllPointersUpWithSlopDetection", v = 1)
/* loaded from: classes11.dex */
public final class zfo extends ContinuationImpl {
    float F$0;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public zfo() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lgo.a(null, null, null, this);
    }
}
