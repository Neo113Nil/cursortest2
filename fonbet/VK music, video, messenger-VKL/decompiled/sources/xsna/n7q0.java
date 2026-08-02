package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UpdatableAnimationState.kt */
@b6l(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 151}, m = "animateToZero", v = 1)
/* loaded from: classes11.dex */
public final class n7q0 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o7q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7q0(o7q0 o7q0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = o7q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
