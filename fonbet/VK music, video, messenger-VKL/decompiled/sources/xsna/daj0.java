package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SharedFlow.kt */
@b6l(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
/* loaded from: classes11.dex */
public final class daj0<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ caj0<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daj0(caj0<T> caj0Var, spj<? super daj0> spjVar) {
        super(spjVar);
        this.this$0 = caj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return caj0.k(this.this$0, null, this);
    }
}
