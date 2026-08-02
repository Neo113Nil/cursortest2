package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CoversCarousel.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt", f = "CoversCarousel.kt", l = {254, 259}, m = "scrollToTargetPage")
/* loaded from: classes3.dex */
public final class y3k extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public y3k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return w3k.d(null, 0, false, this);
    }
}
