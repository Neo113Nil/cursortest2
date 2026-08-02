package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ForEachGesture.kt */
@b6l(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {84}, m = "awaitAllPointersUp", v = 1)
/* loaded from: classes11.dex */
public final class c7s extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public c7s() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d7s.b(null, null, this);
    }
}
