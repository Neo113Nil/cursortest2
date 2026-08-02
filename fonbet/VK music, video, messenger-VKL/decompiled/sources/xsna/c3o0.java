package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {236}, m = "consumeUntilUp", v = 1)
/* loaded from: classes11.dex */
public final class c3o0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public c3o0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return z2o0.d(null, this);
    }
}
