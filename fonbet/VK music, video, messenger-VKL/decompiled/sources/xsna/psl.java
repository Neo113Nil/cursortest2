package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Delay.kt */
@b6l(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
/* loaded from: classes8.dex */
public final class psl extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public psl(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return qsl.a(this);
    }
}
