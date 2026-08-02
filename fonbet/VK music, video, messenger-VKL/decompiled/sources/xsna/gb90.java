package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PagerIndicator.kt */
@b6l(c = "com.vk.clips.design.compose.pager.PagerIndicatorKt", f = "PagerIndicator.kt", l = {151, 153}, m = "updateState")
/* loaded from: classes16.dex */
public final class gb90 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public gb90() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return hb90.b(0, false, null, 0, this);
    }
}
