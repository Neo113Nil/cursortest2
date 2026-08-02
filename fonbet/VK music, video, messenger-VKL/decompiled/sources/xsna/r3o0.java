package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {410}, m = "waitForLongPress", v = 1)
/* loaded from: classes11.dex */
public final class r3o0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public r3o0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return z2o0.i(null, null, this);
    }
}
