package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {378, 392}, m = "waitForUpOrCancellation", v = 1)
/* loaded from: classes11.dex */
public final class t3o0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public t3o0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return z2o0.j(null, null, this);
    }
}
