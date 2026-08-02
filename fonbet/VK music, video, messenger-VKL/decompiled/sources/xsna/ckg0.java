package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RightClickGestures.kt */
@b6l(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", l = {45}, m = "awaitFirstRightClickDown", v = 1)
/* loaded from: classes11.dex */
public final class ckg0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ckg0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ahn.d(null, this);
    }
}
