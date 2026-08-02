package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt", f = "InternalSlider.kt", l = {606}, m = "awaitSlop-8vUncbI")
/* loaded from: classes17.dex */
public final class kmx extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public kmx() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return nmx.j(null, 0L, 0, this);
    }
}
