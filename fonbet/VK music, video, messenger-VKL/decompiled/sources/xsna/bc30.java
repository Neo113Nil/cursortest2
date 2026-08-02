package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MouseWheelScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollingLogic.kt", l = {201}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", v = 1)
/* loaded from: classes11.dex */
public final class bc30 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public bc30() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return xb30.d(null, null, null, null, null, 0L, this);
    }
}
