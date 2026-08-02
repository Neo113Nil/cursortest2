package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Errors.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
/* loaded from: classes11.dex */
public final class ctr<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ctr() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rsr.j(null, null, this);
    }
}
