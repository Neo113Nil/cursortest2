package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WorkerWrapper.kt */
@b6l(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
/* loaded from: classes.dex */
public final class xyx0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uyx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyx0(uyx0 uyx0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uyx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return uyx0.a(this.this$0, this);
    }
}
