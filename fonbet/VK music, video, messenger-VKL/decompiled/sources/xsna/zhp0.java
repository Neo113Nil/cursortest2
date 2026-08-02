package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TrackpadScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic", f = "TrackpadScrollingLogic.kt", l = {173, 190}, m = "dispatchTrackpadScroll", v = 1)
/* loaded from: classes11.dex */
public final class zhp0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yhp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhp0(yhp0 yhp0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yhp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return yhp0.c(this.this$0, null, null, this);
    }
}
