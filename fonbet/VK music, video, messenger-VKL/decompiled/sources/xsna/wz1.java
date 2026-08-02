package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {727}, m = "restartable")
/* loaded from: classes17.dex */
public final class wz1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public wz1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d02.h(null, null, this);
    }
}
