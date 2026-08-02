package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1149}, m = "semanticsScrollBy-d-4ec7I", v = 1)
/* loaded from: classes11.dex */
public final class bhh0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public bhh0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ahh0.a(null, 0L, this);
    }
}
