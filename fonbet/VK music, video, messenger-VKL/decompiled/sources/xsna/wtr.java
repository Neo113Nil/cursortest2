package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Share.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", l = {326}, m = "stateIn")
/* loaded from: classes8.dex */
public final class wtr<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public wtr(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rsr.v(null, null, this);
    }
}
