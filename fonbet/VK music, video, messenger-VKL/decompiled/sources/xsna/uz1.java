package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {716}, m = "restartable", v = 1)
/* loaded from: classes11.dex */
public final class uz1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public uz1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return nzo.b(null, null, this);
    }
}
