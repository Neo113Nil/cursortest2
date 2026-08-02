package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {515}, m = "tryAwaitRelease", v = 1)
/* loaded from: classes11.dex */
public final class m2d0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n2d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2d0(n2d0 n2d0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = n2d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h0(this);
    }
}
