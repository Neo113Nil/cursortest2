package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ConnectionPoolImpl.kt */
@b6l(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquire")
/* loaded from: classes12.dex */
public final class xub0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cvb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xub0(cvb0 cvb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cvb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
