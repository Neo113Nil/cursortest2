package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BringIntoViewRequester.kt */
@b6l(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {102}, m = "bringIntoView", v = 1)
/* loaded from: classes11.dex */
public final class ad8 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bd8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad8(bd8 bd8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bd8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
