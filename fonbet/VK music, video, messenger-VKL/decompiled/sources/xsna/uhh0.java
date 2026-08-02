package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {888}, m = "doFlingAnimation-QWom1Mo", v = 1)
/* loaded from: classes11.dex */
public final class uhh0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zhh0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhh0(zhh0 zhh0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zhh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, this);
    }
}
