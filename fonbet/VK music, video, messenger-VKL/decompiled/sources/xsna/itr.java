package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Limit.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes8.dex */
public final class itr<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public itr(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ktr.a(null, null, null, this);
    }
}
