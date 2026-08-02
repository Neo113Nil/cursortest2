package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt", f = "InternalSlider.kt", l = {986, 1024}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes17.dex */
public final class jmx extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public jmx() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return nmx.k(null, 0L, 0, null, this);
    }
}
