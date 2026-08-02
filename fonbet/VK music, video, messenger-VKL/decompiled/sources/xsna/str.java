package xsna;

import com.ironsource.Ad;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Reduce.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = Ad.d)
/* loaded from: classes8.dex */
public final class str<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public str(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rsr.u(null, this);
    }
}
