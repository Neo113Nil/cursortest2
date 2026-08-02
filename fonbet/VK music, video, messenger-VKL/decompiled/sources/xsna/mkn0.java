package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.wq2;

/* compiled from: SuspendAnimation.kt */
@b6l(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate", v = 1)
/* loaded from: classes11.dex */
public final class mkn0<T, V extends wq2> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public mkn0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return nkn0.b(null, null, 0L, null, this);
    }
}
