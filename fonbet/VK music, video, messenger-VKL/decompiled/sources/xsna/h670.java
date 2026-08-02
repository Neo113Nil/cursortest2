package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NonTouchScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogic", f = "NonTouchScrollingLogic.kt", l = {55}, m = "userScroll$foundation", v = 1)
/* loaded from: classes11.dex */
public final class h670 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j670 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h670(j670 j670Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = j670Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
