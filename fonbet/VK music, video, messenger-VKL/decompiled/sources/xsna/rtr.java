package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Reduce.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
/* loaded from: classes8.dex */
public final class rtr<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public rtr(spj<? super rtr> spjVar) {
        super(spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rsr.p(null, this);
    }
}
